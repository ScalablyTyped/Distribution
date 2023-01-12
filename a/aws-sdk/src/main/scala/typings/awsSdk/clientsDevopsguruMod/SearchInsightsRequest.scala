package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInsightsRequest extends StObject {
  
  /**
    *  A SearchInsightsFilters object that is used to set the severity and status filters on your insight search. 
    */
  var Filters: js.UndefOr[SearchInsightsFilters] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[SearchInsightsMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  The start of the time range passed in. Returned insights occurred after this time. 
    */
  var StartTimeRange: typings.awsSdk.clientsDevopsguruMod.StartTimeRange
  
  /**
    *  The type of insights you are searching for (REACTIVE or PROACTIVE). 
    */
  var Type: InsightType
}
object SearchInsightsRequest {
  
  inline def apply(StartTimeRange: StartTimeRange, Type: InsightType): SearchInsightsRequest = {
    val __obj = js.Dynamic.literal(StartTimeRange = StartTimeRange.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInsightsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchInsightsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: SearchInsightsFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setMaxResults(value: SearchInsightsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartTimeRange(value: StartTimeRange): Self = StObject.set(x, "StartTimeRange", value.asInstanceOf[js.Any])
    
    inline def setType(value: InsightType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
