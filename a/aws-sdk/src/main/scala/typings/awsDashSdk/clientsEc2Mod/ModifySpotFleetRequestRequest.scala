package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifySpotFleetRequestRequest extends js.Object {
  /**
    * Indicates whether running Spot Instances should be terminated if the target capacity of the Spot Fleet request is decreased below the current size of the Spot Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ExcessCapacityTerminationPolicy] = js.undefined
  /**
    * The number of On-Demand Instances in the fleet.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: String
  /**
    * The size of the fleet.
    */
  var TargetCapacity: js.UndefOr[Integer] = js.undefined
}

object ModifySpotFleetRequestRequest {
  @scala.inline
  def apply(
    SpotFleetRequestId: String,
    ExcessCapacityTerminationPolicy: ExcessCapacityTerminationPolicy = null,
    OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined,
    TargetCapacity: js.UndefOr[Integer] = js.undefined
  ): ModifySpotFleetRequestRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestId = SpotFleetRequestId)
    if (ExcessCapacityTerminationPolicy != null) __obj.updateDynamic("ExcessCapacityTerminationPolicy")(ExcessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(OnDemandTargetCapacity)) __obj.updateDynamic("OnDemandTargetCapacity")(OnDemandTargetCapacity)
    if (!js.isUndefined(TargetCapacity)) __obj.updateDynamic("TargetCapacity")(TargetCapacity)
    __obj.asInstanceOf[ModifySpotFleetRequestRequest]
  }
}

