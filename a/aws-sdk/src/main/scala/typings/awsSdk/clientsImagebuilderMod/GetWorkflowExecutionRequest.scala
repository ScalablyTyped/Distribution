package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowExecutionRequest extends StObject {
  
  /**
    * Use the unique identifier for a runtime instance of the workflow to get runtime details.
    */
  var workflowExecutionId: WorkflowExecutionId
}
object GetWorkflowExecutionRequest {
  
  inline def apply(workflowExecutionId: WorkflowExecutionId): GetWorkflowExecutionRequest = {
    val __obj = js.Dynamic.literal(workflowExecutionId = workflowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkflowExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setWorkflowExecutionId(value: WorkflowExecutionId): Self = StObject.set(x, "workflowExecutionId", value.asInstanceOf[js.Any])
  }
}
