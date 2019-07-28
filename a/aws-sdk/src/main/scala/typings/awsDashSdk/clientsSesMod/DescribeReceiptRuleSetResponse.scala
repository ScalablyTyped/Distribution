package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReceiptRuleSetResponse extends js.Object {
  /**
    * The metadata for the receipt rule set, which consists of the rule set name and the timestamp of when the rule set was created.
    */
  var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined
  /**
    * A list of the receipt rules that belong to the specified receipt rule set.
    */
  var Rules: js.UndefOr[ReceiptRulesList] = js.undefined
}

object DescribeReceiptRuleSetResponse {
  @scala.inline
  def apply(Metadata: ReceiptRuleSetMetadata = null, Rules: ReceiptRulesList = null): DescribeReceiptRuleSetResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[DescribeReceiptRuleSetResponse]
  }
}

