package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateStepRequest extends StObject {
  
  /**
    * The ID of the step.
    */
  var id: StepId
  
  /**
    * The ID of the step group.
    */
  var stepGroupId: StepGroupId
  
  /**
    * The ID of the template.
    */
  var templateId: TemplateId
}
object GetTemplateStepRequest {
  
  inline def apply(id: StepId, stepGroupId: StepGroupId, templateId: TemplateId): GetTemplateStepRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stepGroupId = stepGroupId.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateStepRequest]
  }
  
  extension [Self <: GetTemplateStepRequest](x: Self) {
    
    inline def setId(value: StepId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStepGroupId(value: StepGroupId): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
