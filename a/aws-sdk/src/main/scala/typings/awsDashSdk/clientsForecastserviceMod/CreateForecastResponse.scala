package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateForecastResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.undefined
}

object CreateForecastResponse {
  @scala.inline
  def apply(ForecastArn: Arn = null): CreateForecastResponse = {
    val __obj = js.Dynamic.literal()
    if (ForecastArn != null) __obj.updateDynamic("ForecastArn")(ForecastArn)
    __obj.asInstanceOf[CreateForecastResponse]
  }
}

