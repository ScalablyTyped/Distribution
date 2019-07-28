package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetReceiptRulePositionRequest extends js.Object {
  /**
    * The name of the receipt rule after which to place the specified receipt rule.
    */
  var After: js.UndefOr[ReceiptRuleName] = js.undefined
  /**
    * The name of the receipt rule to reposition.
    */
  var RuleName: ReceiptRuleName
  /**
    * The name of the receipt rule set that contains the receipt rule to reposition.
    */
  var RuleSetName: ReceiptRuleSetName
}

object SetReceiptRulePositionRequest {
  @scala.inline
  def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName, After: ReceiptRuleName = null): SetReceiptRulePositionRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName, RuleSetName = RuleSetName)
    if (After != null) __obj.updateDynamic("After")(After)
    __obj.asInstanceOf[SetReceiptRulePositionRequest]
  }
}

