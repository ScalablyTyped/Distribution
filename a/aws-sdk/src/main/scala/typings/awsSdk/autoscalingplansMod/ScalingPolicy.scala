package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPolicy extends StObject {
  
  /**
    * The name of the scaling policy.
    */
  var PolicyName: typings.awsSdk.autoscalingplansMod.PolicyName = js.native
  
  /**
    * The type of scaling policy.
    */
  var PolicyType: typings.awsSdk.autoscalingplansMod.PolicyType = js.native
  
  /**
    * The target tracking scaling policy. Includes support for predefined or customized metrics.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsSdk.autoscalingplansMod.TargetTrackingConfiguration] = js.native
}
object ScalingPolicy {
  
  @scala.inline
  def apply(PolicyName: PolicyName, PolicyType: PolicyType): ScalingPolicy = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], PolicyType = PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPolicy]
  }
  
  @scala.inline
  implicit class ScalingPolicyMutableBuilder[Self <: ScalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyType(value: PolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = StObject.set(x, "TargetTrackingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTrackingConfigurationUndefined: Self = StObject.set(x, "TargetTrackingConfiguration", js.undefined)
  }
}
