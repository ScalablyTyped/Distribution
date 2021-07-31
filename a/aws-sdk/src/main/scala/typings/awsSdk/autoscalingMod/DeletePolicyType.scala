package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePolicyType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name or Amazon Resource Name (ARN) of the policy.
    */
  var PolicyName: ResourceName
}
object DeletePolicyType {
  
  @scala.inline
  def apply(PolicyName: ResourceName): DeletePolicyType = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyType]
  }
  
  @scala.inline
  implicit class DeletePolicyTypeMutableBuilder[Self <: DeletePolicyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupNameUndefined: Self = StObject.set(x, "AutoScalingGroupName", js.undefined)
    
    @scala.inline
    def setPolicyName(value: ResourceName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
  }
}
