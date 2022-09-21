package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScalingPlanResourceForecastDataResponse extends StObject {
  
  /**
    * The data points to return.
    */
  var Datapoints: typings.awsSdk.autoscalingplansMod.Datapoints
}
object GetScalingPlanResourceForecastDataResponse {
  
  inline def apply(Datapoints: Datapoints): GetScalingPlanResourceForecastDataResponse = {
    val __obj = js.Dynamic.literal(Datapoints = Datapoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScalingPlanResourceForecastDataResponse]
  }
  
  extension [Self <: GetScalingPlanResourceForecastDataResponse](x: Self) {
    
    inline def setDatapoints(value: Datapoints): Self = StObject.set(x, "Datapoints", value.asInstanceOf[js.Any])
    
    inline def setDatapointsVarargs(value: Datapoint*): Self = StObject.set(x, "Datapoints", js.Array(value*))
  }
}
