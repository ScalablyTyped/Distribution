package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetHistoryResult extends js.Object {
  /**
    * The ID of the EC Fleet.
    */
  var FleetId: js.UndefOr[FleetIdentifier] = js.undefined
  /**
    * Information about the events in the history of the EC2 Fleet.
    */
  var HistoryRecords: js.UndefOr[HistoryRecordSet] = js.undefined
  /**
    * The last date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). All records up to this time were retrieved. If nextToken indicates that there are more results, this value is not present.
    */
  var LastEvaluatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The start date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
}

object DescribeFleetHistoryResult {
  @scala.inline
  def apply(
    FleetId: FleetIdentifier = null,
    HistoryRecords: HistoryRecordSet = null,
    LastEvaluatedTime: DateTime = null,
    NextToken: String = null,
    StartTime: DateTime = null
  ): DescribeFleetHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (HistoryRecords != null) __obj.updateDynamic("HistoryRecords")(HistoryRecords)
    if (LastEvaluatedTime != null) __obj.updateDynamic("LastEvaluatedTime")(LastEvaluatedTime)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[DescribeFleetHistoryResult]
  }
}

