package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLifecycleHooksType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The names of one or more lifecycle hooks. If you omit this property, all lifecycle hooks are described.
    */
  var LifecycleHookNames: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.LifecycleHookNames] = js.undefined
}
object DescribeLifecycleHooksType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): DescribeLifecycleHooksType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLifecycleHooksType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLifecycleHooksType] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setLifecycleHookNames(value: LifecycleHookNames): Self = StObject.set(x, "LifecycleHookNames", value.asInstanceOf[js.Any])
    
    inline def setLifecycleHookNamesUndefined: Self = StObject.set(x, "LifecycleHookNames", js.undefined)
    
    inline def setLifecycleHookNamesVarargs(value: AsciiStringMaxLen255*): Self = StObject.set(x, "LifecycleHookNames", js.Array(value*))
  }
}
