package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDetectMitigationActionsTaskRequest extends StObject {
  
  /**
    *  The unique identifier of the task. 
    */
  var taskId: MitigationActionsTaskId
}
object CancelDetectMitigationActionsTaskRequest {
  
  inline def apply(taskId: MitigationActionsTaskId): CancelDetectMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDetectMitigationActionsTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelDetectMitigationActionsTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
