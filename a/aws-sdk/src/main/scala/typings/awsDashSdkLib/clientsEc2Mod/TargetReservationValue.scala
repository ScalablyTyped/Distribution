package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetReservationValue extends js.Object {
  /**
    * The total value of the Convertible Reserved Instances that make up the exchange. This is the sum of the list value, remaining upfront price, and additional upfront cost of the exchange.
    */
  var ReservationValue: js.UndefOr[ReservationValue] = js.undefined
  /**
    * The configuration of the Convertible Reserved Instances that make up the exchange.
    */
  var TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined
}

object TargetReservationValue {
  @scala.inline
  def apply(ReservationValue: ReservationValue = null, TargetConfiguration: TargetConfiguration = null): TargetReservationValue = {
    val __obj = js.Dynamic.literal()
    if (ReservationValue != null) __obj.updateDynamic("ReservationValue")(ReservationValue)
    if (TargetConfiguration != null) __obj.updateDynamic("TargetConfiguration")(TargetConfiguration)
    __obj.asInstanceOf[TargetReservationValue]
  }
}

