package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedInstancesPolicy extends StObject {
  
  /**
    * The instances distribution.
    */
  var InstancesDistribution: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstancesDistribution] = js.undefined
  
  /**
    * One or more launch templates and the instance types (overrides) that are used to launch EC2 instances to fulfill On-Demand and Spot capacities.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.LaunchTemplate] = js.undefined
}
object MixedInstancesPolicy {
  
  inline def apply(): MixedInstancesPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixedInstancesPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixedInstancesPolicy] (val x: Self) extends AnyVal {
    
    inline def setInstancesDistribution(value: InstancesDistribution): Self = StObject.set(x, "InstancesDistribution", value.asInstanceOf[js.Any])
    
    inline def setInstancesDistributionUndefined: Self = StObject.set(x, "InstancesDistribution", js.undefined)
    
    inline def setLaunchTemplate(value: LaunchTemplate): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
  }
}
