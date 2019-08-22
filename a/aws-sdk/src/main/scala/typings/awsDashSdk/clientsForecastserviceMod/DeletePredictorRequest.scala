package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePredictorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor to delete.
    */
  var PredictorArn: Arn
}

object DeletePredictorRequest {
  @scala.inline
  def apply(PredictorArn: Arn): DeletePredictorRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn)
  
    __obj.asInstanceOf[DeletePredictorRequest]
  }
}

