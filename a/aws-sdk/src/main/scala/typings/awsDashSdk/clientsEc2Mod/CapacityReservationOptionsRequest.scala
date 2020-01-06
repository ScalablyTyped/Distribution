package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityReservationOptionsRequest extends js.Object {
  /**
    * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity. If you specify use-capacity-reservations-first, the fleet uses unused Capacity Reservations to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity Reservations, the On-Demand allocation strategy (lowest-price or prioritized) is applied. If the number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand target capacity is launched according to the On-Demand allocation strategy (lowest-price or prioritized). If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand allocation strategy.
    */
  var UsageStrategy: js.UndefOr[FleetCapacityReservationUsageStrategy] = js.native
}

object CapacityReservationOptionsRequest {
  @scala.inline
  def apply(UsageStrategy: FleetCapacityReservationUsageStrategy = null): CapacityReservationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (UsageStrategy != null) __obj.updateDynamic("UsageStrategy")(UsageStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityReservationOptionsRequest]
  }
}

