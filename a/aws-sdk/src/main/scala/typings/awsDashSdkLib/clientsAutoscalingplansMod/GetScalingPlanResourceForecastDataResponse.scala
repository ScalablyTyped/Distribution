package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScalingPlanResourceForecastDataResponse extends js.Object {
  /**
    * The data points to return.
    */
  var Datapoints: awsDashSdkLib.clientsAutoscalingplansMod.Datapoints
}

object GetScalingPlanResourceForecastDataResponse {
  @scala.inline
  def apply(Datapoints: Datapoints): GetScalingPlanResourceForecastDataResponse = {
    val __obj = js.Dynamic.literal(Datapoints = Datapoints)
  
    __obj.asInstanceOf[GetScalingPlanResourceForecastDataResponse]
  }
}

