package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReservationCoverageResponse extends js.Object {
  /**
    * The amount of time that your reservations covered.
    */
  var CoveragesByTime: typings.awsDashSdk.clientsCostexplorerMod.CoveragesByTime
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  /**
    * The total amount of instance usage that a reservation covered.
    */
  var Total: js.UndefOr[Coverage] = js.undefined
}

object GetReservationCoverageResponse {
  @scala.inline
  def apply(CoveragesByTime: CoveragesByTime, NextPageToken: NextPageToken = null, Total: Coverage = null): GetReservationCoverageResponse = {
    val __obj = js.Dynamic.literal(CoveragesByTime = CoveragesByTime)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (Total != null) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[GetReservationCoverageResponse]
  }
}

