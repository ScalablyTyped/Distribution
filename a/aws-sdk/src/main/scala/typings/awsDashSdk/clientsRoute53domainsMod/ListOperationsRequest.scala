package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOperationsRequest extends js.Object {
  /**
    * For an initial request for a list of operations, omit this element. If the number of operations that are not yet complete is greater than the value that you specified for MaxItems, you can use Marker to return additional operations. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.
    */
  var Marker: js.UndefOr[PageMarker] = js.undefined
  /**
    * Number of domains to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  /**
    * An optional parameter that lets you get information about all the operations that you submitted after a specified date and time. Specify the date and time in Coordinated Universal time (UTC).
    */
  var SubmittedSince: js.UndefOr[Timestamp] = js.undefined
}

object ListOperationsRequest {
  @scala.inline
  def apply(
    Marker: PageMarker = null,
    MaxItems: js.UndefOr[PageMaxItems] = js.undefined,
    SubmittedSince: Timestamp = null
  ): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (SubmittedSince != null) __obj.updateDynamic("SubmittedSince")(SubmittedSince)
    __obj.asInstanceOf[ListOperationsRequest]
  }
}

