package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnString extends js.Object {
  @JSName("MSForms.ReturnString_typekey")
  var MSFormsDotReturnString_typekey: ReturnString
  var Value: String
}

object ReturnString {
  @scala.inline
  def apply(MSFormsDotReturnString_typekey: ReturnString, Value: String): ReturnString = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnString_typekey")(MSFormsDotReturnString_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnString]
  }
}

