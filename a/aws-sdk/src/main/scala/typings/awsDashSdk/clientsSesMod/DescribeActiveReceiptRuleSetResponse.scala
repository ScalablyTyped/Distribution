package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActiveReceiptRuleSetResponse extends js.Object {
  /**
    * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and a timestamp of when the rule set was created.
    */
  var Metadata: js.UndefOr[ReceiptRuleSetMetadata] = js.undefined
  /**
    * The receipt rules that belong to the active rule set.
    */
  var Rules: js.UndefOr[ReceiptRulesList] = js.undefined
}

object DescribeActiveReceiptRuleSetResponse {
  @scala.inline
  def apply(Metadata: ReceiptRuleSetMetadata = null, Rules: ReceiptRulesList = null): DescribeActiveReceiptRuleSetResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[DescribeActiveReceiptRuleSetResponse]
  }
}

