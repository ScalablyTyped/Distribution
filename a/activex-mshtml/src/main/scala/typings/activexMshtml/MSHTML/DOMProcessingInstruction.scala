package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMProcessingInstruction extends StObject {
  
  /* private */ @JSName("MSHTML.DOMProcessingInstruction_typekey")
  var MSHTMLDotDOMProcessingInstruction_typekey: DOMProcessingInstruction = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val attributes: Any = js.native
  
  val childNodes: Any = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  
  var data: String = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: Any): IHTMLDOMNode = js.native
  
  def isDefaultNamespace(pvarNamespace: Any): Boolean = js.native
  
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSupported(feature: String, version: Any): Boolean = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  val localName: Any = js.native
  
  def lookupNamespaceURI(pvarPrefix: Any): Any = js.native
  
  def lookupPrefix(pvarNamespaceURI: Any): Any = js.native
  
  val namespaceURI: Any = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  var nodeValue: Any = js.native
  
  val ownerDocument: Any = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  var prefix: Any = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val target: String = js.native
  
  var textContent: Any = js.native
}
