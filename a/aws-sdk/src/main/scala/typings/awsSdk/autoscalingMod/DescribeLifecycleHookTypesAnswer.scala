package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLifecycleHookTypesAnswer extends StObject {
  
  /**
    * The lifecycle hook types.
    */
  var LifecycleHookTypes: js.UndefOr[AutoScalingNotificationTypes] = js.undefined
}
object DescribeLifecycleHookTypesAnswer {
  
  @scala.inline
  def apply(): DescribeLifecycleHookTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLifecycleHookTypesAnswer]
  }
  
  @scala.inline
  implicit class DescribeLifecycleHookTypesAnswerMutableBuilder[Self <: DescribeLifecycleHookTypesAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLifecycleHookTypes(value: AutoScalingNotificationTypes): Self = StObject.set(x, "LifecycleHookTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleHookTypesUndefined: Self = StObject.set(x, "LifecycleHookTypes", js.undefined)
    
    @scala.inline
    def setLifecycleHookTypesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "LifecycleHookTypes", js.Array(value :_*))
  }
}
