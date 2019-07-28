package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOwnerSetting extends js.Object {
  /**
    * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
    */
  var AutoAddGroupOwner: js.UndefOr[__boolean] = js.undefined
  /**
    * The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional.
    */
  var GroupOwner: js.UndefOr[__string] = js.undefined
}

object GroupOwnerSetting {
  @scala.inline
  def apply(AutoAddGroupOwner: js.UndefOr[__boolean] = js.undefined, GroupOwner: __string = null): GroupOwnerSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoAddGroupOwner)) __obj.updateDynamic("AutoAddGroupOwner")(AutoAddGroupOwner)
    if (GroupOwner != null) __obj.updateDynamic("GroupOwner")(GroupOwner)
    __obj.asInstanceOf[GroupOwnerSetting]
  }
}

