package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAttributeCollection extends js.Object {
  val constructor: js.Any = js.native
  val ie8_length: scala.Double = js.native
  val ie9_length: scala.Double = js.native
  val length: scala.Double = js.native
  def apply(): js.Any = js.native
  def apply(name: js.Any): js.Any = js.native
  def getNamedItem(bstrName: java.lang.String): IHTMLDOMAttribute = js.native
  def getNamedItemNS(pvarNS: js.Any, bstrName: java.lang.String): IHTMLDOMAttribute2 = js.native
  def ie8_getNamedItem(bstrName: java.lang.String): IHTMLDOMAttribute = js.native
  def ie8_item(index: scala.Double): IHTMLDOMAttribute = js.native
  def ie8_removeNamedItem(bstrName: java.lang.String): IHTMLDOMAttribute = js.native
  def ie8_setNamedItem(pNodeIn: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
  def ie9_getNamedItem(bstrName: java.lang.String): IHTMLDOMAttribute2 = js.native
  def ie9_item(index: scala.Double): IHTMLDOMAttribute2 = js.native
  def ie9_removeNamedItem(bstrName: java.lang.String): IHTMLDOMAttribute2 = js.native
  def ie9_setNamedItem(pNodeIn: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
  def item(): js.Any = js.native
  def item(name: js.Any): js.Any = js.native
  def removeNamedItem(bstrName: java.lang.String): IHTMLDOMAttribute = js.native
  def removeNamedItemNS(pvarNS: js.Any, bstrName: java.lang.String): IHTMLDOMAttribute2 = js.native
  def setNamedItem(ppNode: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
  def setNamedItemNS(pNodeIn: IHTMLDOMAttribute2): IHTMLDOMAttribute2 = js.native
}

