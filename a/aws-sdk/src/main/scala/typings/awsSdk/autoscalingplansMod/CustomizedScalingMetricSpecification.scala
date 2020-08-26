package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizedScalingMetricSpecification extends js.Object {
  /**
    * The dimensions of the metric. Conditional: If you published your metric with dimensions, you must specify the same dimensions in your customized scaling metric specification.
    */
  var Dimensions: js.UndefOr[MetricDimensions] = js.native
  /**
    * The name of the metric.
    */
  var MetricName: typings.awsSdk.autoscalingplansMod.MetricName = js.native
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

object CustomizedScalingMetricSpecification {
  @scala.inline
  def apply(MetricName: MetricName, Namespace: MetricNamespace, Statistic: MetricStatistic): CustomizedScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Statistic = Statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedScalingMetricSpecification]
  }
  @scala.inline
  implicit class CustomizedScalingMetricSpecificationOps[Self <: CustomizedScalingMetricSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: MetricNamespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatistic(value: MetricStatistic): Self = this.set("Statistic", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensionsVarargs(value: MetricDimension*): Self = this.set("Dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: MetricDimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setUnit(value: MetricUnit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
  
}

