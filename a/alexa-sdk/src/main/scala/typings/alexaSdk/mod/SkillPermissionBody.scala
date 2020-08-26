package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillPermissionBody extends js.Object {
  var acceptedPermissions: js.Array[PermissionScope] = js.native
}

object SkillPermissionBody {
  @scala.inline
  def apply(acceptedPermissions: js.Array[PermissionScope]): SkillPermissionBody = {
    val __obj = js.Dynamic.literal(acceptedPermissions = acceptedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillPermissionBody]
  }
  @scala.inline
  implicit class SkillPermissionBodyOps[Self <: SkillPermissionBody] (val x: Self) extends AnyVal {
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
    def setAcceptedPermissionsVarargs(value: PermissionScope*): Self = this.set("acceptedPermissions", js.Array(value :_*))
    @scala.inline
    def setAcceptedPermissions(value: js.Array[PermissionScope]): Self = this.set("acceptedPermissions", value.asInstanceOf[js.Any])
  }
  
}

