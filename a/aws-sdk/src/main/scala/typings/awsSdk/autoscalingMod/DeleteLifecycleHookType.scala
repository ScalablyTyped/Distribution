package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLifecycleHookType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The name of the lifecycle hook.
    */
  var LifecycleHookName: AsciiStringMaxLen255
}
object DeleteLifecycleHookType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, LifecycleHookName: AsciiStringMaxLen255): DeleteLifecycleHookType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], LifecycleHookName = LifecycleHookName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecycleHookType]
  }
  
  @scala.inline
  implicit class DeleteLifecycleHookTypeMutableBuilder[Self <: DeleteLifecycleHookType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleHookName(value: AsciiStringMaxLen255): Self = StObject.set(x, "LifecycleHookName", value.asInstanceOf[js.Any])
  }
}
