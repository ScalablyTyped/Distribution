package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: awsDashSdkLib.clientsWafMod.ChangeToken
  /**
    * A friendly name or description for the metrics for this Rule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the Rule.
    */
  var MetricName: awsDashSdkLib.clientsWafMod.MetricName
  /**
    * A friendly name or description of the Rule. You can't change the name of a Rule after you create it.
    */
  var Name: ResourceName
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, MetricName: MetricName, Name: ResourceName, Tags: TagList = null): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, MetricName = MetricName, Name = Name)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateRuleRequest]
  }
}

