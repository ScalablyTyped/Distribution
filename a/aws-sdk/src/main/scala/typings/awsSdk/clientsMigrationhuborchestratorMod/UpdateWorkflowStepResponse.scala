package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkflowStepResponse extends StObject {
  
  /**
    * The ID of the step.
    */
  var id: js.UndefOr[StepId] = js.undefined
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the step group.
    */
  var stepGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var workflowId: js.UndefOr[String] = js.undefined
}
object UpdateWorkflowStepResponse {
  
  inline def apply(): UpdateWorkflowStepResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkflowStepResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkflowStepResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: StepId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStepGroupId(value: String): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setStepGroupIdUndefined: Self = StObject.set(x, "stepGroupId", js.undefined)
    
    inline def setWorkflowId(value: String): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
  }
}
