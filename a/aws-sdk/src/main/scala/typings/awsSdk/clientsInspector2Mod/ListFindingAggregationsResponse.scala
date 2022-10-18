package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingAggregationsResponse extends StObject {
  
  /**
    * The type of aggregation to perform.
    */
  var aggregationType: AggregationType
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Objects that contain the results of an aggregation operation.
    */
  var responses: js.UndefOr[AggregationResponseList] = js.undefined
}
object ListFindingAggregationsResponse {
  
  inline def apply(aggregationType: AggregationType): ListFindingAggregationsResponse = {
    val __obj = js.Dynamic.literal(aggregationType = aggregationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingAggregationsResponse]
  }
  
  extension [Self <: ListFindingAggregationsResponse](x: Self) {
    
    inline def setAggregationType(value: AggregationType): Self = StObject.set(x, "aggregationType", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResponses(value: AggregationResponseList): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: AggregationResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
