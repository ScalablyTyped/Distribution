package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkflowStepGroupRequest extends StObject {
  
  /**
    * The description of the step group.
    */
  var description: js.UndefOr[StepGroupDescription] = js.undefined
  
  /**
    * The ID of the step group.
    */
  var id: StepGroupId
  
  /**
    * The name of the step group.
    */
  var name: js.UndefOr[StepGroupName] = js.undefined
  
  /**
    * The next step group.
    */
  var next: js.UndefOr[StringList] = js.undefined
  
  /**
    * The previous step group.
    */
  var previous: js.UndefOr[StringList] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var workflowId: MigrationWorkflowId
}
object UpdateWorkflowStepGroupRequest {
  
  inline def apply(id: StepGroupId, workflowId: MigrationWorkflowId): UpdateWorkflowStepGroupRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowStepGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkflowStepGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: StepGroupDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: StepGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: StepGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setWorkflowId(value: MigrationWorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
