package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlarmHistoryInput extends js.Object {
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.AlarmName] = js.undefined
  /**
    * The ending date to retrieve alarm history.
    */
  var EndDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The type of alarm histories to retrieve.
    */
  var HistoryItemType: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.HistoryItemType] = js.undefined
  /**
    * The maximum number of alarm history records to retrieve.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MaxRecords] = js.undefined
  /**
    * The token returned by a previous call to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.undefined
  /**
    * The starting date to retrieve alarm history.
    */
  var StartDate: js.UndefOr[Timestamp] = js.undefined
}

object DescribeAlarmHistoryInput {
  @scala.inline
  def apply(
    AlarmName: AlarmName = null,
    EndDate: Timestamp = null,
    HistoryItemType: HistoryItemType = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: NextToken = null,
    StartDate: Timestamp = null
  ): DescribeAlarmHistoryInput = {
    val __obj = js.Dynamic.literal()
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName)
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (HistoryItemType != null) __obj.updateDynamic("HistoryItemType")(HistoryItemType.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    __obj.asInstanceOf[DescribeAlarmHistoryInput]
  }
}

