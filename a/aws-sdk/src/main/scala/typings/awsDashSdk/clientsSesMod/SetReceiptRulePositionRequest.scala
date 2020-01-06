package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetReceiptRulePositionRequest extends js.Object {
  /**
    * The name of the receipt rule after which to place the specified receipt rule.
    */
  var After: js.UndefOr[ReceiptRuleName] = js.native
  /**
    * The name of the receipt rule to reposition.
    */
  var RuleName: ReceiptRuleName = js.native
  /**
    * The name of the receipt rule set that contains the receipt rule to reposition.
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}

object SetReceiptRulePositionRequest {
  @scala.inline
  def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName, After: ReceiptRuleName = null): SetReceiptRulePositionRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], RuleSetName = RuleSetName.asInstanceOf[js.Any])
    if (After != null) __obj.updateDynamic("After")(After.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetReceiptRulePositionRequest]
  }
}

