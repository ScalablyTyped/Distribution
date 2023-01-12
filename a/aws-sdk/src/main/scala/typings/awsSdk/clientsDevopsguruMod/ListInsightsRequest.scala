package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInsightsRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[ListInsightsMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  A filter used to filter the returned insights by their status. You can specify one status filter. 
    */
  var StatusFilter: ListInsightsStatusFilter
}
object ListInsightsRequest {
  
  inline def apply(StatusFilter: ListInsightsStatusFilter): ListInsightsRequest = {
    val __obj = js.Dynamic.literal(StatusFilter = StatusFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInsightsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInsightsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListInsightsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusFilter(value: ListInsightsStatusFilter): Self = StObject.set(x, "StatusFilter", value.asInstanceOf[js.Any])
  }
}
