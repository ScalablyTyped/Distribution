package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLifecycleHooksAnswer extends StObject {
  
  /**
    * The lifecycle hooks for the specified group.
    */
  var LifecycleHooks: js.UndefOr[typings.awsSdk.autoscalingMod.LifecycleHooks] = js.undefined
}
object DescribeLifecycleHooksAnswer {
  
  inline def apply(): DescribeLifecycleHooksAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLifecycleHooksAnswer]
  }
  
  extension [Self <: DescribeLifecycleHooksAnswer](x: Self) {
    
    inline def setLifecycleHooks(value: LifecycleHooks): Self = StObject.set(x, "LifecycleHooks", value.asInstanceOf[js.Any])
    
    inline def setLifecycleHooksUndefined: Self = StObject.set(x, "LifecycleHooks", js.undefined)
    
    inline def setLifecycleHooksVarargs(value: LifecycleHook*): Self = StObject.set(x, "LifecycleHooks", js.Array(value :_*))
  }
}
