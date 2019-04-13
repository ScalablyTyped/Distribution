package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeReservationRequest extends js.Object {
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: __string
}

object DescribeReservationRequest {
  @scala.inline
  def apply(ReservationId: __string): DescribeReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId)
  
    __obj.asInstanceOf[DescribeReservationRequest]
  }
}

