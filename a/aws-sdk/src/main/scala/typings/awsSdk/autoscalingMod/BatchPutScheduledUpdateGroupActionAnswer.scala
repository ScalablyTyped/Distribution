package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutScheduledUpdateGroupActionAnswer extends StObject {
  
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
  implicit class BatchPutScheduledUpdateGroupActionAnswerMutableBuilder[Self <: BatchPutScheduledUpdateGroupActionAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedScheduledUpdateGroupActions(value: FailedScheduledUpdateGroupActionRequests): Self = StObject.set(x, "FailedScheduledUpdateGroupActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedScheduledUpdateGroupActionsUndefined: Self = StObject.set(x, "FailedScheduledUpdateGroupActions", js.undefined)
    
    @scala.inline
    def setFailedScheduledUpdateGroupActionsVarargs(value: FailedScheduledUpdateGroupActionRequest*): Self = StObject.set(x, "FailedScheduledUpdateGroupActions", js.Array(value :_*))
  }
}
