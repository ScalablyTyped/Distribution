package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReceiptRuleSetsResponse extends js.Object {
  /**
    * A token indicating that there are additional receipt rule sets available to be listed. Pass this token to successive calls of ListReceiptRuleSets to retrieve up to 100 receipt rule sets at a time.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSesMod.NextToken] = js.undefined
  /**
    * The metadata for the currently active receipt rule set. The metadata consists of the rule set name and the timestamp of when the rule set was created.
    */
  var RuleSets: js.UndefOr[ReceiptRuleSetsLists] = js.undefined
}

object ListReceiptRuleSetsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RuleSets: ReceiptRuleSetsLists = null): ListReceiptRuleSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RuleSets != null) __obj.updateDynamic("RuleSets")(RuleSets)
    __obj.asInstanceOf[ListReceiptRuleSetsResponse]
  }
}

