package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPermissionObject extends js.Object {
  var ExpirationDate: js.Any = js.native
  @JSName("InfoPath.UserPermissionObject_typekey")
  var InfoPathDotUserPermissionObject_typekey: UserPermissionObject = js.native
  val Parent: js.Any = js.native
  var Permission: Double = js.native
  val UserId: String = js.native
  def Remove(): Unit = js.native
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
  @scala.inline
  implicit class UserPermissionObjectOps[Self <: UserPermissionObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpirationDate(value: js.Any): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotUserPermissionObject_typekey(value: UserPermissionObject): Self = this.set("InfoPath.UserPermissionObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermission(value: Double): Self = this.set("Permission", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("Remove", js.Any.fromFunction0(value))
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

