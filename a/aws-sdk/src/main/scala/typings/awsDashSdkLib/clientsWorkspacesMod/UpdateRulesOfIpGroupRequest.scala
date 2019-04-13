package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRulesOfIpGroupRequest extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId
  /**
    * One or more rules.
    */
  var UserRules: IpRuleList
}

object UpdateRulesOfIpGroupRequest {
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRuleList): UpdateRulesOfIpGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, UserRules = UserRules)
  
    __obj.asInstanceOf[UpdateRulesOfIpGroupRequest]
  }
}

