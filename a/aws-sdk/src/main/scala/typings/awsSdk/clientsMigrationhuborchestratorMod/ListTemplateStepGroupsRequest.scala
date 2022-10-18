package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateStepGroupsRequest extends StObject {
  
  /**
    * The maximum number of results that can be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: TemplateId
}
object ListTemplateStepGroupsRequest {
  
  inline def apply(templateId: TemplateId): ListTemplateStepGroupsRequest = {
    val __obj = js.Dynamic.literal(templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateStepGroupsRequest]
  }
  
  extension [Self <: ListTemplateStepGroupsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
