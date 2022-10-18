package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountLimitsAnswer extends StObject {
  
  /**
    * The maximum number of groups allowed for your account. The default is 200 groups per Region.
    */
  var MaxNumberOfAutoScalingGroups: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxNumberOfAutoScalingGroups] = js.undefined
  
  /**
    * The maximum number of launch configurations allowed for your account. The default is 200 launch configurations per Region.
    */
  var MaxNumberOfLaunchConfigurations: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxNumberOfLaunchConfigurations] = js.undefined
  
  /**
    * The current number of groups for your account.
    */
  var NumberOfAutoScalingGroups: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.NumberOfAutoScalingGroups] = js.undefined
  
  /**
    * The current number of launch configurations for your account.
    */
  var NumberOfLaunchConfigurations: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.NumberOfLaunchConfigurations] = js.undefined
}
object DescribeAccountLimitsAnswer {
  
  inline def apply(): DescribeAccountLimitsAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsAnswer]
  }
  
  extension [Self <: DescribeAccountLimitsAnswer](x: Self) {
    
    inline def setMaxNumberOfAutoScalingGroups(value: MaxNumberOfAutoScalingGroups): Self = StObject.set(x, "MaxNumberOfAutoScalingGroups", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfAutoScalingGroupsUndefined: Self = StObject.set(x, "MaxNumberOfAutoScalingGroups", js.undefined)
    
    inline def setMaxNumberOfLaunchConfigurations(value: MaxNumberOfLaunchConfigurations): Self = StObject.set(x, "MaxNumberOfLaunchConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfLaunchConfigurationsUndefined: Self = StObject.set(x, "MaxNumberOfLaunchConfigurations", js.undefined)
    
    inline def setNumberOfAutoScalingGroups(value: NumberOfAutoScalingGroups): Self = StObject.set(x, "NumberOfAutoScalingGroups", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAutoScalingGroupsUndefined: Self = StObject.set(x, "NumberOfAutoScalingGroups", js.undefined)
    
    inline def setNumberOfLaunchConfigurations(value: NumberOfLaunchConfigurations): Self = StObject.set(x, "NumberOfLaunchConfigurations", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLaunchConfigurationsUndefined: Self = StObject.set(x, "NumberOfLaunchConfigurations", js.undefined)
  }
}
