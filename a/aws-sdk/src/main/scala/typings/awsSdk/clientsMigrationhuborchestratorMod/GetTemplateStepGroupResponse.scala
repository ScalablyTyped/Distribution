package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateStepGroupResponse extends StObject {
  
  /**
    * The time at which the step group was created.
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
    * The time at which the step group was last modified.
    */
  var lastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
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
    * The status of the step group.
    */
  var status: js.UndefOr[StepGroupStatus] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: js.UndefOr[String] = js.undefined
  
  /**
    * List of AWS services utilized in a migration workflow.
    */
  var tools: js.UndefOr[ToolsList] = js.undefined
}
object GetTemplateStepGroupResponse {
  
  inline def apply(): GetTemplateStepGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateStepGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateStepGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setStatus(value: StepGroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setTools(value: ToolsList): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: Tool*): Self = StObject.set(x, "tools", js.Array(value*))
  }
}
