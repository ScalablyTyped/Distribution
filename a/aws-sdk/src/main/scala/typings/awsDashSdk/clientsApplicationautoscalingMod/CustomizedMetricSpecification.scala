package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizedMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric.  Conditional: If you published your metric with dimensions, you must specify the same dimensions in your scaling policy.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.native
  /**
    * The name of the metric. 
    */
  var MetricName: typings.awsDashSdk.clientsApplicationautoscalingMod.MetricName = js.native
  /**
    * The namespace of the metric.
    */
  var Namespace: MetricNamespace = js.native
  /**
    * The statistic of the metric.
    */
  var Statistic: MetricStatistic = js.native
  /**
    * The unit of the metric.
    */
  var Unit: js.UndefOr[MetricUnit] = js.native
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
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedMetricSpecification]
  }
}

