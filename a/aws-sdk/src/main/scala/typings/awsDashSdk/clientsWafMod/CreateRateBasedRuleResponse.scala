package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRateBasedRuleResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.native
  /**
    * The RateBasedRule that is returned in the CreateRateBasedRule response.
    */
  var Rule: js.UndefOr[RateBasedRule] = js.native
}

object CreateRateBasedRuleResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, Rule: RateBasedRule = null): CreateRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    if (Rule != null) __obj.updateDynamic("Rule")(Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRateBasedRuleResponse]
  }
}

