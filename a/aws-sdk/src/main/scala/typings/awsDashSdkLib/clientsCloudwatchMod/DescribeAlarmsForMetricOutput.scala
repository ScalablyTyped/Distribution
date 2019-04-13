package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlarmsForMetricOutput extends js.Object {
  /**
    * The information for each alarm with the specified metric.
    */
  var MetricAlarms: js.UndefOr[MetricAlarms] = js.undefined
}

object DescribeAlarmsForMetricOutput {
  @scala.inline
  def apply(MetricAlarms: MetricAlarms = null): DescribeAlarmsForMetricOutput = {
    val __obj = js.Dynamic.literal()
    if (MetricAlarms != null) __obj.updateDynamic("MetricAlarms")(MetricAlarms)
    __obj.asInstanceOf[DescribeAlarmsForMetricOutput]
  }
}

