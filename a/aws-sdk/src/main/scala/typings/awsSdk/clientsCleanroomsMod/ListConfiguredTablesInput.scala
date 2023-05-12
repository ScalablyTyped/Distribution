package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfiguredTablesInput extends StObject {
  
  /**
    * The maximum size of the results that is returned per call.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListConfiguredTablesInput {
  
  inline def apply(): ListConfiguredTablesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfiguredTablesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListConfiguredTablesInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
