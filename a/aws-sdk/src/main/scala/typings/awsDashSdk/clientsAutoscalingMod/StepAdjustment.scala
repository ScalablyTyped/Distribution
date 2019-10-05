package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepAdjustment extends js.Object {
  /**
    * The lower bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the lower bound is inclusive (the metric must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive (the metric must be greater than the threshold plus the lower bound). A null value indicates negative infinity.
    */
  var MetricIntervalLowerBound: js.UndefOr[MetricScale] = js.undefined
  /**
    * The upper bound for the difference between the alarm threshold and the CloudWatch metric. If the metric value is above the breach threshold, the upper bound is exclusive (the metric must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric must be less than or equal to the threshold plus the upper bound). A null value indicates positive infinity. The upper bound must be greater than the lower bound.
    */
  var MetricIntervalUpperBound: js.UndefOr[MetricScale] = js.undefined
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
    */
  var ScalingAdjustment: PolicyIncrement
}

object StepAdjustment {
  @scala.inline
  def apply(
    ScalingAdjustment: PolicyIncrement,
    MetricIntervalLowerBound: Int | Double = null,
    MetricIntervalUpperBound: Int | Double = null
  ): StepAdjustment = {
    val __obj = js.Dynamic.literal(ScalingAdjustment = ScalingAdjustment)
    if (MetricIntervalLowerBound != null) __obj.updateDynamic("MetricIntervalLowerBound")(MetricIntervalLowerBound.asInstanceOf[js.Any])
    if (MetricIntervalUpperBound != null) __obj.updateDynamic("MetricIntervalUpperBound")(MetricIntervalUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepAdjustment]
  }
}

