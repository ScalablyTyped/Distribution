package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReservationRequest extends js.Object {
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: __string
}

object DeleteReservationRequest {
  @scala.inline
  def apply(ReservationId: __string): DeleteReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId)
  
    __obj.asInstanceOf[DeleteReservationRequest]
  }
}

