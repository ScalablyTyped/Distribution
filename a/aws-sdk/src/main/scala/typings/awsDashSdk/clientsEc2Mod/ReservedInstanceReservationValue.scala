package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedInstanceReservationValue extends js.Object {
  /**
    * The total value of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservationValue: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ReservationValue] = js.undefined
  /**
    * The ID of the Convertible Reserved Instance that you are exchanging.
    */
  var ReservedInstanceId: js.UndefOr[String] = js.undefined
}

object ReservedInstanceReservationValue {
  @scala.inline
  def apply(ReservationValue: ReservationValue = null, ReservedInstanceId: String = null): ReservedInstanceReservationValue = {
    val __obj = js.Dynamic.literal()
    if (ReservationValue != null) __obj.updateDynamic("ReservationValue")(ReservationValue)
    if (ReservedInstanceId != null) __obj.updateDynamic("ReservedInstanceId")(ReservedInstanceId)
    __obj.asInstanceOf[ReservedInstanceReservationValue]
  }
}

