package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRegexPatternSetsResponse extends js.Object {
  /**
    * If you have more RegexPatternSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexPatternSet objects, submit another ListRegexPatternSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[NextMarker] = js.undefined
  /**
    * An array of RegexPatternSetSummary objects.
    */
  var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.undefined
}

object ListRegexPatternSetsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, RegexPatternSets: RegexPatternSetSummaries = null): ListRegexPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (RegexPatternSets != null) __obj.updateDynamic("RegexPatternSets")(RegexPatternSets)
    __obj.asInstanceOf[ListRegexPatternSetsResponse]
  }
}

