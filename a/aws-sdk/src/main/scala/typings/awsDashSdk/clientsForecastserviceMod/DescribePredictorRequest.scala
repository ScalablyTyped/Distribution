package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePredictorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor that you want information about.
    */
  var PredictorArn: Arn
}

object DescribePredictorRequest {
  @scala.inline
  def apply(PredictorArn: Arn): DescribePredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn)
  
    __obj.asInstanceOf[DescribePredictorRequest]
  }
}

