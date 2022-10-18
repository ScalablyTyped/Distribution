package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalousLogGroupsRequest extends StObject {
  
  /**
    *  The ID of the insight containing the log groups. 
    */
  var InsightId: typings.awsSdk.clientsDevopsguruMod.InsightId
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[ListAnomalousLogGroupsMaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
}
object ListAnomalousLogGroupsRequest {
  
  inline def apply(InsightId: InsightId): ListAnomalousLogGroupsRequest = {
    val __obj = js.Dynamic.literal(InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnomalousLogGroupsRequest]
  }
  
  extension [Self <: ListAnomalousLogGroupsRequest](x: Self) {
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListAnomalousLogGroupsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
