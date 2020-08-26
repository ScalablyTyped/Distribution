package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnString extends js.Object {
  @JSName("MSForms.ReturnString_typekey")
  var MSFormsDotReturnString_typekey: ReturnString = js.native
  var Value: String = js.native
}

object ReturnString {
  @scala.inline
  def apply(MSFormsDotReturnString_typekey: ReturnString, Value: String): ReturnString = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnString_typekey")(MSFormsDotReturnString_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnString]
  }
  @scala.inline
  implicit class ReturnStringOps[Self <: ReturnString] (val x: Self) extends AnyVal {
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
    def setMSFormsDotReturnString_typekey(value: ReturnString): Self = this.set("MSForms.ReturnString_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

