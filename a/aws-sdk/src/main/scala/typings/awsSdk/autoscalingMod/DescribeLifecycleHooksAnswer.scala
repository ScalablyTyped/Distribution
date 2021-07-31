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
  
  @scala.inline
  def apply(): DescribeLifecycleHooksAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLifecycleHooksAnswer]
  }
  
  @scala.inline
  implicit class DescribeLifecycleHooksAnswerMutableBuilder[Self <: DescribeLifecycleHooksAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifecycleHooks(value: LifecycleHooks): Self = StObject.set(x, "LifecycleHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleHooksUndefined: Self = StObject.set(x, "LifecycleHooks", js.undefined)
    
    @scala.inline
    def setLifecycleHooksVarargs(value: LifecycleHook*): Self = StObject.set(x, "LifecycleHooks", js.Array(value :_*))
  }
}
