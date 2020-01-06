package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPermissionModifications extends js.Object {
  /**
    * The AWS account ID to add to the list of launch permissions for the AMI.
    */
  var Add: js.UndefOr[LaunchPermissionList] = js.native
  /**
    * The AWS account ID to remove from the list of launch permissions for the AMI.
    */
  var Remove: js.UndefOr[LaunchPermissionList] = js.native
}

object LaunchPermissionModifications {
  @scala.inline
  def apply(Add: LaunchPermissionList = null, Remove: LaunchPermissionList = null): LaunchPermissionModifications = {
    val __obj = js.Dynamic.literal()
    if (Add != null) __obj.updateDynamic("Add")(Add.asInstanceOf[js.Any])
    if (Remove != null) __obj.updateDynamic("Remove")(Remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchPermissionModifications]
  }
}

