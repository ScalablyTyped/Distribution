package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCapacityReservationResult extends js.Object {
  /**
    * Information about the Capacity Reservation.
    */
  var CapacityReservation: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CapacityReservation] = js.native
}

object CreateCapacityReservationResult {
  @scala.inline
  def apply(CapacityReservation: CapacityReservation = null): CreateCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservation != null) __obj.updateDynamic("CapacityReservation")(CapacityReservation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCapacityReservationResult]
  }
}

