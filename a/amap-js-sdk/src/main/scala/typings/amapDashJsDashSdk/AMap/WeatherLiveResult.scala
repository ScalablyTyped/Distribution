package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 天气插件
trait WeatherLiveResult extends js.Object {
  var adcode: String
  var city: String
  var humidity: String
  var info: String
  var province: String
  var reportTime: String
  var temperature: Double
  var weather: String
  var windDirection: String
  var windPower: Double
}

object WeatherLiveResult {
  @scala.inline
  def apply(
    adcode: String,
    city: String,
    humidity: String,
    info: String,
    province: String,
    reportTime: String,
    temperature: Double,
    weather: String,
    windDirection: String,
    windPower: Double
  ): WeatherLiveResult = {
    val __obj = js.Dynamic.literal(adcode = adcode, city = city, humidity = humidity, info = info, province = province, reportTime = reportTime, temperature = temperature, weather = weather, windDirection = windDirection, windPower = windPower)
  
    __obj.asInstanceOf[WeatherLiveResult]
  }
}

