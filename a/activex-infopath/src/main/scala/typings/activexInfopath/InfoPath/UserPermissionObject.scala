package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermissionObject extends js.Object {
  var ExpirationDate: js.Any
  @JSName("InfoPath.UserPermissionObject_typekey")
  var InfoPathDotUserPermissionObject_typekey: UserPermissionObject
  val Parent: js.Any
  var Permission: Double
  val UserId: String
  def Remove(): Unit
}

object UserPermissionObject {
  @scala.inline
  def apply(
    ExpirationDate: js.Any,
    InfoPathDotUserPermissionObject_typekey: UserPermissionObject,
    Parent: js.Any,
    Permission: Double,
    Remove: () => Unit,
    UserId: String
  ): UserPermissionObject = {
    val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), UserId = UserId.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.UserPermissionObject_typekey")(InfoPathDotUserPermissionObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPermissionObject]
  }
}

