package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegexMatchSetsResponse extends js.Object {
  /**
    * If you have more RegexMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexMatchSet objects, submit another ListRegexMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.native
  /**
    * An array of RegexMatchSetSummary objects.
    */
  var RegexMatchSets: js.UndefOr[RegexMatchSetSummaries] = js.native
}

object ListRegexMatchSetsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, RegexMatchSets: RegexMatchSetSummaries = null): ListRegexMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (RegexMatchSets != null) __obj.updateDynamic("RegexMatchSets")(RegexMatchSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRegexMatchSetsResponse]
  }
}

