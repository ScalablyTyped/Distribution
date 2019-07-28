package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListByteMatchSetsResponse extends js.Object {
  /**
    * An array of ByteMatchSetSummary objects.
    */
  var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries] = js.undefined
  /**
    * If you have more ByteMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ByteMatchSet objects, submit another ListByteMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.undefined
}

object ListByteMatchSetsResponse {
  @scala.inline
  def apply(ByteMatchSets: ByteMatchSetSummaries = null, NextMarker: NextMarker = null): ListByteMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (ByteMatchSets != null) __obj.updateDynamic("ByteMatchSets")(ByteMatchSets)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListByteMatchSetsResponse]
  }
}

