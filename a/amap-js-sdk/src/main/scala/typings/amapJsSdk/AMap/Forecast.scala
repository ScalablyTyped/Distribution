package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Forecast extends js.Object {
  var date: String
  var dayTemp: Double
  var dayWeather: String
  var dayWindDir: String
  var dayWindPower: String
  var nightTemp: Double
  var nightWeather: String
  var nightWindDir: String
  var nightWindPower: String
  var week: String
}

object Forecast {
  @scala.inline
  def apply(
    date: String,
    dayTemp: Double,
    dayWeather: String,
    dayWindDir: String,
    dayWindPower: String,
    nightTemp: Double,
    nightWeather: String,
    nightWindDir: String,
    nightWindPower: String,
    week: String
  ): Forecast = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dayTemp = dayTemp.asInstanceOf[js.Any], dayWeather = dayWeather.asInstanceOf[js.Any], dayWindDir = dayWindDir.asInstanceOf[js.Any], dayWindPower = dayWindPower.asInstanceOf[js.Any], nightTemp = nightTemp.asInstanceOf[js.Any], nightWeather = nightWeather.asInstanceOf[js.Any], nightWindDir = nightWindDir.asInstanceOf[js.Any], nightWindPower = nightWindPower.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Forecast]
  }
}

