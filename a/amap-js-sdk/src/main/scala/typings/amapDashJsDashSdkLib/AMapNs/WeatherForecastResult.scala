package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeatherForecastResult extends js.Object {
  var adcode: java.lang.String
  var city: java.lang.String
  var forecasts: js.Array[Forecast]
  var info: java.lang.String
  var province: java.lang.String
  var reportTime: java.lang.String
}

object WeatherForecastResult {
  @scala.inline
  def apply(
    adcode: java.lang.String,
    city: java.lang.String,
    forecasts: js.Array[Forecast],
    info: java.lang.String,
    province: java.lang.String,
    reportTime: java.lang.String
  ): WeatherForecastResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adcode")(adcode)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("forecasts")(forecasts)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("province")(province)
    __obj.updateDynamic("reportTime")(reportTime)
    __obj.asInstanceOf[WeatherForecastResult]
  }
}

