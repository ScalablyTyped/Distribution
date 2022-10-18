package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssetPropertyAggregatesResponse extends StObject {
  
  /**
    * The requested aggregated values.
    */
  var aggregatedValues: AggregatedValues
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetAssetPropertyAggregatesResponse {
  
  inline def apply(aggregatedValues: AggregatedValues): GetAssetPropertyAggregatesResponse = {
    val __obj = js.Dynamic.literal(aggregatedValues = aggregatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyAggregatesResponse]
  }
  
  extension [Self <: GetAssetPropertyAggregatesResponse](x: Self) {
    
    inline def setAggregatedValues(value: AggregatedValues): Self = StObject.set(x, "aggregatedValues", value.asInstanceOf[js.Any])
    
    inline def setAggregatedValuesVarargs(value: AggregatedValue*): Self = StObject.set(x, "aggregatedValues", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
