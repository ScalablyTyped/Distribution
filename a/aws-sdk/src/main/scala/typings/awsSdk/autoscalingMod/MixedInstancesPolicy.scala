package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedInstancesPolicy extends StObject {
  
  /**
    * Specifies the instances distribution. If not provided, the value for each parameter in InstancesDistribution uses a default value.
    */
  var InstancesDistribution: js.UndefOr[typings.awsSdk.autoscalingMod.InstancesDistribution] = js.undefined
  
  /**
    * Specifies the launch template to use and optionally the instance types (overrides) that are used to provision EC2 instances to fulfill On-Demand and Spot capacities. Required when creating a mixed instances policy.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.autoscalingMod.LaunchTemplate] = js.undefined
}
object MixedInstancesPolicy {
  
  inline def apply(): MixedInstancesPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedInstancesPolicy]
  }
  
  extension [Self <: MixedInstancesPolicy](x: Self) {
    
    inline def setInstancesDistribution(value: InstancesDistribution): Self = StObject.set(x, "InstancesDistribution", value.asInstanceOf[js.Any])
    
    inline def setInstancesDistributionUndefined: Self = StObject.set(x, "InstancesDistribution", js.undefined)
    
    inline def setLaunchTemplate(value: LaunchTemplate): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
  }
}
