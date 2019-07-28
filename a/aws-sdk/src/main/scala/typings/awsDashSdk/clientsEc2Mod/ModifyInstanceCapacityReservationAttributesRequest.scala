package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyInstanceCapacityReservationAttributesRequest extends js.Object {
  /**
    * Information about the Capacity Reservation targeting option.
    */
  var CapacityReservationSpecification: typings.awsDashSdk.clientsEc2Mod.CapacityReservationSpecification
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the instance to be modified.
    */
  var InstanceId: String
}

object ModifyInstanceCapacityReservationAttributesRequest {
  @scala.inline
  def apply(
    CapacityReservationSpecification: CapacityReservationSpecification,
    InstanceId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyInstanceCapacityReservationAttributesRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationSpecification = CapacityReservationSpecification, InstanceId = InstanceId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ModifyInstanceCapacityReservationAttributesRequest]
  }
}

