package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRateBasedRuleResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  /**
    * The RateBasedRule that is returned in the CreateRateBasedRule response.
    */
  var Rule: js.UndefOr[RateBasedRule] = js.undefined
}

object CreateRateBasedRuleResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, Rule: RateBasedRule = null): CreateRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (Rule != null) __obj.updateDynamic("Rule")(Rule)
    __obj.asInstanceOf[CreateRateBasedRuleResponse]
  }
}

