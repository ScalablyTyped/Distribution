package typings.awsSdk.clientsPiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableResourceDimensionsResponse extends StObject {
  
  /**
    * The dimension information returned for requested metric types.
    */
  var MetricDimensions: js.UndefOr[MetricDimensionsList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPiMod.NextToken] = js.undefined
}
object ListAvailableResourceDimensionsResponse {
  
  inline def apply(): ListAvailableResourceDimensionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableResourceDimensionsResponse]
  }
  
  extension [Self <: ListAvailableResourceDimensionsResponse](x: Self) {
    
    inline def setMetricDimensions(value: MetricDimensionsList): Self = StObject.set(x, "MetricDimensions", value.asInstanceOf[js.Any])
    
    inline def setMetricDimensionsUndefined: Self = StObject.set(x, "MetricDimensions", js.undefined)
    
    inline def setMetricDimensionsVarargs(value: MetricDimensionGroups*): Self = StObject.set(x, "MetricDimensions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
