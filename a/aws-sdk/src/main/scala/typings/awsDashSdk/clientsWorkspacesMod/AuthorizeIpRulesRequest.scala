package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeIpRulesRequest extends js.Object {
  /**
    * The identifier of the group.
    */
  var GroupId: IpGroupId
  /**
    * The rules to add to the group.
    */
  var UserRules: IpRuleList
}

object AuthorizeIpRulesRequest {
  @scala.inline
  def apply(GroupId: IpGroupId, UserRules: IpRuleList): AuthorizeIpRulesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, UserRules = UserRules)
  
    __obj.asInstanceOf[AuthorizeIpRulesRequest]
  }
}

