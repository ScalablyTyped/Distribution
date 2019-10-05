package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlarmsForMetricInput extends js.Object {
  /**
    * The dimensions associated with the metric. If the metric has any associated dimensions, you must specify them in order for the call to succeed.
    */
  var Dimensions: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  /**
    * The percentile statistic for the metric. Specify a value between p0.0 and p100.
    */
  var ExtendedStatistic: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.ExtendedStatistic] = js.undefined
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsDashSdk.clientsCloudwatchMod.MetricName
  /**
    * The namespace of the metric.
    */
  var Namespace: typings.awsDashSdk.clientsCloudwatchMod.Namespace
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var Period: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Period] = js.undefined
  /**
    * The statistic for the metric, other than percentiles. For percentile statistics, use ExtendedStatistics.
    */
  var Statistic: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Statistic] = js.undefined
  /**
    * The unit for the metric.
    */
  var Unit: js.UndefOr[StandardUnit] = js.undefined
}

object DescribeAlarmsForMetricInput {
  @scala.inline
  def apply(
    MetricName: MetricName,
    Namespace: Namespace,
    Dimensions: Dimensions = null,
    ExtendedStatistic: ExtendedStatistic = null,
    Period: Int | Double = null,
    Statistic: Statistic = null,
    Unit: StandardUnit = null
  ): DescribeAlarmsForMetricInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName, Namespace = Namespace)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (ExtendedStatistic != null) __obj.updateDynamic("ExtendedStatistic")(ExtendedStatistic)
    if (Period != null) __obj.updateDynamic("Period")(Period.asInstanceOf[js.Any])
    if (Statistic != null) __obj.updateDynamic("Statistic")(Statistic.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmsForMetricInput]
  }
}

