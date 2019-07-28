package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRuleGroupResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.ChangeToken] = js.undefined
  /**
    * An empty RuleGroup.
    */
  var RuleGroup: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.RuleGroup] = js.undefined
}

object CreateRuleGroupResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, RuleGroup: RuleGroup = null): CreateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (RuleGroup != null) __obj.updateDynamic("RuleGroup")(RuleGroup)
    __obj.asInstanceOf[CreateRuleGroupResponse]
  }
}

