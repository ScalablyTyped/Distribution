package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIpGroupResult extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: js.UndefOr[IpGroupId] = js.undefined
}

object CreateIpGroupResult {
  @scala.inline
  def apply(GroupId: IpGroupId = null): CreateIpGroupResult = {
    val __obj = js.Dynamic.literal()
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    __obj.asInstanceOf[CreateIpGroupResult]
  }
}

