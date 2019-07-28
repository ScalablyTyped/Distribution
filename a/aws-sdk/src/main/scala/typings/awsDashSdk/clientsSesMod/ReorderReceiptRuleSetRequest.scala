package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReorderReceiptRuleSetRequest extends js.Object {
  /**
    * A list of the specified receipt rule set's receipt rules in the order that you want to put them.
    */
  var RuleNames: ReceiptRuleNamesList
  /**
    * The name of the receipt rule set to reorder.
    */
  var RuleSetName: ReceiptRuleSetName
}

object ReorderReceiptRuleSetRequest {
  @scala.inline
  def apply(RuleNames: ReceiptRuleNamesList, RuleSetName: ReceiptRuleSetName): ReorderReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames, RuleSetName = RuleSetName)
  
    __obj.asInstanceOf[ReorderReceiptRuleSetRequest]
  }
}

