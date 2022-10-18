package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkspacesRequest extends StObject {
  
  /**
    * The maximum number of workspaces to include in the results.
    */
  var maxResults: js.UndefOr[ListWorkspacesRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token for the next set of workspaces to return. (You receive this token from a previous ListWorkspaces operation.)
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListWorkspacesRequest {
  
  inline def apply(): ListWorkspacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesRequest]
  }
  
  extension [Self <: ListWorkspacesRequest](x: Self) {
    
    inline def setMaxResults(value: ListWorkspacesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
