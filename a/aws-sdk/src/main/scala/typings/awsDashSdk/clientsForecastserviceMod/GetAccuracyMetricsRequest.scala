package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccuracyMetricsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor to get metrics for.
    */
  var PredictorArn: Arn
}

object GetAccuracyMetricsRequest {
  @scala.inline
  def apply(PredictorArn: Arn): GetAccuracyMetricsRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn)
  
    __obj.asInstanceOf[GetAccuracyMetricsRequest]
  }
}

