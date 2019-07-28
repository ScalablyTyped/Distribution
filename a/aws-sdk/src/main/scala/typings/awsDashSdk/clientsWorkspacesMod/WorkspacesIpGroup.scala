package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspacesIpGroup extends js.Object {
  /**
    * The description of the group.
    */
  var groupDesc: js.UndefOr[IpGroupDesc] = js.undefined
  /**
    * The identifier of the group.
    */
  var groupId: js.UndefOr[IpGroupId] = js.undefined
  /**
    * The name of the group.
    */
  var groupName: js.UndefOr[IpGroupName] = js.undefined
  /**
    * The rules.
    */
  var userRules: js.UndefOr[IpRuleList] = js.undefined
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
    if (groupDesc != null) __obj.updateDynamic("groupDesc")(groupDesc)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    if (userRules != null) __obj.updateDynamic("userRules")(userRules)
    __obj.asInstanceOf[WorkspacesIpGroup]
  }
}

