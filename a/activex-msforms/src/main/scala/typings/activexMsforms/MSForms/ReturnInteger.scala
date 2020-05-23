package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnInteger extends js.Object {
  @JSName("MSForms.ReturnInteger_typekey")
  var MSFormsDotReturnInteger_typekey: ReturnInteger
  var Value: Double
}

object ReturnInteger {
  @scala.inline
  def apply(MSFormsDotReturnInteger_typekey: ReturnInteger, Value: Double): ReturnInteger = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnInteger_typekey")(MSFormsDotReturnInteger_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnInteger]
  }
}

