package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlarmHistoryItem extends js.Object {
  /**
    * The descriptive name for the alarm.
    */
  var AlarmName: js.UndefOr[AlarmName] = js.undefined
  /**
    * Data about the alarm, in JSON format.
    */
  var HistoryData: js.UndefOr[HistoryData] = js.undefined
  /**
    * The type of alarm history item.
    */
  var HistoryItemType: js.UndefOr[HistoryItemType] = js.undefined
  /**
    * A summary of the alarm history, in text format.
    */
  var HistorySummary: js.UndefOr[HistorySummary] = js.undefined
  /**
    * The time stamp for the alarm history item.
    */
  var Timestamp: js.UndefOr[Timestamp] = js.undefined
}

object AlarmHistoryItem {
  @scala.inline
  def apply(
    AlarmName: AlarmName = null,
    HistoryData: HistoryData = null,
    HistoryItemType: HistoryItemType = null,
    HistorySummary: HistorySummary = null,
    Timestamp: Timestamp = null
  ): AlarmHistoryItem = {
    val __obj = js.Dynamic.literal()
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName)
    if (HistoryData != null) __obj.updateDynamic("HistoryData")(HistoryData)
    if (HistoryItemType != null) __obj.updateDynamic("HistoryItemType")(HistoryItemType.asInstanceOf[js.Any])
    if (HistorySummary != null) __obj.updateDynamic("HistorySummary")(HistorySummary)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[AlarmHistoryItem]
  }
}

