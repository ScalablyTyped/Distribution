package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkspacesRequest extends StObject {
  
  /**
    * Optional filter for workspace alias. Only the workspaces with aliases that begin with this value will be returned.
    */
  var alias: js.UndefOr[WorkspaceAlias] = js.undefined
  
  /**
    * Maximum results to return in response (default=100, maximum=1000).
    */
  var maxResults: js.UndefOr[ListWorkspacesRequestMaxResultsInteger] = js.undefined
  
  /**
    * Pagination token to request the next page in a paginated list. This token is obtained from the output of the previous ListWorkspaces request.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListWorkspacesRequest {
  
  inline def apply(): ListWorkspacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesRequest]
  }
  
  extension [Self <: ListWorkspacesRequest](x: Self) {
    
    inline def setAlias(value: WorkspaceAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setMaxResults(value: ListWorkspacesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
