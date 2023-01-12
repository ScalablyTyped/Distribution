package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyspacesRequest extends StObject {
  
  /**
    * The total number of keyspaces to return in the output. If the total number of keyspaces available is more than the value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as an argument of a subsequent API invocation.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token. To resume pagination, provide the NextToken value as argument of a subsequent API invocation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListKeyspacesRequest {
  
  inline def apply(): ListKeyspacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyspacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeyspacesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
