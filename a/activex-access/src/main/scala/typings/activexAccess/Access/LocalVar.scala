package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalVar extends js.Object {
  @JSName("Access.LocalVar_typekey")
  var AccessDotLocalVar_typekey: LocalVar
  val Name: String
  var Value: js.Any
  var _Value: js.Any
  def IsMemberSafe(dispid: Double): Boolean
}

object LocalVar {
  @scala.inline
  def apply(
    AccessDotLocalVar_typekey: LocalVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: js.Any,
    _Value: js.Any
  ): LocalVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.LocalVar_typekey")(AccessDotLocalVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVar]
  }
}

