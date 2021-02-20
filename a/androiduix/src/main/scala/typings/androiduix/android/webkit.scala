package typings.androiduix.android

import typings.androiduix.androidui.widget.HtmlBaseView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webkit {
  
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
  
  @js.native
  trait WebViewClient extends StObject {
    
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
    implicit class WebViewClientMutableBuilder[Self <: WebViewClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPageFinished(value: (WebView, String) => Unit): Self = StObject.set(x, "onPageFinished", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnReceivedTitle(value: (WebView, String) => Unit): Self = StObject.set(x, "onReceivedTitle", js.Any.fromFunction2(value))
    }
  }
}
