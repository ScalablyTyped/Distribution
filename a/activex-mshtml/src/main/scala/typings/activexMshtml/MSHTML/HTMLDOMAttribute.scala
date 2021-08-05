package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLDOMAttribute extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLDOMAttribute_typekey")
  var MSHTMLDotHTMLDOMAttribute_typekey: HTMLDOMAttribute = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val attributes: js.Any = js.native
  
  val childNodes: js.Any = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMAttribute = js.native
  
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  
  val constructor: js.Any = js.native
  
  val expando: Boolean = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def hasAttributes(): Boolean = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  var ie8_nodeValue: js.Any = js.native
  
  val ie8_specified: Boolean = js.native
  
  var ie8_value: String = js.native
  
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val ie9_childNodes: js.Any = js.native
  
  val ie9_firstChild: IHTMLDOMNode = js.native
  
  def ie9_hasChildNodes(): Boolean = js.native
  
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  
  val ie9_lastChild: IHTMLDOMNode = js.native
  
  val ie9_name: String = js.native
  
  val ie9_nodeName: String = js.native
  
  var ie9_nodeValue: js.Any = js.native
  
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val ie9_specified: Boolean = js.native
  
  var ie9_value: String = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  
  def isDefaultNamespace(pvarNamespace: js.Any): Boolean = js.native
  
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  
  def isSupported(feature: String, version: js.Any): Boolean = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  val localName: js.Any = js.native
  
  def lookupNamespaceURI(pvarPrefix: js.Any): js.Any = js.native
  
  def lookupPrefix(pvarNamespaceURI: js.Any): js.Any = js.native
  
  val name: String = js.native
  
  val namespaceURI: js.Any = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  var nodeValue: js.Any = js.native
  
  def normalize(): Unit = js.native
  
  val ownerDocument: js.Any = js.native
  
  val ownerElement: IHTMLElement2 = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  var prefix: js.Any = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val specified: Boolean = js.native
  
  var textContent: js.Any = js.native
  
  var value: String = js.native
}
