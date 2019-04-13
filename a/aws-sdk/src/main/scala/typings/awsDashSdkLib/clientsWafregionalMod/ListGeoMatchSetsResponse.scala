package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGeoMatchSetsResponse extends js.Object {
  /**
    * An array of GeoMatchSetSummary objects.
    */
  var GeoMatchSets: js.UndefOr[GeoMatchSetSummaries] = js.undefined
  /**
    * If you have more GeoMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more GeoMatchSet objects, submit another ListGeoMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[NextMarker] = js.undefined
}

object ListGeoMatchSetsResponse {
  @scala.inline
  def apply(GeoMatchSets: GeoMatchSetSummaries = null, NextMarker: NextMarker = null): ListGeoMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (GeoMatchSets != null) __obj.updateDynamic("GeoMatchSets")(GeoMatchSets)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListGeoMatchSetsResponse]
  }
}

