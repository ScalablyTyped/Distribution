package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartTagProperty extends js.Object {
  @JSName("Access.SmartTagProperty_typekey")
  var AccessDotSmartTagProperty_typekey: SmartTagProperty
  var Name: String
  var Value: String
  def Delete(): Unit
  def IsMemberSafe(dispid: Double): Boolean
}

object SmartTagProperty {
  @scala.inline
  def apply(
    AccessDotSmartTagProperty_typekey: SmartTagProperty,
    Delete: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: String
  ): SmartTagProperty = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction0(Delete), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTagProperty_typekey")(AccessDotSmartTagProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagProperty]
  }
}

