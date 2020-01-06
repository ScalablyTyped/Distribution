package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateForecastRequest extends js.Object {
  /**
    * A name for the forecast.
    */
  var ForecastName: Name = js.native
  /**
    * The quantiles at which probabilistic forecasts are generated. You can specify up to 5 quantiles per forecast. Accepted values include 0.01 to 0.99 (increments of .01 only) and mean. The mean forecast is different from the median (0.50) when the distribution is not symmetric (e.g. Beta, Negative Binomial). The default value is ["0.1", "0.5", "0.9"].
    */
  var ForecastTypes: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.ForecastTypes] = js.native
  /**
    * The Amazon Resource Name (ARN) of the predictor to use to generate the forecast.
    */
  var PredictorArn: Arn = js.native
}

object CreateForecastRequest {
  @scala.inline
  def apply(ForecastName: Name, PredictorArn: Arn, ForecastTypes: ForecastTypes = null): CreateForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastName = ForecastName.asInstanceOf[js.Any], PredictorArn = PredictorArn.asInstanceOf[js.Any])
    if (ForecastTypes != null) __obj.updateDynamic("ForecastTypes")(ForecastTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateForecastRequest]
  }
}

