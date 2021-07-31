package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQuantumTasksRequest extends StObject {
  
  /**
    * Array of SearchQuantumTasksFilter objects.
    */
  var filters: SearchQuantumTasksRequestFiltersList
  
  /**
    * Maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[SearchQuantumTasksRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token used for pagination of results returned in the response. Use the token returned from the previous request continue results where the previous request ended.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object SearchQuantumTasksRequest {
  
  @scala.inline
  def apply(filters: SearchQuantumTasksRequestFiltersList): SearchQuantumTasksRequest = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuantumTasksRequest]
  }
  
  @scala.inline
  implicit class SearchQuantumTasksRequestMutableBuilder[Self <: SearchQuantumTasksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: SearchQuantumTasksRequestFiltersList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: SearchQuantumTasksFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: SearchQuantumTasksRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
