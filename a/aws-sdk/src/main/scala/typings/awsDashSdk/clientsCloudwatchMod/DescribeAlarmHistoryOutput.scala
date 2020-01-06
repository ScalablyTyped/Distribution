package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmHistoryOutput extends js.Object {
  /**
    * The alarm histories, in JSON format.
    */
  var AlarmHistoryItems: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.AlarmHistoryItems] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.native
}

object DescribeAlarmHistoryOutput {
  @scala.inline
  def apply(AlarmHistoryItems: AlarmHistoryItems = null, NextToken: NextToken = null): DescribeAlarmHistoryOutput = {
    val __obj = js.Dynamic.literal()
    if (AlarmHistoryItems != null) __obj.updateDynamic("AlarmHistoryItems")(AlarmHistoryItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmHistoryOutput]
  }
}

