package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPolicy extends js.Object {
  
  /**
    * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a percentage). The valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity.
    */
  var AdjustmentType: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The CloudWatch alarms related to the policy.
    */
  var Alarms: js.UndefOr[typings.awsSdk.autoscalingMod.Alarms] = js.native
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The duration of the policy's cooldown period, in seconds.
    */
  var Cooldown: js.UndefOr[typings.awsSdk.autoscalingMod.Cooldown] = js.native
  
  /**
    * Indicates whether the policy is enabled (true) or disabled (false).
    */
  var Enabled: js.UndefOr[ScalingPolicyEnabled] = js.native
  
  /**
    * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
    */
  var EstimatedInstanceWarmup: js.UndefOr[typings.awsSdk.autoscalingMod.EstimatedInstanceWarmup] = js.native
  
  /**
    * The aggregation type for the CloudWatch metrics. The valid values are Minimum, Maximum, and Average.
    */
  var MetricAggregationType: js.UndefOr[XmlStringMaxLen32] = js.native
  
  /**
    * The minimum value to scale by when the adjustment type is PercentChangeInCapacity. 
    */
  var MinAdjustmentMagnitude: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentMagnitude] = js.native
  
  /**
    * Available for backward compatibility. Use MinAdjustmentMagnitude instead.
    */
  var MinAdjustmentStep: js.UndefOr[typings.awsSdk.autoscalingMod.MinAdjustmentStep] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyARN: js.UndefOr[ResourceName] = js.native
  
  /**
    * The name of the scaling policy.
    */
  var PolicyName: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * One of the following policy types:     TargetTrackingScaling     StepScaling     SimpleScaling (default)   For more information, see Target tracking scaling policies and Step and simple scaling policies in the Amazon EC2 Auto Scaling User Guide.
    */
  var PolicyType: js.UndefOr[XmlStringMaxLen64] = js.native
  
  /**
    * The amount by which to scale, based on the specified adjustment type. A positive value adds to the current capacity while a negative number removes from the current capacity.
    */
  var ScalingAdjustment: js.UndefOr[PolicyIncrement] = js.native
  
  /**
    * A set of adjustments that enable you to scale based on the size of the alarm breach.
    */
  var StepAdjustments: js.UndefOr[typings.awsSdk.autoscalingMod.StepAdjustments] = js.native
  
  /**
    * A target tracking scaling policy.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsSdk.autoscalingMod.TargetTrackingConfiguration] = js.native
}
object ScalingPolicy {
  
  @scala.inline
  def apply(): ScalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingPolicy]
  }
  
  @scala.inline
  implicit class ScalingPolicyOps[Self <: ScalingPolicy] (val x: Self) extends AnyVal {
    
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
    def setAdjustmentType(value: XmlStringMaxLen255): Self = this.set("AdjustmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustmentType: Self = this.set("AdjustmentType", js.undefined)
    
    @scala.inline
    def setAlarmsVarargs(value: Alarm*): Self = this.set("Alarms", js.Array(value :_*))
    
    @scala.inline
    def setAlarms(value: Alarms): Self = this.set("Alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarms: Self = this.set("Alarms", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingGroupName: Self = this.set("AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setCooldown(value: Cooldown): Self = this.set("Cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCooldown: Self = this.set("Cooldown", js.undefined)
    
    @scala.inline
    def setEnabled(value: ScalingPolicyEnabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setEstimatedInstanceWarmup(value: EstimatedInstanceWarmup): Self = this.set("EstimatedInstanceWarmup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedInstanceWarmup: Self = this.set("EstimatedInstanceWarmup", js.undefined)
    
    @scala.inline
    def setMetricAggregationType(value: XmlStringMaxLen32): Self = this.set("MetricAggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricAggregationType: Self = this.set("MetricAggregationType", js.undefined)
    
    @scala.inline
    def setMinAdjustmentMagnitude(value: MinAdjustmentMagnitude): Self = this.set("MinAdjustmentMagnitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAdjustmentMagnitude: Self = this.set("MinAdjustmentMagnitude", js.undefined)
    
    @scala.inline
    def setMinAdjustmentStep(value: MinAdjustmentStep): Self = this.set("MinAdjustmentStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAdjustmentStep: Self = this.set("MinAdjustmentStep", js.undefined)
    
    @scala.inline
    def setPolicyARN(value: ResourceName): Self = this.set("PolicyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyARN: Self = this.set("PolicyARN", js.undefined)
    
    @scala.inline
    def setPolicyName(value: XmlStringMaxLen255): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
    
    @scala.inline
    def setPolicyType(value: XmlStringMaxLen64): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyType: Self = this.set("PolicyType", js.undefined)
    
    @scala.inline
    def setScalingAdjustment(value: PolicyIncrement): Self = this.set("ScalingAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingAdjustment: Self = this.set("ScalingAdjustment", js.undefined)
    
    @scala.inline
    def setStepAdjustmentsVarargs(value: StepAdjustment*): Self = this.set("StepAdjustments", js.Array(value :_*))
    
    @scala.inline
    def setStepAdjustments(value: StepAdjustments): Self = this.set("StepAdjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepAdjustments: Self = this.set("StepAdjustments", js.undefined)
    
    @scala.inline
    def setTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = this.set("TargetTrackingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTrackingConfiguration: Self = this.set("TargetTrackingConfiguration", js.undefined)
  }
}
