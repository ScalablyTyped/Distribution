package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlarmHistoryOutput extends js.Object {
  /**
    * The alarm histories, in JSON format.
    */
  var AlarmHistoryItems: js.UndefOr[AlarmHistoryItems] = js.undefined
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
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

