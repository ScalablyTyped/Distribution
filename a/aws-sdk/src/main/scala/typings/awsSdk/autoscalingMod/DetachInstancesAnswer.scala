package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachInstancesAnswer extends js.Object {
  
  /**
    * The activities related to detaching the instances from the Auto Scaling group.
    */
  var Activities: js.UndefOr[typings.awsSdk.autoscalingMod.Activities] = js.native
}
object DetachInstancesAnswer {
  
  @scala.inline
  def apply(): DetachInstancesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachInstancesAnswer]
  }
  
  @scala.inline
  implicit class DetachInstancesAnswerOps[Self <: DetachInstancesAnswer] (val x: Self) extends AnyVal {
    
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
    def setActivitiesVarargs(value: Activity*): Self = this.set("Activities", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: Activities): Self = this.set("Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivities: Self = this.set("Activities", js.undefined)
  }
}
