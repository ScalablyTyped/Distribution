package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspendedState extends StObject {
  
  /**
    * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to true if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is false. 
    */
  var DynamicScalingInSuspended: js.UndefOr[ScalingSuspended] = js.native
  
  /**
    * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to true if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is false. 
    */
  var DynamicScalingOutSuspended: js.UndefOr[ScalingSuspended] = js.native
  
  /**
    * Whether scheduled scaling is suspended. Set the value to true if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is false. 
    */
  var ScheduledScalingSuspended: js.UndefOr[ScalingSuspended] = js.native
}
object SuspendedState {
  
  @scala.inline
  def apply(): SuspendedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendedState]
  }
  
  @scala.inline
  implicit class SuspendedStateMutableBuilder[Self <: SuspendedState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicScalingInSuspended(value: ScalingSuspended): Self = StObject.set(x, "DynamicScalingInSuspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicScalingInSuspendedUndefined: Self = StObject.set(x, "DynamicScalingInSuspended", js.undefined)
    
    @scala.inline
    def setDynamicScalingOutSuspended(value: ScalingSuspended): Self = StObject.set(x, "DynamicScalingOutSuspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicScalingOutSuspendedUndefined: Self = StObject.set(x, "DynamicScalingOutSuspended", js.undefined)
    
    @scala.inline
    def setScheduledScalingSuspended(value: ScalingSuspended): Self = StObject.set(x, "ScheduledScalingSuspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledScalingSuspendedUndefined: Self = StObject.set(x, "ScheduledScalingSuspended", js.undefined)
  }
}
