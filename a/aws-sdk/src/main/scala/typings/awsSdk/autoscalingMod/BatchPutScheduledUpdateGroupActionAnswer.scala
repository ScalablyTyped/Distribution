package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutScheduledUpdateGroupActionAnswer extends js.Object {
  
  /**
    * The names of the scheduled actions that could not be created or updated, including an error message.
    */
  var FailedScheduledUpdateGroupActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.native
}
object BatchPutScheduledUpdateGroupActionAnswer {
  
  @scala.inline
  def apply(): BatchPutScheduledUpdateGroupActionAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutScheduledUpdateGroupActionAnswer]
  }
  
  @scala.inline
  implicit class BatchPutScheduledUpdateGroupActionAnswerOps[Self <: BatchPutScheduledUpdateGroupActionAnswer] (val x: Self) extends AnyVal {
    
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
    def setFailedScheduledUpdateGroupActionsVarargs(value: FailedScheduledUpdateGroupActionRequest*): Self = this.set("FailedScheduledUpdateGroupActions", js.Array(value :_*))
    
    @scala.inline
    def setFailedScheduledUpdateGroupActions(value: FailedScheduledUpdateGroupActionRequests): Self = this.set("FailedScheduledUpdateGroupActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedScheduledUpdateGroupActions: Self = this.set("FailedScheduledUpdateGroupActions", js.undefined)
  }
}
