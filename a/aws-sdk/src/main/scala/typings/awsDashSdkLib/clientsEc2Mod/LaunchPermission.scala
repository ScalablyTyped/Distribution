package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchPermission extends js.Object {
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[PermissionGroup] = js.undefined
  /**
    * The AWS account ID.
    */
  var UserId: js.UndefOr[String] = js.undefined
}

object LaunchPermission {
  @scala.inline
  def apply(Group: PermissionGroup = null, UserId: String = null): LaunchPermission = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[LaunchPermission]
  }
}

