package typings
package activexDashMshtmlLib.MSHTMLNs

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
  var data: java.lang.String = js.native
  val firstChild: IHTMLDOMNode = js.native
  val lastChild: IHTMLDOMNode = js.native
  val length: scala.Double = js.native
  val localName: js.Any = js.native
  val namespaceURI: js.Any = js.native
  val nextSibling: IHTMLDOMNode = js.native
  val nodeName: java.lang.String = js.native
  val nodeType: scala.Double = js.native
  var nodeValue: js.Any = js.native
  val ownerDocument: js.Any = js.native
  val parentNode: IHTMLDOMNode = js.native
  var prefix: js.Any = js.native
  val previousSibling: IHTMLDOMNode = js.native
  var textContent: js.Any = js.native
  val wholeText: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Any, useCapture: scala.Boolean): scala.Unit = js.native
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def appendData(bstrstring: java.lang.String): scala.Unit = js.native
  def cloneNode(fDeep: scala.Boolean): IHTMLDOMNode = js.native
  def compareDocumentPosition(otherNode: IHTMLDOMNode): scala.Double = js.native
  def deleteData(offset: scala.Double, Count: scala.Double): scala.Unit = js.native
  def dispatchEvent(evt: IDOMEvent): scala.Boolean = js.native
  def hasAttributes(): scala.Boolean = js.native
  def hasChildNodes(): scala.Boolean = js.native
  def ie9_appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_deleteData(offset: scala.Double, Count: scala.Double): scala.Unit = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def ie9_insertData(offset: scala.Double, bstrstring: java.lang.String): scala.Unit = js.native
  def ie9_removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def ie9_replaceData(offset: scala.Double, Count: scala.Double, bstrstring: java.lang.String): scala.Unit = js.native
  def ie9_splitText(offset: scala.Double): IHTMLDOMNode = js.native
  def ie9_substringData(offset: scala.Double, Count: scala.Double): java.lang.String = js.native
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def insertData(offset: scala.Double, bstrstring: java.lang.String): scala.Unit = js.native
  def isDefaultNamespace(pvarNamespace: js.Any): scala.Boolean = js.native
  def isEqualNode(otherNode: IHTMLDOMNode3): scala.Boolean = js.native
  def isSameNode(otherNode: IHTMLDOMNode3): scala.Boolean = js.native
  def isSupported(feature: java.lang.String, version: js.Any): scala.Boolean = js.native
  def lookupNamespaceURI(pvarPrefix: js.Any): js.Any = js.native
  def lookupPrefix(pvarNamespaceURI: js.Any): js.Any = js.native
  def normalize(): scala.Unit = js.native
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Any, useCapture: scala.Boolean): scala.Unit = js.native
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: scala.Boolean): IHTMLDOMNode = js.native
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def replaceData(offset: scala.Double, Count: scala.Double, bstrstring: java.lang.String): scala.Unit = js.native
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  def replaceWholeText(bstrText: java.lang.String): IHTMLDOMNode = js.native
  def splitText(offset: scala.Double): IHTMLDOMNode = js.native
  def substringData(offset: scala.Double, Count: scala.Double): java.lang.String = js.native
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
}

