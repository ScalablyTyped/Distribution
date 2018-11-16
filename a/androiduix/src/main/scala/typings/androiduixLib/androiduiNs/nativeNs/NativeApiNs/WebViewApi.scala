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

