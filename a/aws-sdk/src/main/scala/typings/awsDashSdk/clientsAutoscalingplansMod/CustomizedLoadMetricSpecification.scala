package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizedLoadMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric. Conditional: If you published your metric with dimensions, you must specify the same dimensions in your customized load metric specification.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsDashSdk.clientsAutoscalingplansMod.MetricName = js.native
  /**
    * The namespace of the metric.
    */
  var Namespace: MetricNamespace = js.native
  /**
    * The statistic of the metric. Currently, the value must always be Sum. 
    */
  var Statistic: MetricStatistic = js.native
  /**
    * The unit of the metric.
    */
  var Unit: js.UndefOr[MetricUnit] = js.native
}

object CustomizedLoadMetricSpecification {
  @scala.inline
  def apply(
    MetricName: MetricName,
    Namespace: MetricNamespace,
    Statistic: MetricStatistic,
    Dimensions: MetricDimensions = null,
    Unit: MetricUnit = null
  ): CustomizedLoadMetricSpecification = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedLoadMetricSpecification]
  }
}

