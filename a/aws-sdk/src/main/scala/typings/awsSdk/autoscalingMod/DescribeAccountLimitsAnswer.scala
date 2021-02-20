package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountLimitsAnswer extends StObject {
  
  /**
    * The maximum number of groups allowed for your AWS account. The default is 200 groups per AWS Region.
    */
  var MaxNumberOfAutoScalingGroups: js.UndefOr[typings.awsSdk.autoscalingMod.MaxNumberOfAutoScalingGroups] = js.native
  
  /**
    * The maximum number of launch configurations allowed for your AWS account. The default is 200 launch configurations per AWS Region.
    */
  var MaxNumberOfLaunchConfigurations: js.UndefOr[typings.awsSdk.autoscalingMod.MaxNumberOfLaunchConfigurations] = js.native
  
  /**
    * The current number of groups for your AWS account.
    */
  var NumberOfAutoScalingGroups: js.UndefOr[typings.awsSdk.autoscalingMod.NumberOfAutoScalingGroups] = js.native
  
  /**
    * The current number of launch configurations for your AWS account.
    */
  var NumberOfLaunchConfigurations: js.UndefOr[typings.awsSdk.autoscalingMod.NumberOfLaunchConfigurations] = js.native
}
object DescribeAccountLimitsAnswer {
  
  @scala.inline
  def apply(): DescribeAccountLimitsAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsAnswer]
  }
  
  @scala.inline
  implicit class DescribeAccountLimitsAnswerMutableBuilder[Self <: DescribeAccountLimitsAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxNumberOfAutoScalingGroups(value: MaxNumberOfAutoScalingGroups): Self = StObject.set(x, "MaxNumberOfAutoScalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumberOfAutoScalingGroupsUndefined: Self = StObject.set(x, "MaxNumberOfAutoScalingGroups", js.undefined)
    
    @scala.inline
    def setMaxNumberOfLaunchConfigurations(value: MaxNumberOfLaunchConfigurations): Self = StObject.set(x, "MaxNumberOfLaunchConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumberOfLaunchConfigurationsUndefined: Self = StObject.set(x, "MaxNumberOfLaunchConfigurations", js.undefined)
    
    @scala.inline
    def setNumberOfAutoScalingGroups(value: NumberOfAutoScalingGroups): Self = StObject.set(x, "NumberOfAutoScalingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfAutoScalingGroupsUndefined: Self = StObject.set(x, "NumberOfAutoScalingGroups", js.undefined)
    
    @scala.inline
    def setNumberOfLaunchConfigurations(value: NumberOfLaunchConfigurations): Self = StObject.set(x, "NumberOfLaunchConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLaunchConfigurationsUndefined: Self = StObject.set(x, "NumberOfLaunchConfigurations", js.undefined)
  }
}
