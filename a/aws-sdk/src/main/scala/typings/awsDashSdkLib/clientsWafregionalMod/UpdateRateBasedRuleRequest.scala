package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRateBasedRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: awsDashSdkLib.clientsWafregionalMod.ChangeToken
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: awsDashSdkLib.clientsWafregionalMod.RateLimit
  /**
    * The RuleId of the RateBasedRule that you want to update. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId
  /**
    * An array of RuleUpdate objects that you want to insert into or delete from a RateBasedRule. 
    */
  var Updates: RuleUpdates
}

object UpdateRateBasedRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RateLimit: RateLimit, RuleId: ResourceId, Updates: RuleUpdates): UpdateRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, RateLimit = RateLimit, RuleId = RuleId, Updates = Updates)
  
    __obj.asInstanceOf[UpdateRateBasedRuleRequest]
  }
}

