package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionInfo extends js.Object {
  /**
    * The role of the user.
    */
  var Role: js.UndefOr[RoleType] = js.native
  /**
    * The type of permissions.
    */
  var Type: js.UndefOr[RolePermissionType] = js.native
}

object PermissionInfo {
  @scala.inline
  def apply(Role: RoleType = null, Type: RolePermissionType = null): PermissionInfo = {
    val __obj = js.Dynamic.literal()
    if (Role != null) __obj.updateDynamic("Role")(Role.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionInfo]
  }
}

