package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSizeConstraintSetsResponse extends js.Object {
  /**
    * If you have more SizeConstraintSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SizeConstraintSet objects, submit another ListSizeConstraintSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafMod.NextMarker] = js.native
  /**
    * An array of SizeConstraintSetSummary objects.
    */
  var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries] = js.native
}

object ListSizeConstraintSetsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, SizeConstraintSets: SizeConstraintSetSummaries = null): ListSizeConstraintSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (SizeConstraintSets != null) __obj.updateDynamic("SizeConstraintSets")(SizeConstraintSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSizeConstraintSetsResponse]
  }
}

