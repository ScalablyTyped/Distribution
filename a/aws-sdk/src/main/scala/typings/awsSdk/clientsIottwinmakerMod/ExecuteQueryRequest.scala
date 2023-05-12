package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteQueryRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time. The default is 25. Valid Range: Minimum value of 1. Maximum value of 250.
    */
  var maxResults: js.UndefOr[QueryServiceMaxResults] = js.undefined
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The query statement.
    */
  var queryStatement: QueryStatement
  
  /**
    * The ID of the workspace.
    */
  var workspaceId: Id
}
object ExecuteQueryRequest {
  
  inline def apply(queryStatement: QueryStatement, workspaceId: Id): ExecuteQueryRequest = {
    val __obj = js.Dynamic.literal(queryStatement = queryStatement.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: QueryServiceMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setQueryStatement(value: QueryStatement): Self = StObject.set(x, "queryStatement", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
