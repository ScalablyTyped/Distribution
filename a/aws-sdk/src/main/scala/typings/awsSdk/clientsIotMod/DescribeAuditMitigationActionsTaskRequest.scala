package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditMitigationActionsTaskRequest extends StObject {
  
  /**
    * The unique identifier for the audit mitigation task.
    */
  var taskId: MitigationActionsTaskId
}
object DescribeAuditMitigationActionsTaskRequest {
  
  inline def apply(taskId: MitigationActionsTaskId): DescribeAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAuditMitigationActionsTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: MitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
