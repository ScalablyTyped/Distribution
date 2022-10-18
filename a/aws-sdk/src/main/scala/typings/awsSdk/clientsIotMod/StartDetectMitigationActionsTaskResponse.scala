package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDetectMitigationActionsTaskResponse extends StObject {
  
  /**
    *  The unique identifier of the task. 
    */
  var taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
}
object StartDetectMitigationActionsTaskResponse {
  
  inline def apply(): StartDetectMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDetectMitigationActionsTaskResponse]
  }
  
  extension [Self <: StartDetectMitigationActionsTaskResponse](x: Self) {
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
