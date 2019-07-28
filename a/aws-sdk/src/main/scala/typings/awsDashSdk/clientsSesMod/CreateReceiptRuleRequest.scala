package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReceiptRuleRequest extends js.Object {
  /**
    * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule will be inserted at the beginning of the rule list.
    */
  var After: js.UndefOr[ReceiptRuleName] = js.undefined
  /**
    * A data structure that contains the specified rule's name, actions, recipients, domains, enabled status, scan status, and TLS policy.
    */
  var Rule: ReceiptRule
  /**
    * The name of the rule set that the receipt rule will be added to.
    */
  var RuleSetName: ReceiptRuleSetName
}

object CreateReceiptRuleRequest {
  @scala.inline
  def apply(Rule: ReceiptRule, RuleSetName: ReceiptRuleSetName, After: ReceiptRuleName = null): CreateReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule, RuleSetName = RuleSetName)
    if (After != null) __obj.updateDynamic("After")(After)
    __obj.asInstanceOf[CreateReceiptRuleRequest]
  }
}

