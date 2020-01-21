package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetTrackingConfiguration extends js.Object {
  /**
    * A customized metric. You must specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[typings.awsSdk.autoscalingMod.CustomizedMetricSpecification] = js.native
  /**
    * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances from the Auto Scaling group. The default is false.
    */
  var DisableScaleIn: js.UndefOr[typings.awsSdk.autoscalingMod.DisableScaleIn] = js.native
  /**
    * A predefined metric. You must specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[typings.awsSdk.autoscalingMod.PredefinedMetricSpecification] = js.native
  /**
    * The target value for the metric.
    */
  var TargetValue: MetricScale = js.native
}

object TargetTrackingConfiguration {
  @scala.inline
  def apply(
    TargetValue: MetricScale,
    CustomizedMetricSpecification: CustomizedMetricSpecification = null,
    DisableScaleIn: js.UndefOr[Boolean] = js.undefined,
    PredefinedMetricSpecification: PredefinedMetricSpecification = null
  ): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    if (CustomizedMetricSpecification != null) __obj.updateDynamic("CustomizedMetricSpecification")(CustomizedMetricSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(DisableScaleIn)) __obj.updateDynamic("DisableScaleIn")(DisableScaleIn.asInstanceOf[js.Any])
    if (PredefinedMetricSpecification != null) __obj.updateDynamic("PredefinedMetricSpecification")(PredefinedMetricSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
}

