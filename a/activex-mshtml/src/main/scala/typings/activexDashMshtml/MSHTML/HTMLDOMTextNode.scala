package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLDOMTextNode")
@js.native
class HTMLDOMTextNode protected () extends js.Object {
  var `MSHTML.HTMLDOMTextNode_typekey`: HTMLDOMTextNode = js.native
  val attributes: js.Any = js.native
  val childNodes: js.Any = js.native
  val constructor: js.Any = js.native
  var data: String = js.native
  val firstChild: IHTMLDOMNode = js.native
  val lastChild: IHTMLDOMNode = js.native
  val length: Double = js.native
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
  var textContent: js.Any = js.native
  val wholeText: String = js.native
  def addEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def appendData(bstrstring: String): Unit = js.native
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  def compareDocumentPosition(otherNode: IHTMLDOMNode): Double = js.native
  def deleteData(offset: Double, Count: Double): Unit = js.native
  def dispatchEvent(evt: IDOMEvent): Boolean = js.native
  def hasAttributes(): Boolean = js.native
  def hasChildNodes(): Boolean = js.native
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_deleteData(offset: Double, Count: Double): Unit = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def ie9_insertData(offset: Double, bstrstring: String): Unit = js.native
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_replaceData(offset: Double, Count: Double, bstrstring: String): Unit = js.native
  def ie9_splitText(offset: Double): IHTMLDOMNode = js.native
  def ie9_substringData(offset: Double, Count: Double): String = js.native
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def insertData(offset: Double, bstrstring: String): Unit = js.native
  def isDefaultNamespace(pvarNamespace: js.Any): Boolean = js.native
  def isEqualNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  def isSameNode(otherNode: IHTMLDOMNode3): Boolean = js.native
  def isSupported(feature: String, version: js.Any): Boolean = js.native
  def lookupNamespaceURI(pvarPrefix: js.Any): js.Any = js.native
  def lookupPrefix(pvarNamespaceURI: js.Any): js.Any = js.native
  def normalize(): Unit = js.native
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def removeEventListener(`type`: String, listener: js.Any, useCapture: Boolean): Unit = js.native
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def replaceData(offset: Double, Count: Double, bstrstring: String): Unit = js.native
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  def replaceWholeText(bstrText: String): IHTMLDOMNode = js.native
  def splitText(offset: Double): IHTMLDOMNode = js.native
  def substringData(offset: Double, Count: Double): String = js.native
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
}

