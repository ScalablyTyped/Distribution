package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupIdentifier extends js.Object {
  /**
    * The ARN of a resource group.
    */
  var GroupArn: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.GroupArn] = js.undefined
  /**
    * The name of a resource group.
    */
  var GroupName: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.GroupName] = js.undefined
}

object GroupIdentifier {
  @scala.inline
  def apply(GroupArn: GroupArn = null, GroupName: GroupName = null): GroupIdentifier = {
    val __obj = js.Dynamic.literal()
    if (GroupArn != null) __obj.updateDynamic("GroupArn")(GroupArn)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[GroupIdentifier]
  }
}

