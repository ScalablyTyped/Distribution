package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkflowStepGroupRequest extends StObject {
  
  /**
    * The ID of the step group you want to delete.
    */
  var id: StepGroupId
  
  /**
    * The ID of the migration workflow.
    */
  var workflowId: MigrationWorkflowId
}
object DeleteWorkflowStepGroupRequest {
  
  inline def apply(id: StepGroupId, workflowId: MigrationWorkflowId): DeleteWorkflowStepGroupRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkflowStepGroupRequest]
  }
  
  extension [Self <: DeleteWorkflowStepGroupRequest](x: Self) {
    
    inline def setId(value: StepGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: MigrationWorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
