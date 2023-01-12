package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAuditMitigationActionsTaskResponse extends StObject {
  
  /**
    * The unique identifier for the audit mitigation task. This matches the taskId that you specified in the request.
    */
  var taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
}
object StartAuditMitigationActionsTaskResponse {
  
  inline def apply(): StartAuditMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAuditMitigationActionsTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartAuditMitigationActionsTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
