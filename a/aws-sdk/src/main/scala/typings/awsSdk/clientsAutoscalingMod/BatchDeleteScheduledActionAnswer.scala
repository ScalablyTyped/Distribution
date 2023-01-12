package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteScheduledActionAnswer extends StObject {
  
  /**
    * The names of the scheduled actions that could not be deleted, including an error message.
    */
  var FailedScheduledActions: js.UndefOr[FailedScheduledUpdateGroupActionRequests] = js.undefined
}
object BatchDeleteScheduledActionAnswer {
  
  inline def apply(): BatchDeleteScheduledActionAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteScheduledActionAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteScheduledActionAnswer] (val x: Self) extends AnyVal {
    
    inline def setFailedScheduledActions(value: FailedScheduledUpdateGroupActionRequests): Self = StObject.set(x, "FailedScheduledActions", value.asInstanceOf[js.Any])
    
    inline def setFailedScheduledActionsUndefined: Self = StObject.set(x, "FailedScheduledActions", js.undefined)
    
    inline def setFailedScheduledActionsVarargs(value: FailedScheduledUpdateGroupActionRequest*): Self = StObject.set(x, "FailedScheduledActions", js.Array(value*))
  }
}
