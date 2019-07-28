package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlarmHistoryOutput extends js.Object {
  /**
    * The alarm histories, in JSON format.
    */
  var AlarmHistoryItems: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.AlarmHistoryItems] = js.undefined
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.undefined
}

object DescribeAlarmHistoryOutput {
  @scala.inline
  def apply(AlarmHistoryItems: AlarmHistoryItems = null, NextToken: NextToken = null): DescribeAlarmHistoryOutput = {
    val __obj = js.Dynamic.literal()
    if (AlarmHistoryItems != null) __obj.updateDynamic("AlarmHistoryItems")(AlarmHistoryItems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAlarmHistoryOutput]
  }
}

