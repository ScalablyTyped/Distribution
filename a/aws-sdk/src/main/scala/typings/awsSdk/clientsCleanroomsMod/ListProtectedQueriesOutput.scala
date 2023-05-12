package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectedQueriesOutput extends StObject {
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of protected queries.
    */
  var protectedQueries: ProtectedQuerySummaryList
}
object ListProtectedQueriesOutput {
  
  inline def apply(protectedQueries: ProtectedQuerySummaryList): ListProtectedQueriesOutput = {
    val __obj = js.Dynamic.literal(protectedQueries = protectedQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtectedQueriesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProtectedQueriesOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProtectedQueries(value: ProtectedQuerySummaryList): Self = StObject.set(x, "protectedQueries", value.asInstanceOf[js.Any])
    
    inline def setProtectedQueriesVarargs(value: ProtectedQuerySummary*): Self = StObject.set(x, "protectedQueries", js.Array(value*))
  }
}
