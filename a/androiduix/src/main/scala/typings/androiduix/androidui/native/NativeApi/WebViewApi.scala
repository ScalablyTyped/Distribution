package typings.androiduix.androidui.native.NativeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewApi extends js.Object {
  def createWebView(viewHash: Double): Unit
  def destroyWebView(viewHash: Double): Unit
  def webViewBoundChange(viewHash: Double, left: Double, top: Double, right: Double, bottom: Double): Unit
  def webViewGoBack(viewHash: Double): Unit
  def webViewLoadUrl(viewHash: Double, url: String): Unit
  def webViewReload(viewHash: Double): Unit
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
}

