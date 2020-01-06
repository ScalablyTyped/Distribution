package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReceiptRuleResponse extends js.Object {
  /**
    * A data structure that contains the specified receipt rule's name, actions, recipients, domains, enabled status, scan status, and Transport Layer Security (TLS) policy.
    */
  var Rule: js.UndefOr[ReceiptRule] = js.native
}

object DescribeReceiptRuleResponse {
  @scala.inline
  def apply(Rule: ReceiptRule = null): DescribeReceiptRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (Rule != null) __obj.updateDynamic("Rule")(Rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReceiptRuleResponse]
  }
}

