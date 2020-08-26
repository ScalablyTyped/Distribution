package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLTableCaption extends js.Object {
  @JSName("MSHTML.IHTMLTableCaption_typekey")
  var MSHTMLDotIHTMLTableCaption_typekey: IHTMLTableCaption = js.native
  var align: String = js.native
  var vAlign: String = js.native
}

object IHTMLTableCaption {
  @scala.inline
  def apply(MSHTMLDotIHTMLTableCaption_typekey: IHTMLTableCaption, align: String, vAlign: String): IHTMLTableCaption = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], vAlign = vAlign.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLTableCaption_typekey")(MSHTMLDotIHTMLTableCaption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLTableCaption]
  }
  @scala.inline
  implicit class IHTMLTableCaptionOps[Self <: IHTMLTableCaption] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLTableCaption_typekey(value: IHTMLTableCaption): Self = this.set("MSHTML.IHTMLTableCaption_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def setVAlign(value: String): Self = this.set("vAlign", value.asInstanceOf[js.Any])
  }
  
}

