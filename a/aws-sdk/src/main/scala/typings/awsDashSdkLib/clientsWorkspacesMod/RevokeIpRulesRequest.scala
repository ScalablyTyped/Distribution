package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeIpRulesRequest extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId
  /**
    * The rules to remove from the group.
    */
  var UserRules: IpRevokedRuleList
}

object RevokeIpRulesRequest {
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRevokedRuleList): RevokeIpRulesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, UserRules = UserRules)
  
    __obj.asInstanceOf[RevokeIpRulesRequest]
  }
}

