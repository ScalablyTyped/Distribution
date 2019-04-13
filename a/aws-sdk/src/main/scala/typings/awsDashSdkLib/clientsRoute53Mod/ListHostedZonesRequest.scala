package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHostedZonesRequest extends js.Object {
  /**
    * If you're using reusable delegation sets and you want to list all of the hosted zones that are associated with a reusable delegation set, specify the ID of that reusable delegation set. 
    */
  var DelegationSetId: js.UndefOr[ResourceId] = js.undefined
  /**
    * If the value of IsTruncated in the previous response was true, you have more hosted zones. To get more hosted zones, submit another ListHostedZones request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more hosted zones to get.
    */
  var Marker: js.UndefOr[PageMarker] = js.undefined
  /**
    * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more than maxitems hosted zones, the value of IsTruncated in the response is true, and the value of NextMarker is the hosted zone ID of the first hosted zone that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
}

object ListHostedZonesRequest {
  @scala.inline
  def apply(DelegationSetId: ResourceId = null, Marker: PageMarker = null, MaxItems: PageMaxItems = null): ListHostedZonesRequest = {
    val __obj = js.Dynamic.literal()
    if (DelegationSetId != null) __obj.updateDynamic("DelegationSetId")(DelegationSetId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[ListHostedZonesRequest]
  }
}

