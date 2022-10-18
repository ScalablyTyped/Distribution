package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails extends StObject {
  
  /**
    * The instances distribution. The instances distribution specifies the distribution of On-Demand Instances and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill On-Demand and Spot capacity.
    */
  var InstancesDistribution: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails] = js.undefined
  
  /**
    * The launch template to use and the instance types (overrides) to use to provision EC2 instances to fulfill On-Demand and Spot capacities.
    */
  var LaunchTemplate: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails] = js.undefined
}
object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails {
  
  inline def apply(): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails]
  }
  
  extension [Self <: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyDetails](x: Self) {
    
    inline def setInstancesDistribution(value: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyInstancesDistributionDetails): Self = StObject.set(x, "InstancesDistribution", value.asInstanceOf[js.Any])
    
    inline def setInstancesDistributionUndefined: Self = StObject.set(x, "InstancesDistribution", js.undefined)
    
    inline def setLaunchTemplate(value: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
  }
}
