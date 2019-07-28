package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIPSetsResponse extends js.Object {
  /**
    * An array of IPSetSummary objects.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.undefined
  /**
    * If you have more IPSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more IPSet objects, submit another ListIPSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.undefined
}

object ListIPSetsResponse {
  @scala.inline
  def apply(IPSets: IPSetSummaries = null, NextMarker: NextMarker = null): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (IPSets != null) __obj.updateDynamic("IPSets")(IPSets)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListIPSetsResponse]
  }
}

