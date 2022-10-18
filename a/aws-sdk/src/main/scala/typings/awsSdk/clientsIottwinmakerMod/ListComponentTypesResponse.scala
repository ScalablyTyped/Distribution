package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentTypesResponse extends StObject {
  
  /**
    * A list of objects that contain information about the component types.
    */
  var componentTypeSummaries: ComponentTypeSummaries
  
  /**
    * Specifies the maximum number of results to display.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object ListComponentTypesResponse {
  
  inline def apply(componentTypeSummaries: ComponentTypeSummaries, workspaceId: Id): ListComponentTypesResponse = {
    val __obj = js.Dynamic.literal(componentTypeSummaries = componentTypeSummaries.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentTypesResponse]
  }
  
  extension [Self <: ListComponentTypesResponse](x: Self) {
    
    inline def setComponentTypeSummaries(value: ComponentTypeSummaries): Self = StObject.set(x, "componentTypeSummaries", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeSummariesVarargs(value: ComponentTypeSummary*): Self = StObject.set(x, "componentTypeSummaries", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
