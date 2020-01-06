package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlarmsOutput extends js.Object {
  /**
    * The information for the specified alarms.
    */
  var MetricAlarms: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MetricAlarms] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.NextToken] = js.native
}

object DescribeAlarmsOutput {
  @scala.inline
  def apply(MetricAlarms: MetricAlarms = null, NextToken: NextToken = null): DescribeAlarmsOutput = {
    val __obj = js.Dynamic.literal()
    if (MetricAlarms != null) __obj.updateDynamic("MetricAlarms")(MetricAlarms.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsOutput]
  }
}

