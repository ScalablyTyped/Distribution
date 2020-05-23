package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnVar extends js.Object {
  @JSName("Access.ReturnVar_typekey")
  var AccessDotReturnVar_typekey: ReturnVar
  val Name: String
  val Value: String | Double
  val _Value: String | Double
  def IsMemberSafe(dispid: Double): Boolean
}

object ReturnVar {
  @scala.inline
  def apply(
    AccessDotReturnVar_typekey: ReturnVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: String | Double,
    _Value: String | Double
  ): ReturnVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.ReturnVar_typekey")(AccessDotReturnVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnVar]
  }
}

