package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetMetricsResponse extends StObject {
  
  /**
    * The list of fleet metrics objects.
    */
  var fleetMetrics: js.UndefOr[FleetMetricNameAndArnList] = js.undefined
  
  /**
    * The token for the next set of results. Will not be returned if the operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFleetMetricsResponse {
  
  inline def apply(): ListFleetMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetMetricsResponse]
  }
  
  extension [Self <: ListFleetMetricsResponse](x: Self) {
    
    inline def setFleetMetrics(value: FleetMetricNameAndArnList): Self = StObject.set(x, "fleetMetrics", value.asInstanceOf[js.Any])
    
    inline def setFleetMetricsUndefined: Self = StObject.set(x, "fleetMetrics", js.undefined)
    
    inline def setFleetMetricsVarargs(value: FleetMetricNameAndArn*): Self = StObject.set(x, "fleetMetrics", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
