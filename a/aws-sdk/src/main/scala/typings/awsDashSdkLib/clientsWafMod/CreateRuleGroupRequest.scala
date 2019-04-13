package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRuleGroupRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: awsDashSdkLib.clientsWafMod.ChangeToken
  /**
    * A friendly name or description for the metrics for this RuleGroup. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the metric after you create the RuleGroup.
    */
  var MetricName: awsDashSdkLib.clientsWafMod.MetricName
  /**
    * A friendly name or description of the RuleGroup. You can't change Name after you create a RuleGroup.
    */
  var Name: ResourceName
}

object CreateRuleGroupRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, MetricName: MetricName, Name: ResourceName): CreateRuleGroupRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, MetricName = MetricName, Name = Name)
  
    __obj.asInstanceOf[CreateRuleGroupRequest]
  }
}

