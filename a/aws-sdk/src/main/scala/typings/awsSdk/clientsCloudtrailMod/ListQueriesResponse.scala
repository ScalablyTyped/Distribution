package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueriesResponse extends StObject {
  
  /**
    * A token you can use to get the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Lists matching query results, and shows query ID, status, and creation time of each query.
    */
  var Queries: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.Queries] = js.undefined
}
object ListQueriesResponse {
  
  inline def apply(): ListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQueriesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueries(value: Queries): Self = StObject.set(x, "Queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "Queries", js.undefined)
    
    inline def setQueriesVarargs(value: Query*): Self = StObject.set(x, "Queries", js.Array(value*))
  }
}
