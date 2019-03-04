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
    createWebView: js.Function1[scala.Double, scala.Unit],
    destroyWebView: js.Function1[scala.Double, scala.Unit],
    webViewBoundChange: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    webViewGoBack: js.Function1[scala.Double, scala.Unit],
    webViewLoadUrl: js.Function2[scala.Double, java.lang.String, scala.Unit],
    webViewReload: js.Function1[scala.Double, scala.Unit]
  ): WebViewApi = {
    val __obj = js.Dynamic.literal(createWebView = createWebView, destroyWebView = destroyWebView, webViewBoundChange = webViewBoundChange, webViewGoBack = webViewGoBack, webViewLoadUrl = webViewLoadUrl, webViewReload = webViewReload)
  
    __obj.asInstanceOf[WebViewApi]
  }
}

