package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSpotFleetRequestsResponse extends js.Object {
  /**
    * Information about the Spot Fleet requests that are successfully canceled.
    */
  var SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet] = js.undefined
  /**
    * Information about the Spot Fleet requests that are not successfully canceled.
    */
  var UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet] = js.undefined
}

object CancelSpotFleetRequestsResponse {
  @scala.inline
  def apply(
    SuccessfulFleetRequests: CancelSpotFleetRequestsSuccessSet = null,
    UnsuccessfulFleetRequests: CancelSpotFleetRequestsErrorSet = null
  ): CancelSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (SuccessfulFleetRequests != null) __obj.updateDynamic("SuccessfulFleetRequests")(SuccessfulFleetRequests)
    if (UnsuccessfulFleetRequests != null) __obj.updateDynamic("UnsuccessfulFleetRequests")(UnsuccessfulFleetRequests)
    __obj.asInstanceOf[CancelSpotFleetRequestsResponse]
  }
}

