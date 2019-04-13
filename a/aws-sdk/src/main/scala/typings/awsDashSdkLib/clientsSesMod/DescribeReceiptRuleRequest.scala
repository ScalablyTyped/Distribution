package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReceiptRuleRequest extends js.Object {
  /**
    * The name of the receipt rule.
    */
  var RuleName: ReceiptRuleName
  /**
    * The name of the receipt rule set that the receipt rule belongs to.
    */
  var RuleSetName: ReceiptRuleSetName
}

object DescribeReceiptRuleRequest {
  @scala.inline
  def apply(RuleName: ReceiptRuleName, RuleSetName: ReceiptRuleSetName): DescribeReceiptRuleRequest = {
    val __obj = js.Dynamic.literal(RuleName = RuleName, RuleSetName = RuleSetName)
  
    __obj.asInstanceOf[DescribeReceiptRuleRequest]
  }
}

