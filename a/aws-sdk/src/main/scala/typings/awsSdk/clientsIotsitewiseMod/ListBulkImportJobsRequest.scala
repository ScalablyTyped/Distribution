package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBulkImportJobsRequest extends StObject {
  
  /**
    * You can use a filter to select the bulk import jobs that you want to retrieve.
    */
  var filter: js.UndefOr[ListBulkImportJobsFilter] = js.undefined
  
  /**
    * The maximum number of results to return for each paginated request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBulkImportJobsRequest {
  
  inline def apply(): ListBulkImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBulkImportJobsRequest]
  }
  
  extension [Self <: ListBulkImportJobsRequest](x: Self) {
    
    inline def setFilter(value: ListBulkImportJobsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
