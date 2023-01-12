package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowStepGroupResponse extends StObject {
  
  /**
    * The time at which the step group is created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the step group.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the step group.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the step group.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The next step group.
    */
  var next: js.UndefOr[StringList] = js.undefined
  
  /**
    * The previous step group.
    */
  var previous: js.UndefOr[StringList] = js.undefined
  
  /**
    * List of AWS services utilized in a migration workflow.
    */
  var tools: js.UndefOr[ToolsList] = js.undefined
  
  /**
    * The ID of the migration workflow that contains the step group.
    */
  var workflowId: js.UndefOr[String] = js.undefined
}
object CreateWorkflowStepGroupResponse {
  
  inline def apply(): CreateWorkflowStepGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkflowStepGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkflowStepGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setTools(value: ToolsList): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: Tool*): Self = StObject.set(x, "tools", js.Array(value*))
    
    inline def setWorkflowId(value: String): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
  }
}
