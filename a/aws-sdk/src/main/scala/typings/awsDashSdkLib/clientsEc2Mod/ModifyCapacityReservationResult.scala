package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCapacityReservationResult extends js.Object {
  /**
    * Information about the Capacity Reservation.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}

object ModifyCapacityReservationResult {
  @scala.inline
  def apply(Return: js.UndefOr[Boolean] = js.undefined): ModifyCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return)
    __obj.asInstanceOf[ModifyCapacityReservationResult]
  }
}

