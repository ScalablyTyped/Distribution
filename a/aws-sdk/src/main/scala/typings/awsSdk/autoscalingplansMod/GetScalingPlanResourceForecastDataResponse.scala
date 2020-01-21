package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

