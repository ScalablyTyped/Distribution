package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReservationRequest extends js.Object {
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: __string = js.native
}

object DeleteReservationRequest {
  @scala.inline
  def apply(ReservationId: __string): DeleteReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReservationRequest]
  }
}

