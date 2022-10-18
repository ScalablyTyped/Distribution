package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnomalyGroupRelatedMetricsResponse extends StObject {
  
  /**
    * Aggregated details about the measures contributing to the anomaly group, and the measures potentially impacted by the anomaly group.
    */
  var InterMetricImpactList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.InterMetricImpactList] = js.undefined
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.NextToken] = js.undefined
}
object ListAnomalyGroupRelatedMetricsResponse {
  
  inline def apply(): ListAnomalyGroupRelatedMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnomalyGroupRelatedMetricsResponse]
  }
  
  extension [Self <: ListAnomalyGroupRelatedMetricsResponse](x: Self) {
    
    inline def setInterMetricImpactList(value: InterMetricImpactList): Self = StObject.set(x, "InterMetricImpactList", value.asInstanceOf[js.Any])
    
    inline def setInterMetricImpactListUndefined: Self = StObject.set(x, "InterMetricImpactList", js.undefined)
    
    inline def setInterMetricImpactListVarargs(value: InterMetricImpactDetails*): Self = StObject.set(x, "InterMetricImpactList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
