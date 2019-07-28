package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapacityReservationSpecificationResponse extends js.Object {
  /**
    * Describes the instance's Capacity Reservation preferences. Possible preferences include:    open - The instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).    none - The instance avoids running in a Capacity Reservation even if one is available. The instance runs in On-Demand capacity.  
    */
  var CapacityReservationPreference: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CapacityReservationPreference] = js.undefined
  /**
    * Information about the targeted Capacity Reservation.
    */
  var CapacityReservationTarget: js.UndefOr[CapacityReservationTargetResponse] = js.undefined
}

object CapacityReservationSpecificationResponse {
  @scala.inline
  def apply(
    CapacityReservationPreference: CapacityReservationPreference = null,
    CapacityReservationTarget: CapacityReservationTargetResponse = null
  ): CapacityReservationSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservationPreference != null) __obj.updateDynamic("CapacityReservationPreference")(CapacityReservationPreference.asInstanceOf[js.Any])
    if (CapacityReservationTarget != null) __obj.updateDynamic("CapacityReservationTarget")(CapacityReservationTarget)
    __obj.asInstanceOf[CapacityReservationSpecificationResponse]
  }
}

