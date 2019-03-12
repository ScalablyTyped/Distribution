package typings
package androiduixLib.androiduiNs.nativeNs.NativeApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebViewApi extends js.Object {
  def createWebView(viewHash: scala.Double): scala.Unit
  def destroyWebView(viewHash: scala.Double): scala.Unit
  def webViewBoundChange(
    viewHash: scala.Double,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double
  ): scala.Unit
  def webViewGoBack(viewHash: scala.Double): scala.Unit
  def webViewLoadUrl(viewHash: scala.Double, url: java.lang.String): scala.Unit
  def webViewReload(viewHash: scala.Double): scala.Unit
}

object WebViewApi {
  @scala.inline
  def apply(
    createWebView: scala.Double => scala.Unit,
    destroyWebView: scala.Double => scala.Unit,
    webViewBoundChange: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    webViewGoBack: scala.Double => scala.Unit,
    webViewLoadUrl: (scala.Double, java.lang.String) => scala.Unit,
    webViewReload: scala.Double => scala.Unit
  ): WebViewApi = {
    val __obj = js.Dynamic.literal(createWebView = js.Any.fromFunction1(createWebView), destroyWebView = js.Any.fromFunction1(destroyWebView), webViewBoundChange = js.Any.fromFunction5(webViewBoundChange), webViewGoBack = js.Any.fromFunction1(webViewGoBack), webViewLoadUrl = js.Any.fromFunction2(webViewLoadUrl), webViewReload = js.Any.fromFunction1(webViewReload))
  
    __obj.asInstanceOf[WebViewApi]
  }
}

