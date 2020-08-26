package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLPassword extends js.Object {
  var HTMLName: String = js.native
  var HTMLType: String = js.native
  @JSName("MSForms.HTMLPassword_typekey")
  var MSFormsDotHTMLPassword_typekey: HTMLPassword = js.native
  var MaxLength: Double = js.native
  var Value: String = js.native
  var Width: Double = js.native
}

object HTMLPassword {
  @scala.inline
  def apply(
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLPassword_typekey: HTMLPassword,
    MaxLength: Double,
    Value: String,
    Width: Double
  ): HTMLPassword = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLPassword_typekey")(MSFormsDotHTMLPassword_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPassword]
  }
  @scala.inline
  implicit class HTMLPasswordOps[Self <: HTMLPassword] (val x: Self) extends AnyVal {
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
    def setMSFormsDotHTMLPassword_typekey(value: HTMLPassword): Self = this.set("MSForms.HTMLPassword_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("MaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
  
}

