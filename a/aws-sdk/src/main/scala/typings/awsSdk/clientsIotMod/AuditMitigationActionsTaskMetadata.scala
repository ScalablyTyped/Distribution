package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditMitigationActionsTaskMetadata extends StObject {
  
  /**
    * The time at which the audit mitigation actions task was started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier for the task.
    */
  var taskId: js.UndefOr[MitigationActionsTaskId] = js.undefined
  
  /**
    * The current state of the audit mitigation actions task.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.undefined
}
object AuditMitigationActionsTaskMetadata {
  
  inline def apply(): AuditMitigationActionsTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionsTaskMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditMitigationActionsTaskMetadata] (val x: Self) extends AnyVal {
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setTaskStatus(value: AuditMitigationActionsTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
  }
}
