package typings.androiduix.androidui.native.NativeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewApi extends js.Object {
  def createWebView(viewHash: Double): Unit = js.native
  def destroyWebView(viewHash: Double): Unit = js.native
  def webViewBoundChange(viewHash: Double, left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  def webViewGoBack(viewHash: Double): Unit = js.native
  def webViewLoadUrl(viewHash: Double, url: String): Unit = js.native
  def webViewReload(viewHash: Double): Unit = js.native
}

object WebViewApi {
  @scala.inline
  def apply(
    createWebView: Double => Unit,
    destroyWebView: Double => Unit,
    webViewBoundChange: (Double, Double, Double, Double, Double) => Unit,
    webViewGoBack: Double => Unit,
    webViewLoadUrl: (Double, String) => Unit,
    webViewReload: Double => Unit
  ): WebViewApi = {
    val __obj = js.Dynamic.literal(createWebView = js.Any.fromFunction1(createWebView), destroyWebView = js.Any.fromFunction1(destroyWebView), webViewBoundChange = js.Any.fromFunction5(webViewBoundChange), webViewGoBack = js.Any.fromFunction1(webViewGoBack), webViewLoadUrl = js.Any.fromFunction2(webViewLoadUrl), webViewReload = js.Any.fromFunction1(webViewReload))
    __obj.asInstanceOf[WebViewApi]
  }
  @scala.inline
  implicit class WebViewApiOps[Self <: WebViewApi] (val x: Self) extends AnyVal {
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
    def setCreateWebView(value: Double => Unit): Self = this.set("createWebView", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroyWebView(value: Double => Unit): Self = this.set("destroyWebView", js.Any.fromFunction1(value))
    @scala.inline
    def setWebViewBoundChange(value: (Double, Double, Double, Double, Double) => Unit): Self = this.set("webViewBoundChange", js.Any.fromFunction5(value))
    @scala.inline
    def setWebViewGoBack(value: Double => Unit): Self = this.set("webViewGoBack", js.Any.fromFunction1(value))
    @scala.inline
    def setWebViewLoadUrl(value: (Double, String) => Unit): Self = this.set("webViewLoadUrl", js.Any.fromFunction2(value))
    @scala.inline
    def setWebViewReload(value: Double => Unit): Self = this.set("webViewReload", js.Any.fromFunction1(value))
  }
  
}

