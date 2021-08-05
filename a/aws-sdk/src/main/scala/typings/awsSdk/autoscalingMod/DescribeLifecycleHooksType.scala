package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLifecycleHooksType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The names of one or more lifecycle hooks. If you omit this parameter, all lifecycle hooks are described.
    */
  var LifecycleHookNames: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleHookNames] = js.undefined
}
object DescribeLifecycleHooksType {
  
  inline def apply(AutoScalingGroupName: ResourceName): DescribeLifecycleHooksType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleHooksType]
  }
  
  extension [Self <: DescribeLifecycleHooksType](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setLifecycleHookNames(value: LifecycleHookNames): Self = StObject.set(x, "LifecycleHookNames", value.asInstanceOf[js.Any])
    
    inline def setLifecycleHookNamesUndefined: Self = StObject.set(x, "LifecycleHookNames", js.undefined)
    
    inline def setLifecycleHookNamesVarargs(value: AsciiStringMaxLen255*): Self = StObject.set(x, "LifecycleHookNames", js.Array(value :_*))
  }
}
