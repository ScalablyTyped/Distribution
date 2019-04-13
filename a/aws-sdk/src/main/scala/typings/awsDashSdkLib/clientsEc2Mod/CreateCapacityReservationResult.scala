package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCapacityReservationResult extends js.Object {
  /**
    * Information about the Capacity Reservation.
    */
  var CapacityReservation: js.UndefOr[CapacityReservation] = js.undefined
}

object CreateCapacityReservationResult {
  @scala.inline
  def apply(CapacityReservation: CapacityReservation = null): CreateCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservation != null) __obj.updateDynamic("CapacityReservation")(CapacityReservation)
    __obj.asInstanceOf[CreateCapacityReservationResult]
  }
}

