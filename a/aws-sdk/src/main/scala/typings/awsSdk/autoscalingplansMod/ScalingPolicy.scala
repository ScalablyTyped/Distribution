package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingPolicy extends StObject {
  
  /**
    * The name of the scaling policy.
    */
  var PolicyName: typings.awsSdk.autoscalingplansMod.PolicyName
  
  /**
    * The type of scaling policy.
    */
  var PolicyType: typings.awsSdk.autoscalingplansMod.PolicyType
  
  /**
    * The target tracking scaling policy. Includes support for predefined or customized metrics.
    */
  var TargetTrackingConfiguration: js.UndefOr[typings.awsSdk.autoscalingplansMod.TargetTrackingConfiguration] = js.undefined
}
object ScalingPolicy {
  
  inline def apply(PolicyName: PolicyName, PolicyType: PolicyType): ScalingPolicy = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any], PolicyType = PolicyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPolicy]
  }
  
  extension [Self <: ScalingPolicy](x: Self) {
    
    inline def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyType(value: PolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setTargetTrackingConfiguration(value: TargetTrackingConfiguration): Self = StObject.set(x, "TargetTrackingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetTrackingConfigurationUndefined: Self = StObject.set(x, "TargetTrackingConfiguration", js.undefined)
  }
}
