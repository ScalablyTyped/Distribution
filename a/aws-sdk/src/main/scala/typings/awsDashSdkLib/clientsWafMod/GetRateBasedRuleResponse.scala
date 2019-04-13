package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRateBasedRuleResponse extends js.Object {
  /**
    * Information about the RateBasedRule that you specified in the GetRateBasedRule request.
    */
  var Rule: js.UndefOr[RateBasedRule] = js.undefined
}

object GetRateBasedRuleResponse {
  @scala.inline
  def apply(Rule: RateBasedRule = null): GetRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (Rule != null) __obj.updateDynamic("Rule")(Rule)
    __obj.asInstanceOf[GetRateBasedRuleResponse]
  }
}

