package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePredictorResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.undefined
}

object CreatePredictorResponse {
  @scala.inline
  def apply(PredictorArn: Arn = null): CreatePredictorResponse = {
    val __obj = js.Dynamic.literal()
    if (PredictorArn != null) __obj.updateDynamic("PredictorArn")(PredictorArn)
    __obj.asInstanceOf[CreatePredictorResponse]
  }
}

