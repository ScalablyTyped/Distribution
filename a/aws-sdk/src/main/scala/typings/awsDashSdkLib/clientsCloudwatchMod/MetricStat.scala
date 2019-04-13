package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricStat extends js.Object {
  /**
    * The metric to return, including the metric name, namespace, and dimensions.
    */
  var Metric: awsDashSdkLib.clientsCloudwatchMod.Metric
  /**
    * The period, in seconds, to use when retrieving the metric.
    */
  var Period: awsDashSdkLib.clientsCloudwatchMod.Period
  /**
    * The statistic to return. It can include any CloudWatch statistic or extended statistic.
    */
  var Stat: awsDashSdkLib.clientsCloudwatchMod.Stat
  /**
    * The unit to use for the returned data points.
    */
  var Unit: js.UndefOr[StandardUnit] = js.undefined
}

object MetricStat {
  @scala.inline
  def apply(Metric: Metric, Period: Period, Stat: Stat, Unit: StandardUnit = null): MetricStat = {
    val __obj = js.Dynamic.literal(Metric = Metric, Period = Period, Stat = Stat)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStat]
  }
}

