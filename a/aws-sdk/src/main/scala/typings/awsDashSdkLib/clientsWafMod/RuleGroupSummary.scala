package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroupSummary extends js.Object {
  /**
    * A friendly name or description of the RuleGroup. You can't change the name of a RuleGroup after you create it.
    */
  var Name: ResourceName
  /**
    * A unique identifier for a RuleGroup. You use RuleGroupId to get more information about a RuleGroup (see GetRuleGroup), update a RuleGroup (see UpdateRuleGroup), insert a RuleGroup into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a RuleGroup from AWS WAF (see DeleteRuleGroup).  RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId
}

object RuleGroupSummary {
  @scala.inline
  def apply(Name: ResourceName, RuleGroupId: ResourceId): RuleGroupSummary = {
    val __obj = js.Dynamic.literal(Name = Name, RuleGroupId = RuleGroupId)
  
    __obj.asInstanceOf[RuleGroupSummary]
  }
}

