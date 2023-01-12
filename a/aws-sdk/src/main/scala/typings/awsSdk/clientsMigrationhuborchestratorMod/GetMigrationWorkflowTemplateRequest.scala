package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationWorkflowTemplateRequest extends StObject {
  
  /**
    * The ID of the template.
    */
  var id: TemplateId
}
object GetMigrationWorkflowTemplateRequest {
  
  inline def apply(id: TemplateId): GetMigrationWorkflowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMigrationWorkflowTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMigrationWorkflowTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: TemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
