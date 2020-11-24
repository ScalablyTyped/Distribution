package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityType extends js.Object {
  
  /**
    * A scaling activity.
    */
  var Activity: js.UndefOr[typings.awsSdk.autoscalingMod.Activity] = js.native
}
object ActivityType {
  
  @scala.inline
  def apply(): ActivityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityType]
  }
  
  @scala.inline
  implicit class ActivityTypeOps[Self <: ActivityType] (val x: Self) extends AnyVal {
    
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
    def setActivity(value: Activity): Self = this.set("Activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivity: Self = this.set("Activity", js.undefined)
  }
}
