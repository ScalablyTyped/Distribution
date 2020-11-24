package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Forecast extends js.Object {
  
  var date: String = js.native
  
  var dayTemp: Double = js.native
  
  var dayWeather: String = js.native
  
  var dayWindDir: String = js.native
  
  var dayWindPower: String = js.native
  
  var nightTemp: Double = js.native
  
  var nightWeather: String = js.native
  
  var nightWindDir: String = js.native
  
  var nightWindPower: String = js.native
  
  var week: String = js.native
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
  
  @scala.inline
  implicit class ForecastOps[Self <: Forecast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayTemp(value: Double): Self = this.set("dayTemp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayWeather(value: String): Self = this.set("dayWeather", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayWindDir(value: String): Self = this.set("dayWindDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayWindPower(value: String): Self = this.set("dayWindPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNightTemp(value: Double): Self = this.set("nightTemp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNightWeather(value: String): Self = this.set("nightWeather", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNightWindDir(value: String): Self = this.set("nightWindDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNightWindPower(value: String): Self = this.set("nightWindPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek(value: String): Self = this.set("week", value.asInstanceOf[js.Any])
  }
}
