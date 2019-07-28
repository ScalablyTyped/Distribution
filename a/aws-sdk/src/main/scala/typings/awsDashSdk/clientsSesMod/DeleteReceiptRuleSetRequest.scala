package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReceiptRuleSetRequest extends js.Object {
  /**
    * The name of the receipt rule set to delete.
    */
  var RuleSetName: ReceiptRuleSetName
}

object DeleteReceiptRuleSetRequest {
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName): DeleteReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName)
  
    __obj.asInstanceOf[DeleteReceiptRuleSetRequest]
  }
}

