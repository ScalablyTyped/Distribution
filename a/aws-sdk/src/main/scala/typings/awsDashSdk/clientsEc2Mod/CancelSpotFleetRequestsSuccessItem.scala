package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSpotFleetRequestsSuccessItem extends js.Object {
  /**
    * The current state of the Spot Fleet request.
    */
  var CurrentSpotFleetRequestState: js.UndefOr[BatchState] = js.undefined
  /**
    * The previous state of the Spot Fleet request.
    */
  var PreviousSpotFleetRequestState: js.UndefOr[BatchState] = js.undefined
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}

object CancelSpotFleetRequestsSuccessItem {
  @scala.inline
  def apply(
    CurrentSpotFleetRequestState: BatchState = null,
    PreviousSpotFleetRequestState: BatchState = null,
    SpotFleetRequestId: String = null
  ): CancelSpotFleetRequestsSuccessItem = {
    val __obj = js.Dynamic.literal()
    if (CurrentSpotFleetRequestState != null) __obj.updateDynamic("CurrentSpotFleetRequestState")(CurrentSpotFleetRequestState.asInstanceOf[js.Any])
    if (PreviousSpotFleetRequestState != null) __obj.updateDynamic("PreviousSpotFleetRequestState")(PreviousSpotFleetRequestState.asInstanceOf[js.Any])
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId)
    __obj.asInstanceOf[CancelSpotFleetRequestsSuccessItem]
  }
}

