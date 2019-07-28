package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePendingAggregationRequestsResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Returns a PendingAggregationRequests object.
    */
  var PendingAggregationRequests: js.UndefOr[PendingAggregationRequestList] = js.undefined
}

object DescribePendingAggregationRequestsResponse {
  @scala.inline
  def apply(NextToken: String = null, PendingAggregationRequests: PendingAggregationRequestList = null): DescribePendingAggregationRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PendingAggregationRequests != null) __obj.updateDynamic("PendingAggregationRequests")(PendingAggregationRequests)
    __obj.asInstanceOf[DescribePendingAggregationRequestsResponse]
  }
}

