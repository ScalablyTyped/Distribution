package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRateBasedRuleRequest extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: awsDashSdkLib.clientsWafregionalMod.ChangeToken
  /**
    * A friendly name or description for the metrics for this RateBasedRule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9); the name can't contain whitespace. You can't change the name of the metric after you create the RateBasedRule.
    */
  var MetricName: awsDashSdkLib.clientsWafregionalMod.MetricName
  /**
    * A friendly name or description of the RateBasedRule. You can't change the name of a RateBasedRule after you create it.
    */
  var Name: ResourceName
  /**
    * The field that AWS WAF uses to determine if requests are likely arriving from a single source and thus subject to rate monitoring. The only valid value for RateKey is IP. IP indicates that requests that arrive from the same IP address are subject to the RateLimit that is specified in the RateBasedRule.
    */
  var RateKey: awsDashSdkLib.clientsWafregionalMod.RateKey
  /**
    * The maximum number of requests, which have an identical value in the field that is specified by RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: awsDashSdkLib.clientsWafregionalMod.RateLimit
}

object CreateRateBasedRuleRequest {
  @scala.inline
  def apply(
    ChangeToken: ChangeToken,
    MetricName: MetricName,
    Name: ResourceName,
    RateKey: RateKey,
    RateLimit: RateLimit
  ): CreateRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, MetricName = MetricName, Name = Name, RateKey = RateKey.asInstanceOf[js.Any], RateLimit = RateLimit)
  
    __obj.asInstanceOf[CreateRateBasedRuleRequest]
  }
}

