package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateReceiptRuleRequest extends js.Object {
  /**
    * A data structure that contains the updated receipt rule information.
    */
  var Rule: ReceiptRule
  /**
    * The name of the receipt rule set that the receipt rule belongs to.
    */
  var RuleSetName: ReceiptRuleSetName
}

object UpdateReceiptRuleRequest {
  @scala.inline
  def apply(Rule: ReceiptRule, RuleSetName: ReceiptRuleSetName): UpdateReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule, RuleSetName = RuleSetName)
  
    __obj.asInstanceOf[UpdateReceiptRuleRequest]
  }
}

