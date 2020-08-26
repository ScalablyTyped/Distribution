package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLHidden extends js.Object {
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLHidden_typekey")
  var MSFormsDotHTMLHidden_typekey: HTMLHidden = js.native
  var Value: String = js.native
}

object HTMLHidden {
  @scala.inline
  def apply(HTMLName: String, HTMLType: String, MSFormsDotHTMLHidden_typekey: HTMLHidden, Value: String): HTMLHidden = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLHidden_typekey")(MSFormsDotHTMLHidden_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLHidden]
  }
  @scala.inline
  implicit class HTMLHiddenOps[Self <: HTMLHidden] (val x: Self) extends AnyVal {
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
    def setHTMLName(value: String): Self = this.set("HTMLName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTMLType(value: String): Self = this.set("HTMLType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSFormsDotHTMLHidden_typekey(value: HTMLHidden): Self = this.set("MSForms.HTMLHidden_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

