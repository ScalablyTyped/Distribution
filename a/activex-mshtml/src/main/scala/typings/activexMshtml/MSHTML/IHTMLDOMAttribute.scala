package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLDOMAttribute extends js.Object {
  @JSName("MSHTML.IHTMLDOMAttribute_typekey")
  var MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute = js.native
  val nodeName: String = js.native
  var nodeValue: js.Any = js.native
  val specified: Boolean = js.native
}

object IHTMLDOMAttribute {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDOMAttribute_typekey: IHTMLDOMAttribute,
    nodeName: String,
    nodeValue: js.Any,
    specified: Boolean
  ): IHTMLDOMAttribute = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], specified = specified.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDOMAttribute_typekey")(MSHTMLDotIHTMLDOMAttribute_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDOMAttribute]
  }
  @scala.inline
  implicit class IHTMLDOMAttributeOps[Self <: IHTMLDOMAttribute] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLDOMAttribute_typekey(value: IHTMLDOMAttribute): Self = this.set("MSHTML.IHTMLDOMAttribute_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeValue(value: js.Any): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecified(value: Boolean): Self = this.set("specified", value.asInstanceOf[js.Any])
  }
  
}

