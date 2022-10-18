package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails extends StObject {
  
  /**
    * The instance type. For example, m3.xlarge.
    */
  var InstanceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of capacity units provided by the specified instance type in terms of virtual CPUs, memory, storage, throughput, or other relative performance characteristic.
    */
  var WeightedCapacity: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails {
  
  inline def apply(): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails]
  }
  
  extension [Self <: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails](x: Self) {
    
    inline def setInstanceType(value: NonEmptyString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setWeightedCapacity(value: NonEmptyString): Self = StObject.set(x, "WeightedCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacityUndefined: Self = StObject.set(x, "WeightedCapacity", js.undefined)
  }
}
