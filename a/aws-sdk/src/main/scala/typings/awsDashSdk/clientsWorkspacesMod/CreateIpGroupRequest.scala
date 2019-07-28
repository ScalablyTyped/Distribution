package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIpGroupRequest extends js.Object {
  /**
    * The description of the group.
    */
  var GroupDesc: js.UndefOr[IpGroupDesc] = js.undefined
  /**
    * The name of the group.
    */
  var GroupName: IpGroupName
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The rules to add to the group.
    */
  var UserRules: js.UndefOr[IpRuleList] = js.undefined
}

object CreateIpGroupRequest {
  @scala.inline
  def apply(
    GroupName: IpGroupName,
    GroupDesc: IpGroupDesc = null,
    Tags: TagList = null,
    UserRules: IpRuleList = null
  ): CreateIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
    if (GroupDesc != null) __obj.updateDynamic("GroupDesc")(GroupDesc)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UserRules != null) __obj.updateDynamic("UserRules")(UserRules)
    __obj.asInstanceOf[CreateIpGroupRequest]
  }
}

