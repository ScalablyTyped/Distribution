package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 天气插件
trait WeatherLiveResult extends js.Object {
  var adcode: java.lang.String
  var city: java.lang.String
  var humidity: java.lang.String
  var info: java.lang.String
  var province: java.lang.String
  var reportTime: java.lang.String
  var temperature: scala.Double
  var weather: java.lang.String
  var windDirection: java.lang.String
  var windPower: scala.Double
}

object WeatherLiveResult {
  @scala.inline
  def apply(
    adcode: java.lang.String,
    city: java.lang.String,
    humidity: java.lang.String,
    info: java.lang.String,
    province: java.lang.String,
    reportTime: java.lang.String,
    temperature: scala.Double,
    weather: java.lang.String,
    windDirection: java.lang.String,
    windPower: scala.Double
  ): WeatherLiveResult = {
    val __obj = js.Dynamic.literal(adcode = adcode, city = city, humidity = humidity, info = info, province = province, reportTime = reportTime, temperature = temperature, weather = weather, windDirection = windDirection, windPower = windPower)
  
    __obj.asInstanceOf[WeatherLiveResult]
  }
}

