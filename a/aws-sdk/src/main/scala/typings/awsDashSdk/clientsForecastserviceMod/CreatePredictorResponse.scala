package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePredictorResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.native
}

object CreatePredictorResponse {
  @scala.inline
  def apply(PredictorArn: Arn = null): CreatePredictorResponse = {
    val __obj = js.Dynamic.literal()
    if (PredictorArn != null) __obj.updateDynamic("PredictorArn")(PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePredictorResponse]
  }
}

