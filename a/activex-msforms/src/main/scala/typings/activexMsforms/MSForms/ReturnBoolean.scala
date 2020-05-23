package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnBoolean extends js.Object {
  @JSName("MSForms.ReturnBoolean_typekey")
  var MSFormsDotReturnBoolean_typekey: ReturnBoolean
  var Value: Boolean
}

object ReturnBoolean {
  @scala.inline
  def apply(MSFormsDotReturnBoolean_typekey: ReturnBoolean, Value: Boolean): ReturnBoolean = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnBoolean_typekey")(MSFormsDotReturnBoolean_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnBoolean]
  }
}

