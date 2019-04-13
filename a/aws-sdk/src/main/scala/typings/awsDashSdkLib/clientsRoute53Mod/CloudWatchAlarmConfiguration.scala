package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchAlarmConfiguration extends js.Object {
  /**
    * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the comparison.
    */
  var ComparisonOperator: awsDashSdkLib.clientsRoute53Mod.ComparisonOperator
  /**
    * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the dimensions for the metric. For information, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide.
    */
  var Dimensions: js.UndefOr[DimensionList] = js.undefined
  /**
    * For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is compared to the threshold.
    */
  var EvaluationPeriods: awsDashSdkLib.clientsRoute53Mod.EvaluationPeriods
  /**
    * The name of the CloudWatch metric that the alarm is associated with.
    */
  var MetricName: awsDashSdkLib.clientsRoute53Mod.MetricName
  /**
    * The namespace of the metric that the alarm is associated with. For more information, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide.
    */
  var Namespace: awsDashSdkLib.clientsRoute53Mod.Namespace
  /**
    * For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in seconds.
    */
  var Period: awsDashSdkLib.clientsRoute53Mod.Period
  /**
    * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
    */
  var Statistic: awsDashSdkLib.clientsRoute53Mod.Statistic
  /**
    * For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
    */
  var Threshold: awsDashSdkLib.clientsRoute53Mod.Threshold
}

object CloudWatchAlarmConfiguration {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    EvaluationPeriods: EvaluationPeriods,
    MetricName: MetricName,
    Namespace: Namespace,
    Period: Period,
    Statistic: Statistic,
    Threshold: Threshold,
    Dimensions: DimensionList = null
  ): CloudWatchAlarmConfiguration = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], EvaluationPeriods = EvaluationPeriods, MetricName = MetricName, Namespace = Namespace, Period = Period, Statistic = Statistic.asInstanceOf[js.Any], Threshold = Threshold)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    __obj.asInstanceOf[CloudWatchAlarmConfiguration]
  }
}

