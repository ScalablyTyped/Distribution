package typings.angularPlatformBrowser.mod

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "\u0275BrowserDomAdapter")
@js.native
open class ɵBrowserDomAdapter () extends GenericBrowserDomAdapter {
  
  def createElement(tagName: String): HTMLElement = js.native
  def createElement(tagName: String, doc: Document): HTMLElement = js.native
  
  def dispatchEvent(el: Node, evt: Any): Unit = js.native
  
  def isElementNode(node: Node): Boolean = js.native
  
  def onAndCancel(el: Node, evt: Any, listener: Any): js.Function = js.native
  
  def remove(node: Node): Unit = js.native
}
/* static members */
object ɵBrowserDomAdapter {
  
  @JSImport("@angular/platform-browser", "\u0275BrowserDomAdapter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeCurrent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCurrent")().asInstanceOf[Unit]
}
