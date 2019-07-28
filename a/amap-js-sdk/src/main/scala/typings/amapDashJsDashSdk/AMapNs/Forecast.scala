package typings.amapDashJsDashSdk.AMapNs

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
    val __obj = js.Dynamic.literal(date = date, dayTemp = dayTemp, dayWeather = dayWeather, dayWindDir = dayWindDir, dayWindPower = dayWindPower, nightTemp = nightTemp, nightWeather = nightWeather, nightWindDir = nightWindDir, nightWindPower = nightWindPower, week = week)
  
    __obj.asInstanceOf[Forecast]
  }
}

