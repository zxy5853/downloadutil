package com.szx.downloadutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qisheng.rxnet.RxNet
import com.qisheng.rxnet.callback.DownloadCallback
import io.reactivex.disposables.Disposable
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RxNet.download("http//:ssss", "aaa/a.txt", object : DownloadCallback {
            override fun onStart(d: Disposable?) {

            }

            override fun onProgress(totalByte: Long, currentByte: Long, progress: Int) {

            }

            override fun onFinish(file: File?) {

            }

            override fun onError(msg: String?) {

            }

        })
    }
}