package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTrackingConfiguration extends js.Object {
  /**
    * A customized metric. You can specify either a predefined metric or a customized metric.
    */
  var CustomizedMetricSpecification: js.UndefOr[CustomizedMetricSpecification] = js.undefined
  /**
    * Indicates whether scaling in by the target tracking scaling policy is disabled. If scaling in is disabled, the target tracking scaling policy doesn't remove instances from the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances from the Auto Scaling group. The default is disabled.
    */
  var DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined
  /**
    * A predefined metric. You can specify either a predefined metric or a customized metric.
    */
  var PredefinedMetricSpecification: js.UndefOr[PredefinedMetricSpecification] = js.undefined
  /**
    * The target value for the metric.
    */
  var TargetValue: MetricScale
}

object TargetTrackingConfiguration {
  @scala.inline
  def apply(
    TargetValue: MetricScale,
    CustomizedMetricSpecification: CustomizedMetricSpecification = null,
    DisableScaleIn: js.UndefOr[DisableScaleIn] = js.undefined,
    PredefinedMetricSpecification: PredefinedMetricSpecification = null
  ): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue)
    if (CustomizedMetricSpecification != null) __obj.updateDynamic("CustomizedMetricSpecification")(CustomizedMetricSpecification)
    if (!js.isUndefined(DisableScaleIn)) __obj.updateDynamic("DisableScaleIn")(DisableScaleIn)
    if (PredefinedMetricSpecification != null) __obj.updateDynamic("PredefinedMetricSpecification")(PredefinedMetricSpecification)
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
}

