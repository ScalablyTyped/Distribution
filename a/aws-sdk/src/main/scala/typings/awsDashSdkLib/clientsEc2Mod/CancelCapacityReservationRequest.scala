package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelCapacityReservationRequest extends js.Object {
  /**
    * The ID of the Capacity Reservation to be cancelled.
    */
  var CapacityReservationId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object CancelCapacityReservationRequest {
  @scala.inline
  def apply(CapacityReservationId: String, DryRun: js.UndefOr[Boolean] = js.undefined): CancelCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CancelCapacityReservationRequest]
  }
}

