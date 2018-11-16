package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLDOMNode3")
@js.native
class IHTMLDOMNode3 protected () extends js.Object {
  var `MSHTML.IHTMLDOMNode3_typekey`: IHTMLDOMNode3 = js.native
  val localName: js.Any = js.native
  val namespaceURI: js.Any = js.native
  var prefix: js.Any = js.native
  var textContent: js.Any = js.native
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def compareDocumentPosition(otherNode: IHTMLDOMNode): scala.Double = js.native
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  def isDefaultNamespace(pvarNamespace: js.Any): scala.Boolean = js.native
  def isEqualNode(otherNode: IHTMLDOMNode3): scala.Boolean = js.native
  def isSameNode(otherNode: IHTMLDOMNode3): scala.Boolean = js.native
  def isSupported(feature: java.lang.String, version: js.Any): scala.Boolean = js.native
  def lookupNamespaceURI(pvarPrefix: js.Any): js.Any = js.native
  def lookupPrefix(pvarNamespaceURI: js.Any): js.Any = js.native
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
}

