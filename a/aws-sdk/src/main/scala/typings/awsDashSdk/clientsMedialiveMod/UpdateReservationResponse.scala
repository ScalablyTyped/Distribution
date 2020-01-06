package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReservationResponse extends js.Object {
  var Reservation: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Reservation] = js.native
}

object UpdateReservationResponse {
  @scala.inline
  def apply(Reservation: Reservation = null): UpdateReservationResponse = {
    val __obj = js.Dynamic.literal()
    if (Reservation != null) __obj.updateDynamic("Reservation")(Reservation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReservationResponse]
  }
}

