package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleGroup extends js.Object {
  /**
    * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the metric after you create the RuleGroup.
    */
  var MetricName: js.UndefOr[MetricName] = js.undefined
  /**
    * The friendly name or description for the RuleGroup. You can't change the name of a RuleGroup after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * A unique identifier for a RuleGroup. You use RuleGroupId to get more information about a RuleGroup (see GetRuleGroup), update a RuleGroup (see UpdateRuleGroup), insert a RuleGroup into a WebACL or delete a one from a WebACL (see UpdateWebACL), or delete a RuleGroup from AWS WAF (see DeleteRuleGroup).  RuleGroupId is returned by CreateRuleGroup and by ListRuleGroups.
    */
  var RuleGroupId: ResourceId
}

object RuleGroup {
  @scala.inline
  def apply(RuleGroupId: ResourceId, MetricName: MetricName = null, Name: ResourceName = null): RuleGroup = {
    val __obj = js.Dynamic.literal(RuleGroupId = RuleGroupId)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[RuleGroup]
  }
}

