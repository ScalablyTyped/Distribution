package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateStepsRequest extends StObject {
  
  /**
    * The maximum number of results that can be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID of the step group.
    */
  var stepGroupId: StepGroupId
  
  /**
    * The ID of the template.
    */
  var templateId: TemplateId
}
object ListTemplateStepsRequest {
  
  inline def apply(stepGroupId: StepGroupId, templateId: TemplateId): ListTemplateStepsRequest = {
    val __obj = js.Dynamic.literal(stepGroupId = stepGroupId.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateStepsRequest]
  }
  
  extension [Self <: ListTemplateStepsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStepGroupId(value: StepGroupId): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
