package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspendedState extends js.Object {
  
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
  implicit class SuspendedStateOps[Self <: SuspendedState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDynamicScalingInSuspended(value: ScalingSuspended): Self = this.set("DynamicScalingInSuspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicScalingInSuspended: Self = this.set("DynamicScalingInSuspended", js.undefined)
    
    @scala.inline
    def setDynamicScalingOutSuspended(value: ScalingSuspended): Self = this.set("DynamicScalingOutSuspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicScalingOutSuspended: Self = this.set("DynamicScalingOutSuspended", js.undefined)
    
    @scala.inline
    def setScheduledScalingSuspended(value: ScalingSuspended): Self = this.set("ScheduledScalingSuspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledScalingSuspended: Self = this.set("ScheduledScalingSuspended", js.undefined)
  }
}
