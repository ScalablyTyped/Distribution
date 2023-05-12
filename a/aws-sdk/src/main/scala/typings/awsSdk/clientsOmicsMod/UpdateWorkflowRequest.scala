package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkflowRequest extends StObject {
  
  /**
    * A description for the workflow.
    */
  var description: js.UndefOr[WorkflowDescription] = js.undefined
  
  /**
    * The workflow's ID.
    */
  var id: WorkflowId
  
  /**
    * A name for the workflow.
    */
  var name: js.UndefOr[WorkflowName] = js.undefined
}
object UpdateWorkflowRequest {
  
  inline def apply(id: WorkflowId): UpdateWorkflowRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: WorkflowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: WorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: WorkflowName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
