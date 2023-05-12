package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowStepExecutionRequest extends StObject {
  
  /**
    * Use the unique identifier for a specific runtime instance of the workflow step to get runtime details for that step.
    */
  var stepExecutionId: WorkflowStepExecutionId
}
object GetWorkflowStepExecutionRequest {
  
  inline def apply(stepExecutionId: WorkflowStepExecutionId): GetWorkflowStepExecutionRequest = {
    val __obj = js.Dynamic.literal(stepExecutionId = stepExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowStepExecutionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkflowStepExecutionRequest] (val x: Self) extends AnyVal {
    
    inline def setStepExecutionId(value: WorkflowStepExecutionId): Self = StObject.set(x, "stepExecutionId", value.asInstanceOf[js.Any])
  }
}
