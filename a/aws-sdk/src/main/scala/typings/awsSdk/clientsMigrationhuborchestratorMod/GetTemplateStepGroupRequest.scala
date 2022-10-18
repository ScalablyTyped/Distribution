package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateStepGroupRequest extends StObject {
  
  /**
    * The ID of the step group.
    */
  var id: StepGroupId
  
  /**
    * The ID of the template.
    */
  var templateId: TemplateId
}
object GetTemplateStepGroupRequest {
  
  inline def apply(id: StepGroupId, templateId: TemplateId): GetTemplateStepGroupRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateStepGroupRequest]
  }
  
  extension [Self <: GetTemplateStepGroupRequest](x: Self) {
    
    inline def setId(value: StepGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
