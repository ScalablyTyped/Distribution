package typings.androiduix.androidNs.webkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.webkit.WebViewClient")
@js.native
class WebViewClient () extends js.Object {
  def onPageFinished(view: WebView, url: String): Unit = js.native
  def onReceivedTitle(view: WebView, title: String): Unit = js.native
}

