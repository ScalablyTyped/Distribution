package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetActiveReceiptRuleSetRequest extends js.Object {
  /**
    * The name of the receipt rule set to make active. Setting this value to null disables all email receiving.
    */
  var RuleSetName: js.UndefOr[ReceiptRuleSetName] = js.undefined
}

object SetActiveReceiptRuleSetRequest {
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName = null): SetActiveReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal()
    if (RuleSetName != null) __obj.updateDynamic("RuleSetName")(RuleSetName)
    __obj.asInstanceOf[SetActiveReceiptRuleSetRequest]
  }
}

