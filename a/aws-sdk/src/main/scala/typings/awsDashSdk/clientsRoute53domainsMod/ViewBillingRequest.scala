package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewBillingRequest extends js.Object {
  /**
    * The end date and time for the time period for which you want a list of billing records. Specify the date and time in Coordinated Universal time (UTC).
    */
  var End: js.UndefOr[Timestamp] = js.native
  /**
    * For an initial request for a list of billing records, omit this element. If the number of billing records that are associated with the current AWS account during the specified period is greater than the value that you specified for MaxItems, you can use Marker to return additional billing records. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.  Constraints: The marker must match the value of NextPageMarker that was returned in the previous response.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * The number of billing records to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * The beginning date and time for the time period for which you want a list of billing records. Specify the date and time in Coordinated Universal time (UTC).
    */
  var Start: js.UndefOr[Timestamp] = js.native
}

object ViewBillingRequest {
  @scala.inline
  def apply(
    End: Timestamp = null,
    Marker: PageMarker = null,
    MaxItems: Int | Double = null,
    Start: Timestamp = null
  ): ViewBillingRequest = {
    val __obj = js.Dynamic.literal()
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBillingRequest]
  }
}

