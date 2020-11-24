package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetScalingPlanResourceForecastDataResponse extends js.Object {
  
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
  implicit class GetScalingPlanResourceForecastDataResponseOps[Self <: GetScalingPlanResourceForecastDataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatapointsVarargs(value: Datapoint*): Self = this.set("Datapoints", js.Array(value :_*))
    
    @scala.inline
    def setDatapoints(value: Datapoints): Self = this.set("Datapoints", value.asInstanceOf[js.Any])
  }
}
