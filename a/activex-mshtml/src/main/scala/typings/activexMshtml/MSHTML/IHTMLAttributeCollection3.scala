package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLAttributeCollection3 extends js.Object {
  @JSName("MSHTML.IHTMLAttributeCollection3_typekey")
  var MSHTMLDotIHTMLAttributeCollection3_typekey: IHTMLAttributeCollection3
  val length: Double
  def getNamedItem(bstrName: String): IHTMLDOMAttribute
  def item(index: Double): IHTMLDOMAttribute
  def removeNamedItem(bstrName: String): IHTMLDOMAttribute
  def setNamedItem(pNodeIn: IHTMLDOMAttribute): IHTMLDOMAttribute
}

object IHTMLAttributeCollection3 {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLAttributeCollection3_typekey: IHTMLAttributeCollection3,
    getNamedItem: String => IHTMLDOMAttribute,
    item: Double => IHTMLDOMAttribute,
    length: Double,
    removeNamedItem: String => IHTMLDOMAttribute,
    setNamedItem: IHTMLDOMAttribute => IHTMLDOMAttribute
  ): IHTMLAttributeCollection3 = {
    val __obj = js.Dynamic.literal(getNamedItem = js.Any.fromFunction1(getNamedItem), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], removeNamedItem = js.Any.fromFunction1(removeNamedItem), setNamedItem = js.Any.fromFunction1(setNamedItem))
    __obj.updateDynamic("MSHTML.IHTMLAttributeCollection3_typekey")(MSHTMLDotIHTMLAttributeCollection3_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLAttributeCollection3]
  }
}

