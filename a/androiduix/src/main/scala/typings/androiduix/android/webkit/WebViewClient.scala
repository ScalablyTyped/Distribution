package typings.androiduix.android.webkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewClient extends js.Object {
  def onPageFinished(view: WebView, url: String): Unit = js.native
  def onReceivedTitle(view: WebView, title: String): Unit = js.native
}

object WebViewClient {
  @scala.inline
  def apply(onPageFinished: (WebView, String) => Unit, onReceivedTitle: (WebView, String) => Unit): WebViewClient = {
    val __obj = js.Dynamic.literal(onPageFinished = js.Any.fromFunction2(onPageFinished), onReceivedTitle = js.Any.fromFunction2(onReceivedTitle))
    __obj.asInstanceOf[WebViewClient]
  }
  @scala.inline
  implicit class WebViewClientOps[Self <: WebViewClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnPageFinished(value: (WebView, String) => Unit): Self = this.set("onPageFinished", js.Any.fromFunction2(value))
    @scala.inline
    def setOnReceivedTitle(value: (WebView, String) => Unit): Self = this.set("onReceivedTitle", js.Any.fromFunction2(value))
  }
  
}

