package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlarmsOutput extends js.Object {
  /**
    * The information for the specified alarms.
    */
  var MetricAlarms: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MetricAlarms] = js.undefined
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.undefined
}

object DescribeAlarmsOutput {
  @scala.inline
  def apply(MetricAlarms: MetricAlarms = null, NextToken: NextToken = null): DescribeAlarmsOutput = {
    val __obj = js.Dynamic.literal()
    if (MetricAlarms != null) __obj.updateDynamic("MetricAlarms")(MetricAlarms)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAlarmsOutput]
  }
}

