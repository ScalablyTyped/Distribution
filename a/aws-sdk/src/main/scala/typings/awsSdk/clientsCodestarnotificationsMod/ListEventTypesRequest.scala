package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventTypesRequest extends StObject {
  
  /**
    * The filters to use to return information by service or resource type.
    */
  var Filters: js.UndefOr[ListEventTypesFilters] = js.undefined
  
  /**
    * A non-negative integer used to limit the number of returned results. The default number is 50. The maximum number of results that can be returned is 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.MaxResults] = js.undefined
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.NextToken] = js.undefined
}
object ListEventTypesRequest {
  
  inline def apply(): ListEventTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTypesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventTypesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: ListEventTypesFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: ListEventTypesFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
