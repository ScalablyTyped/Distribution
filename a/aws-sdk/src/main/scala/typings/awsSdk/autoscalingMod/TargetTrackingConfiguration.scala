package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(TargetValue: MetricScale): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
  
  @scala.inline
  implicit class TargetTrackingConfigurationOps[Self <: TargetTrackingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTargetValue(value: MetricScale): Self = this.set("TargetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizedMetricSpecification(value: CustomizedMetricSpecification): Self = this.set("CustomizedMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomizedMetricSpecification: Self = this.set("CustomizedMetricSpecification", js.undefined)
    
    @scala.inline
    def setDisableScaleIn(value: DisableScaleIn): Self = this.set("DisableScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableScaleIn: Self = this.set("DisableScaleIn", js.undefined)
    
    @scala.inline
    def setPredefinedMetricSpecification(value: PredefinedMetricSpecification): Self = this.set("PredefinedMetricSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredefinedMetricSpecification: Self = this.set("PredefinedMetricSpecification", js.undefined)
  }
}
