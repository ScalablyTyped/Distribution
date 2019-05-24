package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateBasedRule extends js.Object {
  /**
    * The Predicates object contains one Predicate element for each ByteMatchSet, IPSet, or SqlInjectionMatchSet object that you want to include in a RateBasedRule.
    */
  var MatchPredicates: Predicates
  /**
    * A friendly name or description for the metrics for a RateBasedRule. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change the name of the metric after you create the RateBasedRule.
    */
  var MetricName: js.UndefOr[MetricName] = js.undefined
  /**
    * A friendly name or description for a RateBasedRule. You can't change the name of a RateBasedRule after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The field that AWS WAF uses to determine if requests are likely arriving from single source and thus subject to rate monitoring. The only valid value for RateKey is IP. IP indicates that requests arriving from the same IP address are subject to the RateLimit that is specified in the RateBasedRule.
    */
  var RateKey: awsDashSdkLib.clientsWafregionalMod.RateKey
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: awsDashSdkLib.clientsWafregionalMod.RateLimit
  /**
    * A unique identifier for a RateBasedRule. You use RuleId to get more information about a RateBasedRule (see GetRateBasedRule), update a RateBasedRule (see UpdateRateBasedRule), insert a RateBasedRule into a WebACL or delete one from a WebACL (see UpdateWebACL), or delete a RateBasedRule from AWS WAF (see DeleteRateBasedRule).
    */
  var RuleId: ResourceId
}

object RateBasedRule {
  @scala.inline
  def apply(
    MatchPredicates: Predicates,
    RateKey: RateKey,
    RateLimit: RateLimit,
    RuleId: ResourceId,
    MetricName: MetricName = null,
    Name: ResourceName = null
  ): RateBasedRule = {
    val __obj = js.Dynamic.literal(MatchPredicates = MatchPredicates, RateKey = RateKey.asInstanceOf[js.Any], RateLimit = RateLimit, RuleId = RuleId)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[RateBasedRule]
  }
}

