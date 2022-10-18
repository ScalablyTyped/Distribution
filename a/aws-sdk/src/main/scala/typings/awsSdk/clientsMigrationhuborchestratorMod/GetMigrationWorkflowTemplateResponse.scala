package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationWorkflowTemplateResponse extends StObject {
  
  /**
    * The time at which the template was last created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the template was last created.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the template.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The inputs provided for the creation of the migration workflow.
    */
  var inputs: js.UndefOr[TemplateInputList] = js.undefined
  
  /**
    * The name of the template.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the template.
    */
  var status: js.UndefOr[TemplateStatus] = js.undefined
  
  /**
    * List of AWS services utilized in a migration workflow.
    */
  var tools: js.UndefOr[ToolsList] = js.undefined
}
object GetMigrationWorkflowTemplateResponse {
  
  inline def apply(): GetMigrationWorkflowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMigrationWorkflowTemplateResponse]
  }
  
  extension [Self <: GetMigrationWorkflowTemplateResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputs(value: TemplateInputList): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: TemplateInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: TemplateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTools(value: ToolsList): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: Tool*): Self = StObject.set(x, "tools", js.Array(value*))
  }
}
