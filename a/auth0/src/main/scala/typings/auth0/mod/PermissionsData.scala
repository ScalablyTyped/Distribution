package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionsData extends js.Object {
  var permissions: js.Array[PermissionData] = js.native
}

object PermissionsData {
  @scala.inline
  def apply(permissions: js.Array[PermissionData]): PermissionsData = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionsData]
  }
  @scala.inline
  implicit class PermissionsDataOps[Self <: PermissionsData] (val x: Self) extends AnyVal {
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
    def setPermissionsVarargs(value: PermissionData*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[PermissionData]): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
  
}

