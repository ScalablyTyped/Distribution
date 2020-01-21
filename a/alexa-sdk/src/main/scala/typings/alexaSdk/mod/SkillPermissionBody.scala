package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillPermissionBody extends js.Object {
  var acceptedPermissions: js.Array[PermissionScope]
}

object SkillPermissionBody {
  @scala.inline
  def apply(acceptedPermissions: js.Array[PermissionScope]): SkillPermissionBody = {
    val __obj = js.Dynamic.literal(acceptedPermissions = acceptedPermissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkillPermissionBody]
  }
}

