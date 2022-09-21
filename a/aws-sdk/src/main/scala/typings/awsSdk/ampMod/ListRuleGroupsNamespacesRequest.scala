package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleGroupsNamespacesRequest extends StObject {
  
  /**
    * Maximum results to return in response (default=100, maximum=1000).
    */
  var maxResults: js.UndefOr[ListRuleGroupsNamespacesRequestMaxResultsInteger] = js.undefined
  
  /**
    * Optional filter for rule groups namespace name. Only the rule groups namespace that begin with this value will be returned.
    */
  var name: js.UndefOr[RuleGroupsNamespaceName] = js.undefined
  
  /**
    * Pagination token to request the next page in a paginated list. This token is obtained from the output of the previous ListRuleGroupsNamespaces request.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: WorkspaceId
}
object ListRuleGroupsNamespacesRequest {
  
  inline def apply(workspaceId: WorkspaceId): ListRuleGroupsNamespacesRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRuleGroupsNamespacesRequest]
  }
  
  extension [Self <: ListRuleGroupsNamespacesRequest](x: Self) {
    
    inline def setMaxResults(value: ListRuleGroupsNamespacesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: RuleGroupsNamespaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
