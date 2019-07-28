package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRateBasedRuleRequest extends js.Object {
  /**
    * The RuleId of the RateBasedRule that you want to get. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId
}

object GetRateBasedRuleRequest {
  @scala.inline
  def apply(RuleId: ResourceId): GetRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(RuleId = RuleId)
  
    __obj.asInstanceOf[GetRateBasedRuleRequest]
  }
}

