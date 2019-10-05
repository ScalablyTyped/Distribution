package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyFleetRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2 Fleet.
    */
  var ExcessCapacityTerminationPolicy: js.UndefOr[FleetExcessCapacityTerminationPolicy] = js.undefined
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: FleetIdentifier
  /**
    * The size of the EC2 Fleet.
    */
  var TargetCapacitySpecification: TargetCapacitySpecificationRequest
}

object ModifyFleetRequest {
  @scala.inline
  def apply(
    FleetId: FleetIdentifier,
    TargetCapacitySpecification: TargetCapacitySpecificationRequest,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    ExcessCapacityTerminationPolicy: FleetExcessCapacityTerminationPolicy = null
  ): ModifyFleetRequest = {
    val __obj = js.Dynamic.literal(FleetId = FleetId, TargetCapacitySpecification = TargetCapacitySpecification)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (ExcessCapacityTerminationPolicy != null) __obj.updateDynamic("ExcessCapacityTerminationPolicy")(ExcessCapacityTerminationPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyFleetRequest]
  }
}

