package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateReservationResponse extends js.Object {
  var Reservation: js.UndefOr[Reservation] = js.undefined
}

object UpdateReservationResponse {
  @scala.inline
  def apply(Reservation: Reservation = null): UpdateReservationResponse = {
    val __obj = js.Dynamic.literal()
    if (Reservation != null) __obj.updateDynamic("Reservation")(Reservation)
    __obj.asInstanceOf[UpdateReservationResponse]
  }
}

