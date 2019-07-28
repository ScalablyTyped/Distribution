package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadPermission extends js.Object {
  /**
    * The name of the group.
    */
  var Group: js.UndefOr[PermissionGroup] = js.undefined
  /**
    * The AWS account ID.
    */
  var UserId: js.UndefOr[String] = js.undefined
}

object LoadPermission {
  @scala.inline
  def apply(Group: PermissionGroup = null, UserId: String = null): LoadPermission = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[LoadPermission]
  }
}

