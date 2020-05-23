package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnSingle extends js.Object {
  @JSName("MSForms.ReturnSingle_typekey")
  var MSFormsDotReturnSingle_typekey: ReturnSingle
  var Value: Double
}

object ReturnSingle {
  @scala.inline
  def apply(MSFormsDotReturnSingle_typekey: ReturnSingle, Value: Double): ReturnSingle = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnSingle_typekey")(MSFormsDotReturnSingle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnSingle]
  }
}

