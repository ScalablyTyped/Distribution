package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspacesIpGroup extends js.Object {
  /**
    * The description of the group.
    */
  var groupDesc: js.UndefOr[IpGroupDesc] = js.native
  /**
    * The identifier of the group.
    */
  var groupId: js.UndefOr[IpGroupId] = js.native
  /**
    * The name of the group.
    */
  var groupName: js.UndefOr[IpGroupName] = js.native
  /**
    * The rules.
    */
  var userRules: js.UndefOr[IpRuleList] = js.native
}

object WorkspacesIpGroup {
  @scala.inline
  def apply(
    groupDesc: IpGroupDesc = null,
    groupId: IpGroupId = null,
    groupName: IpGroupName = null,
    userRules: IpRuleList = null
  ): WorkspacesIpGroup = {
    val __obj = js.Dynamic.literal()
    if (groupDesc != null) __obj.updateDynamic("groupDesc")(groupDesc.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (userRules != null) __obj.updateDynamic("userRules")(userRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspacesIpGroup]
  }
}

