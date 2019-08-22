package typings.awsDashSdk.clientsForecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Forecast extends js.Object {
  /**
    * The forecast. The string of the string to array map is one of the following values:   mean   p10   p50   p90  
    */
  var Predictions: js.UndefOr[typings.awsDashSdk.clientsForecastqueryserviceMod.Predictions] = js.undefined
}

object Forecast {
  @scala.inline
  def apply(Predictions: Predictions = null): Forecast = {
    val __obj = js.Dynamic.literal()
    if (Predictions != null) __obj.updateDynamic("Predictions")(Predictions)
    __obj.asInstanceOf[Forecast]
  }
}

