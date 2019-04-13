package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReceiptRuleSetsRequest extends js.Object {
  /**
    * A token returned from a previous call to ListReceiptRuleSets to indicate the position in the receipt rule set list.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListReceiptRuleSetsRequest {
  @scala.inline
  def apply(NextToken: NextToken = null): ListReceiptRuleSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListReceiptRuleSetsRequest]
  }
}

