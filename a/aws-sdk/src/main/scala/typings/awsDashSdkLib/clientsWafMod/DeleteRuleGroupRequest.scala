package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRuleGroupRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: awsDashSdkLib.clientsWafMod.ChangeToken
  /**
    * The RuleGroupId of the RuleGroup that you want to delete. RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId
}

object DeleteRuleGroupRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleGroupId: ResourceId): DeleteRuleGroupRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, RuleGroupId = RuleGroupId)
  
    __obj.asInstanceOf[DeleteRuleGroupRequest]
  }
}

