package typings
package androiduixLib.androidNs.webkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.webkit.WebView")
@js.native
class WebView protected ()
  extends androiduixLib.androiduiNs.widgetNs.HtmlBaseView {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var iFrameElement: js.Any = js.native
  var initIFrameHistoryLength: js.Any = js.native
  var mClient: WebViewClient = js.native
  def canGoBack(): scala.Boolean = js.native
  /* private */ def checkActivityResume(): js.Any = js.native
  def getTitle(): java.lang.String = js.native
  def getUrl(): java.lang.String = js.native
  def goBack(): scala.Unit = js.native
  /* private */ def initIFrameElement(url: js.Any): js.Any = js.native
  def loadUrl(url: java.lang.String): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def setWebViewClient(client: WebViewClient): scala.Unit = js.native
}

