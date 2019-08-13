package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricStat extends js.Object {
  /**
    * The metric to return, including the metric name, namespace, and dimensions.
    */
  var Metric: typings.awsDashSdk.clientsCloudwatchMod.Metric
  /**
    * The period, in seconds, to use when retrieving the metric.
    */
  var Period: typings.awsDashSdk.clientsCloudwatchMod.Period
  /**
    * The statistic to return. It can include any CloudWatch statistic or extended statistic.
    */
  var Stat: typings.awsDashSdk.clientsCloudwatchMod.Stat
  /**
    * When you are using a Put operation, this defines what unit you want to use when storing the metric. In a Get operation, if you omit Unit then all data that was collected with any unit is returned, along with the corresponding units that were specified when the data was reported to CloudWatch. If you specify a unit, the operation returns only data data that was collected with that unit specified. If you specify a unit that does not match the data collected, the results of the operation are null. CloudWatch does not perform unit conversions.
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

