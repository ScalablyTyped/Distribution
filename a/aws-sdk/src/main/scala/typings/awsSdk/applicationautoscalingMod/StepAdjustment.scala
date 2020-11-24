package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepAdjustment extends js.Object {
  
  /**
    * The lower bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the lower bound is inclusive (the metric must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive (the metric must be greater than the threshold plus the lower bound). A null value indicates negative infinity.
    */
  var MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.native
  
  /**
    * The upper bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the upper bound is exclusive (the metric must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric must be less than or equal to the threshold plus the upper bound). A null value indicates positive infinity. The upper bound must be greater than the lower bound.
    */
  var MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.native
  
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity. For exact capacity, you must specify a positive value.
    */
  var ScalingAdjustment: typings.awsSdk.applicationautoscalingMod.ScalingAdjustment = js.native
}
object StepAdjustment {
  
  @scala.inline
  def apply(ScalingAdjustment: ScalingAdjustment): StepAdjustment = {
    val __obj = js.Dynamic.literal(ScalingAdjustment = ScalingAdjustment.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepAdjustment]
  }
  
  @scala.inline
  implicit class StepAdjustmentOps[Self <: StepAdjustment] (val x: Self) extends AnyVal {
    
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
    def setScalingAdjustment(value: ScalingAdjustment): Self = this.set("ScalingAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricIntervalLowerBound(value: MetricScale): Self = this.set("MetricIntervalLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricIntervalLowerBound: Self = this.set("MetricIntervalLowerBound", js.undefined)
    
    @scala.inline
    def setMetricIntervalUpperBound(value: MetricScale): Self = this.set("MetricIntervalUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricIntervalUpperBound: Self = this.set("MetricIntervalUpperBound", js.undefined)
  }
}
