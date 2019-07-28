package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateReservationRequest extends js.Object {
  /**
    * Name of the reservation
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: __string
}

object UpdateReservationRequest {
  @scala.inline
  def apply(ReservationId: __string, Name: __string = null): UpdateReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateReservationRequest]
  }
}

