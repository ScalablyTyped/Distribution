package typings.awsDashSdk.clientsForecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryForecastResponse extends js.Object {
  /**
    * The forecast.
    */
  var Forecast: js.UndefOr[typings.awsDashSdk.clientsForecastqueryserviceMod.Forecast] = js.undefined
}

object QueryForecastResponse {
  @scala.inline
  def apply(Forecast: Forecast = null): QueryForecastResponse = {
    val __obj = js.Dynamic.literal()
    if (Forecast != null) __obj.updateDynamic("Forecast")(Forecast)
    __obj.asInstanceOf[QueryForecastResponse]
  }
}

