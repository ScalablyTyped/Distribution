package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMDocumentType")
@js.native
class DOMDocumentType protected () extends js.Object {
  var `MSHTML.DOMDocumentType_typekey`: DOMDocumentType = js.native
  val attributes: js.Any = js.native
  val childNodes: js.Any = js.native
  val entities: js.Any = js.native
  val firstChild: IHTMLDOMNode = js.native
  val internalSubset: js.Any = js.native
  val lastChild: IHTMLDOMNode = js.native
  val localName: js.Any = js.native
  val name: java.lang.String = js.native
  val namespaceURI: js.Any = js.native
  val nextSibling: IHTMLDOMNode = js.native
  val nodeName: java.lang.String = js.native
  val nodeType: scala.Double = js.native
  var nodeValue: js.Any = js.native
  val notations: js.Any = js.native
  val ownerDocument: js.Any = js.native
  val parentNode: IHTMLDOMNode = js.native
  var prefix: js.Any = js.native
  val previousSibling: IHTMLDOMNode = js.native
  val publicId: js.Any = js.native
  val systemId: js.Any = js.native
  var textContent: js.Any = js.native
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def cloneNode(fDeep: scala.Boolean): IHTMLDOMNode = js.native
  def compareDocumentPosition(otherNode: IHTMLDOMNode): scala.Double = js.native
  def hasChildNodes(): scala.Boolean = js.native
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def isDefaultNamespace(pvarNamespace: js.Any): scala.Boolean = js.native
  def isEqualNode(otherNode: IHTMLDOMNode3): scala.Boolean = js.native
  def isSameNode(otherNode: IHTMLDOMNode3): scala.Boolean = js.native
  def isSupported(feature: java.lang.String, version: js.Any): scala.Boolean = js.native
  def lookupNamespaceURI(pvarPrefix: js.Any): js.Any = js.native
  def lookupPrefix(pvarNamespaceURI: js.Any): js.Any = js.native
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  /** @param fDeep [fDeep=false] */
  def removeNode(fDeep: scala.Boolean): IHTMLDOMNode = js.native
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
}

