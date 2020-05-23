package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessObjectProperty extends js.Object {
  @JSName("Access.AccessObjectProperty_typekey")
  var AccessDotAccessObjectProperty_typekey: AccessObjectProperty
  val Name: String
  var Value: js.Any
  val _Value: js.Any
  def IsMemberSafe(dispid: Double): Boolean
}

object AccessObjectProperty {
  @scala.inline
  def apply(
    AccessDotAccessObjectProperty_typekey: AccessObjectProperty,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: js.Any,
    _Value: js.Any
  ): AccessObjectProperty = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.AccessObjectProperty_typekey")(AccessDotAccessObjectProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessObjectProperty]
  }
}

