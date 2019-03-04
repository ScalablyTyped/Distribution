package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Forecast extends js.Object {
  var date: java.lang.String
  var dayTemp: scala.Double
  var dayWeather: java.lang.String
  var dayWindDir: java.lang.String
  var dayWindPower: java.lang.String
  var nightTemp: scala.Double
  var nightWeather: java.lang.String
  var nightWindDir: java.lang.String
  var nightWindPower: java.lang.String
  var week: java.lang.String
}

object Forecast {
  @scala.inline
  def apply(
    date: java.lang.String,
    dayTemp: scala.Double,
    dayWeather: java.lang.String,
    dayWindDir: java.lang.String,
    dayWindPower: java.lang.String,
    nightTemp: scala.Double,
    nightWeather: java.lang.String,
    nightWindDir: java.lang.String,
    nightWindPower: java.lang.String,
    week: java.lang.String
  ): Forecast = {
    val __obj = js.Dynamic.literal(date = date, dayTemp = dayTemp, dayWeather = dayWeather, dayWindDir = dayWindDir, dayWindPower = dayWindPower, nightTemp = nightTemp, nightWeather = nightWeather, nightWindDir = nightWindDir, nightWindPower = nightWindPower, week = week)
  
    __obj.asInstanceOf[Forecast]
  }
}

