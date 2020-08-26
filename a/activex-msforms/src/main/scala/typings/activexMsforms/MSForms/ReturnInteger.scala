package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnInteger extends js.Object {
  @JSName("MSForms.ReturnInteger_typekey")
  var MSFormsDotReturnInteger_typekey: ReturnInteger = js.native
  var Value: Double = js.native
}

object ReturnInteger {
  @scala.inline
  def apply(MSFormsDotReturnInteger_typekey: ReturnInteger, Value: Double): ReturnInteger = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnInteger_typekey")(MSFormsDotReturnInteger_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnInteger]
  }
  @scala.inline
  implicit class ReturnIntegerOps[Self <: ReturnInteger] (val x: Self) extends AnyVal {
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
    def setMSFormsDotReturnInteger_typekey(value: ReturnInteger): Self = this.set("MSForms.ReturnInteger_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

