package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessField extends js.Object {
  @JSName("Access.AccessField_typekey")
  var AccessDotAccessField_typekey: AccessField
  var Value: js.Any
  def IsMemberSafe(dispid: Double): Boolean
}

object AccessField {
  @scala.inline
  def apply(AccessDotAccessField_typekey: AccessField, IsMemberSafe: Double => Boolean, Value: js.Any): AccessField = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.AccessField_typekey")(AccessDotAccessField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessField]
  }
}

