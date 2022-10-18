package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchNetworkProfilesRequest extends StObject {
  
  /**
    * The filters to use to list a specified set of network profiles. Valid filters are NetworkProfileName, Ssid, and SecurityType.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  
  /**
    * The sort order to use to list the specified set of network profiles. Valid sort criteria includes NetworkProfileName, Ssid, and SecurityType.
    */
  var SortCriteria: js.UndefOr[SortList] = js.undefined
}
object SearchNetworkProfilesRequest {
  
  inline def apply(): SearchNetworkProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchNetworkProfilesRequest]
  }
  
  extension [Self <: SearchNetworkProfilesRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortCriteria(value: SortList): Self = StObject.set(x, "SortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "SortCriteria", js.undefined)
    
    inline def setSortCriteriaVarargs(value: Sort*): Self = StObject.set(x, "SortCriteria", js.Array(value*))
  }
}
