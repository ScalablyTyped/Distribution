package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationValue extends js.Object {
  /**
    * The hourly rate of the reservation.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The balance of the total value (the sum of remainingUpfrontValue + hourlyPrice * number of hours remaining).
    */
  var RemainingTotalValue: js.UndefOr[String] = js.native
  /**
    * The remaining upfront cost of the reservation.
    */
  var RemainingUpfrontValue: js.UndefOr[String] = js.native
}

object ReservationValue {
  @scala.inline
  def apply(
    HourlyPrice: String = null,
    RemainingTotalValue: String = null,
    RemainingUpfrontValue: String = null
  ): ReservationValue = {
    val __obj = js.Dynamic.literal()
    if (HourlyPrice != null) __obj.updateDynamic("HourlyPrice")(HourlyPrice.asInstanceOf[js.Any])
    if (RemainingTotalValue != null) __obj.updateDynamic("RemainingTotalValue")(RemainingTotalValue.asInstanceOf[js.Any])
    if (RemainingUpfrontValue != null) __obj.updateDynamic("RemainingUpfrontValue")(RemainingUpfrontValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationValue]
  }
}

