package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkspacesResponse extends StObject {
  
  /**
    * Pagination token to use when requesting the next page in this list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of existing workspaces, including those undergoing creation or deletion.
    */
  var workspaces: WorkspaceSummaryList
}
object ListWorkspacesResponse {
  
  inline def apply(workspaces: WorkspaceSummaryList): ListWorkspacesResponse = {
    val __obj = js.Dynamic.literal(workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkspacesResponse]
  }
  
  extension [Self <: ListWorkspacesResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkspaces(value: WorkspaceSummaryList): Self = StObject.set(x, "workspaces", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesVarargs(value: WorkspaceSummary*): Self = StObject.set(x, "workspaces", js.Array(value*))
  }
}
