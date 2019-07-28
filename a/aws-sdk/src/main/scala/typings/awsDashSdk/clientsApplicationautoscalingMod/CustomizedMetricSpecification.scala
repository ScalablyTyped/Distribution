package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizedMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric.  Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling policy.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.undefined
  /**
    * The name of the metric. 
    */
  var MetricName: typings.awsDashSdk.clientsApplicationautoscalingMod.MetricName
  /**
    * The namespace of the metric.
    */
  var Namespace: MetricNamespace
  /**
    * The statistic of the metric.
    */
  var Statistic: MetricStatistic
  /**
    * The unit of the metric.
    */
  var Unit: js.UndefOr[MetricUnit] = js.undefined
}

object CustomizedMetricSpecification {
  @scala.inline
  def apply(
    MetricName: MetricName,
    Namespace: MetricNamespace,
    Statistic: MetricStatistic,
    Dimensions: MetricDimensions = null,
    Unit: MetricUnit = null
  ): CustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(MetricName = MetricName, Namespace = Namespace, Statistic = Statistic.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    __obj.asInstanceOf[CustomizedMetricSpecification]
  }
}

