package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLAttributeCollection3 extends js.Object {
  @JSName("MSHTML.IHTMLAttributeCollection3_typekey")
  var MSHTMLDotIHTMLAttributeCollection3_typekey: IHTMLAttributeCollection3 = js.native
  val length: Double = js.native
  def getNamedItem(bstrName: String): IHTMLDOMAttribute = js.native
  def item(index: Double): IHTMLDOMAttribute = js.native
  def removeNamedItem(bstrName: String): IHTMLDOMAttribute = js.native
  def setNamedItem(pNodeIn: IHTMLDOMAttribute): IHTMLDOMAttribute = js.native
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
  @scala.inline
  implicit class IHTMLAttributeCollection3Ops[Self <: IHTMLAttributeCollection3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMSHTMLDotIHTMLAttributeCollection3_typekey(value: IHTMLAttributeCollection3): Self = this.set("MSHTML.IHTMLAttributeCollection3_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetNamedItem(value: String => IHTMLDOMAttribute): Self = this.set("getNamedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: Double => IHTMLDOMAttribute): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveNamedItem(value: String => IHTMLDOMAttribute): Self = this.set("removeNamedItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNamedItem(value: IHTMLDOMAttribute => IHTMLDOMAttribute): Self = this.set("setNamedItem", js.Any.fromFunction1(value))
  }
  
}

