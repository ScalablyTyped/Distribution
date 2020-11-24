package typings.androiduix.android.webkit

import typings.androiduix.androidui.widget.HtmlBaseView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebView extends HtmlBaseView {
  
  def canGoBack(): Boolean = js.native
  
  /* private */ def checkActivityResume(): js.Any = js.native
  
  def getTitle(): String = js.native
  
  def getUrl(): String = js.native
  
  def goBack(): Unit = js.native
  
  var iFrameElement: js.Any = js.native
  
  /* private */ def initIFrameElement(url: js.Any): js.Any = js.native
  
  var initIFrameHistoryLength: js.Any = js.native
  
  def loadUrl(url: String): Unit = js.native
  
  var mClient: WebViewClient = js.native
  
  def reload(): Unit = js.native
  
  def setWebViewClient(client: WebViewClient): Unit = js.native
}
