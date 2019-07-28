package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCapacityReservationUsageResult extends js.Object {
  var AvailableInstanceCount: js.UndefOr[Integer] = js.undefined
  var CapacityReservationId: js.UndefOr[String] = js.undefined
  var InstanceType: js.UndefOr[String] = js.undefined
  var InstanceUsages: js.UndefOr[InstanceUsageSet] = js.undefined
  var NextToken: js.UndefOr[String] = js.undefined
  var State: js.UndefOr[CapacityReservationState] = js.undefined
  var TotalInstanceCount: js.UndefOr[Integer] = js.undefined
}

object GetCapacityReservationUsageResult {
  @scala.inline
  def apply(
    AvailableInstanceCount: js.UndefOr[Integer] = js.undefined,
    CapacityReservationId: String = null,
    InstanceType: String = null,
    InstanceUsages: InstanceUsageSet = null,
    NextToken: String = null,
    State: CapacityReservationState = null,
    TotalInstanceCount: js.UndefOr[Integer] = js.undefined
  ): GetCapacityReservationUsageResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AvailableInstanceCount)) __obj.updateDynamic("AvailableInstanceCount")(AvailableInstanceCount)
    if (CapacityReservationId != null) __obj.updateDynamic("CapacityReservationId")(CapacityReservationId)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (InstanceUsages != null) __obj.updateDynamic("InstanceUsages")(InstanceUsages)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalInstanceCount)) __obj.updateDynamic("TotalInstanceCount")(TotalInstanceCount)
    __obj.asInstanceOf[GetCapacityReservationUsageResult]
  }
}

