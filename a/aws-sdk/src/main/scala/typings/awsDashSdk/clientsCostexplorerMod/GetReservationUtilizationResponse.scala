package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReservationUtilizationResponse extends js.Object {
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  /**
    * The total amount of time that you used your RIs.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.undefined
  /**
    * The amount of time that you used your RIs.
    */
  var UtilizationsByTime: typings.awsDashSdk.clientsCostexplorerMod.UtilizationsByTime
}

object GetReservationUtilizationResponse {
  @scala.inline
  def apply(
    UtilizationsByTime: UtilizationsByTime,
    NextPageToken: NextPageToken = null,
    Total: ReservationAggregates = null
  ): GetReservationUtilizationResponse = {
    val __obj = js.Dynamic.literal(UtilizationsByTime = UtilizationsByTime)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (Total != null) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[GetReservationUtilizationResponse]
  }
}

