package typings.angularCommon.mod

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "\u0275DomAdapter")
@js.native
abstract class ɵDomAdapter () extends StObject {
  
  def createElement(tagName: Any): HTMLElement = js.native
  def createElement(tagName: Any, doc: Any): HTMLElement = js.native
  
  def createHtmlDocument(): Document = js.native
  
  def dispatchEvent(el: Any, evt: Any): Any = js.native
  
  def getBaseHref(doc: Document): String | Null = js.native
  
  def getCookie(name: String): String | Null = js.native
  
  def getDefaultDocument(): Document = js.native
  
  def getGlobalEventTarget(doc: Document, target: String): Any = js.native
  
  def getUserAgent(): String = js.native
  
  def isElementNode(node: Any): Boolean = js.native
  
  def isShadowRoot(node: Any): Boolean = js.native
  
  def onAndCancel(el: Any, evt: Any, listener: Any): js.Function = js.native
  
  def remove(el: Any): Unit = js.native
  
  def resetBaseElement(): Unit = js.native
  
  val supportsDOMEvents: Boolean = js.native
}
