package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotFleetRequestsErrorItem extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[CancelSpotFleetRequestsError] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
}

object CancelSpotFleetRequestsErrorItem {
  @scala.inline
  def apply(Error: CancelSpotFleetRequestsError = null, SpotFleetRequestId: String = null): CancelSpotFleetRequestsErrorItem = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotFleetRequestsErrorItem]
  }
}

