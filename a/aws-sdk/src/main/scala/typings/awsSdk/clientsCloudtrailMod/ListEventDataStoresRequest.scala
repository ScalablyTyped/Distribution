package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventDataStoresRequest extends StObject {
  
  /**
    * The maximum number of event data stores to display on a single page.
    */
  var MaxResults: js.UndefOr[ListEventDataStoresMaxResultsCount] = js.undefined
  
  /**
    * A token you can use to get the next page of event data store results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListEventDataStoresRequest {
  
  inline def apply(): ListEventDataStoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventDataStoresRequest]
  }
  
  extension [Self <: ListEventDataStoresRequest](x: Self) {
    
    inline def setMaxResults(value: ListEventDataStoresMaxResultsCount): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
