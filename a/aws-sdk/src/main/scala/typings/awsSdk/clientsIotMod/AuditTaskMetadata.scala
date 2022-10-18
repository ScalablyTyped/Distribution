package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditTaskMetadata extends StObject {
  
  /**
    * The ID of this audit.
    */
  var taskId: js.UndefOr[AuditTaskId] = js.undefined
  
  /**
    * The status of this audit. One of "IN_PROGRESS", "COMPLETED", "FAILED", or "CANCELED".
    */
  var taskStatus: js.UndefOr[AuditTaskStatus] = js.undefined
  
  /**
    * The type of this audit. One of "ON_DEMAND_AUDIT_TASK" or "SCHEDULED_AUDIT_TASK".
    */
  var taskType: js.UndefOr[AuditTaskType] = js.undefined
}
object AuditTaskMetadata {
  
  inline def apply(): AuditTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditTaskMetadata]
  }
  
  extension [Self <: AuditTaskMetadata](x: Self) {
    
    inline def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setTaskStatus(value: AuditTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
    
    inline def setTaskType(value: AuditTaskType): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
    
    inline def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
  }
}
