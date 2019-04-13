package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservationUtilizationGroup extends js.Object {
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * The key for a specific reservation attribute.
    */
  var Key: js.UndefOr[ReservationGroupKey] = js.undefined
  /**
    * How much you used this group of reservations.
    */
  var Utilization: js.UndefOr[ReservationAggregates] = js.undefined
  /**
    * The value of a specific reservation attribute.
    */
  var Value: js.UndefOr[ReservationGroupValue] = js.undefined
}

object ReservationUtilizationGroup {
  @scala.inline
  def apply(
    Attributes: Attributes = null,
    Key: ReservationGroupKey = null,
    Utilization: ReservationAggregates = null,
    Value: ReservationGroupValue = null
  ): ReservationUtilizationGroup = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Utilization != null) __obj.updateDynamic("Utilization")(Utilization)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ReservationUtilizationGroup]
  }
}

