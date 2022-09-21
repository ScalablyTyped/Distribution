package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchJobsRequest extends StObject {
  
  /**
    * The filter values to use when searching for a job.
    */
  var filters: SearchJobsRequestFiltersList
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[SearchJobsRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token used for pagination of results returned in the response. Use the token returned from the previous request to continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object SearchJobsRequest {
  
  inline def apply(filters: SearchJobsRequestFiltersList): SearchJobsRequest = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchJobsRequest]
  }
  
  extension [Self <: SearchJobsRequest](x: Self) {
    
    inline def setFilters(value: SearchJobsRequestFiltersList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: SearchJobsFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: SearchJobsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
