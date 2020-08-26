package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnEffect extends js.Object {
  @JSName("MSForms.ReturnEffect_typekey")
  var MSFormsDotReturnEffect_typekey: ReturnEffect = js.native
  var Value: fmDropEffect = js.native
}

object ReturnEffect {
  @scala.inline
  def apply(MSFormsDotReturnEffect_typekey: ReturnEffect, Value: fmDropEffect): ReturnEffect = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnEffect_typekey")(MSFormsDotReturnEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnEffect]
  }
  @scala.inline
  implicit class ReturnEffectOps[Self <: ReturnEffect] (val x: Self) extends AnyVal {
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
    def setMSFormsDotReturnEffect_typekey(value: ReturnEffect): Self = this.set("MSForms.ReturnEffect_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: fmDropEffect): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

