package typings.amapDashJsDashSdk.AMapNs

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
    val __obj = js.Dynamic.literal(adcode = adcode, city = city, forecasts = forecasts, info = info, province = province, reportTime = reportTime)
  
    __obj.asInstanceOf[WeatherForecastResult]
  }
}

