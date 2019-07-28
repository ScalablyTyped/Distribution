package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCapacityReservationUsageRequest extends js.Object {
  var CapacityReservationId: String
  var DryRun: js.UndefOr[Boolean] = js.undefined
  var MaxResults: js.UndefOr[GetCapacityReservationUsageRequestMaxResults] = js.undefined
  var NextToken: js.UndefOr[String] = js.undefined
}

object GetCapacityReservationUsageRequest {
  @scala.inline
  def apply(
    CapacityReservationId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    MaxResults: js.UndefOr[GetCapacityReservationUsageRequestMaxResults] = js.undefined,
    NextToken: String = null
  ): GetCapacityReservationUsageRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetCapacityReservationUsageRequest]
  }
}

