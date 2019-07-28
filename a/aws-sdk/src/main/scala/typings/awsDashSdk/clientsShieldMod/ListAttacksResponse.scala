package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAttacksResponse extends js.Object {
  /**
    * The attack information for the specified time range.
    */
  var AttackSummaries: js.UndefOr[typings.awsDashSdk.clientsShieldMod.AttackSummaries] = js.undefined
  /**
    * The token returned by a previous call to indicate that there is more data available. If not null, more results are available. Pass this value for the NextMarker parameter in a subsequent call to ListAttacks to retrieve the next set of items. AWS WAF might return the list of AttackSummary objects in batches smaller than the number specified by MaxResults. If there are more AttackSummary objects to return, AWS WAF will always also return a NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object ListAttacksResponse {
  @scala.inline
  def apply(AttackSummaries: AttackSummaries = null, NextToken: Token = null): ListAttacksResponse = {
    val __obj = js.Dynamic.literal()
    if (AttackSummaries != null) __obj.updateDynamic("AttackSummaries")(AttackSummaries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAttacksResponse]
  }
}

