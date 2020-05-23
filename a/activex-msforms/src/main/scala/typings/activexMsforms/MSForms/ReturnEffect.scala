package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnEffect extends js.Object {
  @JSName("MSForms.ReturnEffect_typekey")
  var MSFormsDotReturnEffect_typekey: ReturnEffect
  var Value: fmDropEffect
}

object ReturnEffect {
  @scala.inline
  def apply(MSFormsDotReturnEffect_typekey: ReturnEffect, Value: fmDropEffect): ReturnEffect = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnEffect_typekey")(MSFormsDotReturnEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnEffect]
  }
}

