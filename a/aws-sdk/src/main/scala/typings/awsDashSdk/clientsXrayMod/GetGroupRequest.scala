package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupRequest extends js.Object {
  /**
    * The ARN of the group that was generated on creation.
    */
  var GroupARN: js.UndefOr[typings.awsDashSdk.clientsXrayMod.GroupARN] = js.undefined
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[typings.awsDashSdk.clientsXrayMod.GroupName] = js.undefined
}

object GetGroupRequest {
  @scala.inline
  def apply(GroupARN: GroupARN = null, GroupName: GroupName = null): GetGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[GetGroupRequest]
  }
}

