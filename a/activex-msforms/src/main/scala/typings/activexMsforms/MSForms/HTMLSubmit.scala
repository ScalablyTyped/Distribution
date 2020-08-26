package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLSubmit extends js.Object {
  var Action: String = js.native
  var Caption: String = js.native
  var Encoding: String = js.native
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLSubmit_typekey")
  var MSFormsDotHTMLSubmit_typekey: HTMLSubmit = js.native
  var Method: String = js.native
}

object HTMLSubmit {
  @scala.inline
  def apply(
    Action: String,
    Caption: String,
    Encoding: String,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLSubmit_typekey: HTMLSubmit,
    Method: String
  ): HTMLSubmit = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLSubmit_typekey")(MSFormsDotHTMLSubmit_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLSubmit]
  }
  @scala.inline
  implicit class HTMLSubmitOps[Self <: HTMLSubmit] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTMLName(value: String): Self = this.set("HTMLName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTMLType(value: String): Self = this.set("HTMLType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSFormsDotHTMLSubmit_typekey(value: HTMLSubmit): Self = this.set("MSForms.HTMLSubmit_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("Method", value.asInstanceOf[js.Any])
  }
  
}

