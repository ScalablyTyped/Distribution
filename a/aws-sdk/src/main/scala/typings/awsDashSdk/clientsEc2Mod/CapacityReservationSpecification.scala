package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationSpecification extends js.Object {
  /**
    * Indicates the instance's Capacity Reservation preferences. Possible preferences include:    open - The instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).    none - The instance avoids running in a Capacity Reservation even if one is available. The instance runs as an On-Demand Instance.  
    */
  var CapacityReservationPreference: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CapacityReservationPreference] = js.native
  /**
    * Information about the target Capacity Reservation.
    */
  var CapacityReservationTarget: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CapacityReservationTarget] = js.native
}

object CapacityReservationSpecification {
  @scala.inline
  def apply(
    CapacityReservationPreference: CapacityReservationPreference = null,
    CapacityReservationTarget: CapacityReservationTarget = null
  ): CapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    if (CapacityReservationPreference != null) __obj.updateDynamic("CapacityReservationPreference")(CapacityReservationPreference.asInstanceOf[js.Any])
    if (CapacityReservationTarget != null) __obj.updateDynamic("CapacityReservationTarget")(CapacityReservationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationSpecification]
  }
}

