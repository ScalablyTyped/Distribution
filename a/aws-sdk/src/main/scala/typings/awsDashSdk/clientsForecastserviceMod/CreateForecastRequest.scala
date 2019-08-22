package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateForecastRequest extends js.Object {
  /**
    * The name for the forecast.
    */
  var ForecastName: Name
  /**
    * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
    */
  var PredictorArn: Arn
}

object CreateForecastRequest {
  @scala.inline
  def apply(ForecastName: Name, PredictorArn: Arn): CreateForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastName = ForecastName, PredictorArn = PredictorArn)
  
    __obj.asInstanceOf[CreateForecastRequest]
  }
}

