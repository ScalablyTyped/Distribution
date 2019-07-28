package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHostedZonesResponse extends js.Object {
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZones: typings.awsDashSdk.clientsRoute53Mod.HostedZones
  /**
    * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get more hosted zones by submitting another ListHostedZones request and specifying the value of NextMarker in the marker parameter.
    */
  var IsTruncated: PageTruncated
  /**
    * For the second and subsequent calls to ListHostedZones, Marker is the value that you specified for the marker parameter in the request that produced the current response.
    */
  var Marker: PageMarker
  /**
    * The value that you specified for the maxitems parameter in the call to ListHostedZones that produced the current response.
    */
  var MaxItems: PageMaxItems
  /**
    * If IsTruncated is true, the value of NextMarker identifies the first hosted zone in the next group of hosted zones. Submit another ListHostedZones request, and specify the value of NextMarker from the response in the marker parameter. This element is present only if IsTruncated is true.
    */
  var NextMarker: js.UndefOr[PageMarker] = js.undefined
}

object ListHostedZonesResponse {
  @scala.inline
  def apply(
    HostedZones: HostedZones,
    IsTruncated: PageTruncated,
    Marker: PageMarker,
    MaxItems: PageMaxItems,
    NextMarker: PageMarker = null
  ): ListHostedZonesResponse = {
    val __obj = js.Dynamic.literal(HostedZones = HostedZones, IsTruncated = IsTruncated, Marker = Marker, MaxItems = MaxItems)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListHostedZonesResponse]
  }
}

