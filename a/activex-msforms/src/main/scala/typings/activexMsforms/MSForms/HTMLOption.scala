package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOption extends js.Object {
  var Checked: Boolean = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLOption_typekey")
  var MSFormsDotHTMLOption_typekey: HTMLOption = js.native
  var Value: String = js.native
}

object HTMLOption {
  @scala.inline
  def apply(
    Checked: Boolean,
    DisplayStyle: fmDisplayStyle,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLOption_typekey: HTMLOption,
    Value: String
  ): HTMLOption = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLOption_typekey")(MSFormsDotHTMLOption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLOption]
  }
  @scala.inline
  implicit class HTMLOptionOps[Self <: HTMLOption] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("Checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayStyle(value: fmDisplayStyle): Self = this.set("DisplayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTMLName(value: String): Self = this.set("HTMLName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTMLType(value: String): Self = this.set("HTMLType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSFormsDotHTMLOption_typekey(value: HTMLOption): Self = this.set("MSForms.HTMLOption_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

