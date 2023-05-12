package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVariantImportJobsRequest extends StObject {
  
  /**
    * A filter to apply to the list.
    */
  var filter: js.UndefOr[ListVariantImportJobsFilter] = js.undefined
  
  /**
    * A list of job IDs.
    */
  var ids: js.UndefOr[ListVariantImportJobsRequestIdsList] = js.undefined
  
  /**
    * The maximum number of import jobs to return in one page of results.
    */
  var maxResults: js.UndefOr[ListVariantImportJobsRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[ListVariantImportJobsRequestNextTokenString] = js.undefined
}
object ListVariantImportJobsRequest {
  
  inline def apply(): ListVariantImportJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVariantImportJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVariantImportJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ListVariantImportJobsFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIds(value: ListVariantImportJobsRequestIdsList): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: ResourceIdentifier*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaxResults(value: ListVariantImportJobsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListVariantImportJobsRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
