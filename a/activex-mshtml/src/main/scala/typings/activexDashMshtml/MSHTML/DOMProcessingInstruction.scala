package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMProcessingInstruction")
@js.native
class DOMProcessingInstruction protected () extends js.Object {
  @JSName("MSHTML.DOMProcessingInstruction_typekey")
  var MSHTMLDotDOMProcessingInstruction_typekey: DOMProcessingInstruction = js.native
  val attributes: js.Any = js.native
  val childNodes: js.Any = js.native
  var data: String = js.native
  val firstChild: IHTMLDOMNode = js.native
  val lastChild: IHTMLDOMNode = js.native
  val localName: js.Any = js.native
  val namespaceURI: js.Any = js.native
  val nextSibling: IHTMLDOMNode = js.native
  val nodeName: String = js.native
  val nodeType: Double = js.native
  var nodeValue: js.Any = js.native
  val ownerDocument: js.Any = js.native
  val parentNode: IHTMLDOMNode = js.native
  var prefix: js.Any = js.native
  val previousSibling: IHTMLDOMNode = js.native
  val target: String = js.native
  var textContent: js.Any = js.native
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  def hasChildNodes(): Boolean = js.native
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def isDefaultNamespace(pvarNamespace: js.Any): Boolean = js.native
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  def isSupported(feature: String, version: js.Any): Boolean = js.native
  def lookupNamespaceURI(pvarPrefix: js.Any): js.Any = js.native
  def lookupPrefix(pvarNamespaceURI: js.Any): js.Any = js.native
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
}

