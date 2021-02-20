package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScalingPlanResourceForecastDataResponse extends StObject {
  
  /**
    * The data points to return.
    */
  var Datapoints: typings.awsSdk.autoscalingplansMod.Datapoints = js.native
}
object GetScalingPlanResourceForecastDataResponse {
  
  @scala.inline
  def apply(Datapoints: Datapoints): GetScalingPlanResourceForecastDataResponse = {
    val __obj = js.Dynamic.literal(Datapoints = Datapoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScalingPlanResourceForecastDataResponse]
  }
  
  @scala.inline
  implicit class GetScalingPlanResourceForecastDataResponseMutableBuilder[Self <: GetScalingPlanResourceForecastDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatapoints(value: Datapoints): Self = StObject.set(x, "Datapoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatapointsVarargs(value: Datapoint*): Self = StObject.set(x, "Datapoints", js.Array(value :_*))
  }
}
