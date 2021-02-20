package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLifecycleHooksType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * The names of one or more lifecycle hooks. If you omit this parameter, all lifecycle hooks are described.
    */
  var LifecycleHookNames: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleHookNames] = js.native
}
object DescribeLifecycleHooksType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): DescribeLifecycleHooksType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleHooksType]
  }
  
  @scala.inline
  implicit class DescribeLifecycleHooksTypeMutableBuilder[Self <: DescribeLifecycleHooksType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleHookNames(value: LifecycleHookNames): Self = StObject.set(x, "LifecycleHookNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleHookNamesUndefined: Self = StObject.set(x, "LifecycleHookNames", js.undefined)
    
    @scala.inline
    def setLifecycleHookNamesVarargs(value: AsciiStringMaxLen255*): Self = StObject.set(x, "LifecycleHookNames", js.Array(value :_*))
  }
}
