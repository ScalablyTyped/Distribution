package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRulesResponse extends js.Object {
  /**
    * If you have more Rules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more Rules, submit another ListRules request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.undefined
  /**
    * An array of RuleSummary objects.
    */
  var Rules: js.UndefOr[RuleSummaries] = js.undefined
}

object ListRulesResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, Rules: RuleSummaries = null): ListRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[ListRulesResponse]
  }
}

