package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSpotFleetRequestsErrorItem extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[CancelSpotFleetRequestsError] = js.undefined
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}

object CancelSpotFleetRequestsErrorItem {
  @scala.inline
  def apply(Error: CancelSpotFleetRequestsError = null, SpotFleetRequestId: String = null): CancelSpotFleetRequestsErrorItem = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId)
    __obj.asInstanceOf[CancelSpotFleetRequestsErrorItem]
  }
}

