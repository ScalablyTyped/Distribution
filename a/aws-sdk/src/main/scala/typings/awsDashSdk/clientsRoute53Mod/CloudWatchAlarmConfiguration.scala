package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchAlarmConfiguration extends js.Object {
  /**
    * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the comparison.
    */
  var ComparisonOperator: typings.awsDashSdk.clientsRoute53Mod.ComparisonOperator = js.native
  /**
    * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the dimensions for the metric. For information, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide.
    */
  var Dimensions: js.UndefOr[DimensionList] = js.native
  /**
    * For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is compared to the threshold.
    */
  var EvaluationPeriods: typings.awsDashSdk.clientsRoute53Mod.EvaluationPeriods = js.native
  /**
    * The name of the CloudWatch metric that the alarm is associated with.
    */
  var MetricName: typings.awsDashSdk.clientsRoute53Mod.MetricName = js.native
  /**
    * The namespace of the metric that the alarm is associated with. For more information, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide.
    */
  var Namespace: typings.awsDashSdk.clientsRoute53Mod.Namespace = js.native
  /**
    * For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in seconds.
    */
  var Period: typings.awsDashSdk.clientsRoute53Mod.Period = js.native
  /**
    * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
    */
  var Statistic: typings.awsDashSdk.clientsRoute53Mod.Statistic = js.native
  /**
    * For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
    */
  var Threshold: typings.awsDashSdk.clientsRoute53Mod.Threshold = js.native
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
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], EvaluationPeriods = EvaluationPeriods.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchAlarmConfiguration]
  }
}

