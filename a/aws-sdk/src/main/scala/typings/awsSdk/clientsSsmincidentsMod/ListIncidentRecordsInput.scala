package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIncidentRecordsInput extends StObject {
  
  /**
    * Filters the list of incident records through which you are searching. You can filter on the following keys:    creationTime     impact     status     createdBy    Note the following when deciding how to use Filters:   If you don't specify a Filter, the response includes all incident records.   If you specify more than one filter in a single request, the response returns incident records that match all filters.   If you specify a filter with more than one value, the response returns incident records that match any of the values provided.  
    */
  var filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListIncidentRecordsInput {
  
  inline def apply(): ListIncidentRecordsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIncidentRecordsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIncidentRecordsInput] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
