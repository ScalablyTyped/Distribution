package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails extends StObject {
  
  /**
    * The launch template to use for a mixed instances policy.
    */
  var LaunchTemplateSpecification: js.UndefOr[
    AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification
  ] = js.undefined
  
  /**
    * Property values to use to override the values in the launch template.
    */
  var Overrides: js.UndefOr[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesList] = js.undefined
}
object AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails {
  
  inline def apply(): AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails]
  }
  
  extension [Self <: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails](x: Self) {
    
    inline def setLaunchTemplateSpecification(value: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    inline def setOverrides(value: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesList): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    inline def setOverridesVarargs(value: AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails*): Self = StObject.set(x, "Overrides", js.Array(value*))
  }
}
