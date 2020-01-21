package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeatherForecastResult extends js.Object {
  var adcode: String
  var city: String
  var forecasts: js.Array[Forecast]
  var info: String
  var province: String
  var reportTime: String
}

object WeatherForecastResult {
  @scala.inline
  def apply(
    adcode: String,
    city: String,
    forecasts: js.Array[Forecast],
    info: String,
    province: String,
    reportTime: String
  ): WeatherForecastResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], forecasts = forecasts.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], reportTime = reportTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WeatherForecastResult]
  }
}

