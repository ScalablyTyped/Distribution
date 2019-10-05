package typings.androiduix.android

import typings.androiduix.android.content.Context
import typings.androiduix.android.webkit.WebView
import typings.androiduix.android.webkit.WebViewClient
import typings.androiduix.androidui.widget.HtmlBaseView
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.webkit")
@js.native
object webkit extends js.Object {
  @js.native
  class WebView protected () extends HtmlBaseView {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
    var iFrameElement: js.Any = js.native
    var initIFrameHistoryLength: js.Any = js.native
    var mClient: WebViewClient = js.native
    def canGoBack(): Boolean = js.native
    /* private */ def checkActivityResume(): js.Any = js.native
    def getTitle(): String = js.native
    def getUrl(): String = js.native
    def goBack(): Unit = js.native
    /* private */ def initIFrameElement(url: js.Any): js.Any = js.native
    def loadUrl(url: String): Unit = js.native
    def reload(): Unit = js.native
    def setWebViewClient(client: WebViewClient): Unit = js.native
  }
  
  @js.native
  class WebViewClient () extends js.Object {
    def onPageFinished(view: WebView, url: String): Unit = js.native
    def onReceivedTitle(view: WebView, title: String): Unit = js.native
  }
  
}

