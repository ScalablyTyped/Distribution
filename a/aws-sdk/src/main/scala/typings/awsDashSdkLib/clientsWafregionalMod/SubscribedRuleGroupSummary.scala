package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribedRuleGroupSummary extends js.Object {
  /**
    * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RuleGroup.
    */
  var MetricName: awsDashSdkLib.clientsWafregionalMod.MetricName
  /**
    * A friendly name or description of the RuleGroup. You can't change the name of a RuleGroup after you create it.
    */
  var Name: ResourceName
  /**
    * A unique identifier for a RuleGroup.
    */
  var RuleGroupId: ResourceId
}

object SubscribedRuleGroupSummary {
  @scala.inline
  def apply(MetricName: MetricName, Name: ResourceName, RuleGroupId: ResourceId): SubscribedRuleGroupSummary = {
    val __obj = js.Dynamic.literal(MetricName = MetricName, Name = Name, RuleGroupId = RuleGroupId)
  
    __obj.asInstanceOf[SubscribedRuleGroupSummary]
  }
}

