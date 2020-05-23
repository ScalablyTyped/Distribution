package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TempVar extends js.Object {
  @JSName("Access.TempVar_typekey")
  var AccessDotTempVar_typekey: TempVar
  val Name: String
  var Value: Double | String | Boolean
  var _Value: Double | String | Boolean
  def IsMemberSafe(dispid: Double): Boolean
}

object TempVar {
  @scala.inline
  def apply(
    AccessDotTempVar_typekey: TempVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: Double | String | Boolean,
    _Value: Double | String | Boolean
  ): TempVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.TempVar_typekey")(AccessDotTempVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempVar]
  }
}

