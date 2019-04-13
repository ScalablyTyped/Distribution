package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchAlarmDefinition extends js.Object {
  /**
    * Determines how the metric specified by MetricName is compared to the value specified by Threshold.
    */
  var ComparisonOperator: awsDashSdkLib.clientsEmrMod.ComparisonOperator
  /**
    * A CloudWatch metric dimension.
    */
  var Dimensions: js.UndefOr[MetricDimensionList] = js.undefined
  /**
    * The number of periods, expressed in seconds using Period, during which the alarm condition must exist before the alarm triggers automatic scaling activity. The default value is 1.
    */
  var EvaluationPeriods: js.UndefOr[Integer] = js.undefined
  /**
    * The name of the CloudWatch metric that is watched to determine an alarm condition.
    */
  var MetricName: String
  /**
    * The namespace for the CloudWatch metric. The default is AWS/ElasticMapReduce.
    */
  var Namespace: js.UndefOr[String] = js.undefined
  /**
    * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify 300.
    */
  var Period: Integer
  /**
    * The statistic to apply to the metric associated with the alarm. The default is AVERAGE.
    */
  var Statistic: js.UndefOr[Statistic] = js.undefined
  /**
    * The value against which the specified statistic is compared.
    */
  var Threshold: NonNegativeDouble
  /**
    * The unit of measure associated with the CloudWatch metric being watched. The value specified for Unit must correspond to the units specified in the CloudWatch metric.
    */
  var Unit: js.UndefOr[Unit] = js.undefined
}

object CloudWatchAlarmDefinition {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator,
    MetricName: String,
    Period: Integer,
    Threshold: NonNegativeDouble,
    Dimensions: MetricDimensionList = null,
    EvaluationPeriods: js.UndefOr[Integer] = js.undefined,
    Namespace: String = null,
    Statistic: Statistic = null,
    Unit: Unit = null
  ): CloudWatchAlarmDefinition = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], MetricName = MetricName, Period = Period, Threshold = Threshold)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (!js.isUndefined(EvaluationPeriods)) __obj.updateDynamic("EvaluationPeriods")(EvaluationPeriods)
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (Statistic != null) __obj.updateDynamic("Statistic")(Statistic.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchAlarmDefinition]
  }
}

