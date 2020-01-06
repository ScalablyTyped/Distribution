package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSpotFleetRequestHistoryResponse extends js.Object {
  /**
    * Information about the events in the history of the Spot Fleet request.
    */
  var HistoryRecords: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.HistoryRecords] = js.native
  /**
    * The last date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). All records up to this time were retrieved. If nextToken indicates that there are more results, this value is not present.
    */
  var LastEvaluatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
  /**
    * The starting date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[DateTime] = js.native
}

object DescribeSpotFleetRequestHistoryResponse {
  @scala.inline
  def apply(
    HistoryRecords: HistoryRecords = null,
    LastEvaluatedTime: DateTime = null,
    NextToken: String = null,
    SpotFleetRequestId: String = null,
    StartTime: DateTime = null
  ): DescribeSpotFleetRequestHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (HistoryRecords != null) __obj.updateDynamic("HistoryRecords")(HistoryRecords.asInstanceOf[js.Any])
    if (LastEvaluatedTime != null) __obj.updateDynamic("LastEvaluatedTime")(LastEvaluatedTime.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSpotFleetRequestHistoryResponse]
  }
}

