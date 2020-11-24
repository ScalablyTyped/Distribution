package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 天气插件
@js.native
trait WeatherLiveResult extends js.Object {
  
  var adcode: String = js.native
  
  var city: String = js.native
  
  var humidity: String = js.native
  
  var info: String = js.native
  
  var province: String = js.native
  
  var reportTime: String = js.native
  
  var temperature: Double = js.native
  
  var weather: String = js.native
  
  var windDirection: String = js.native
  
  var windPower: Double = js.native
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
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], humidity = humidity.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], reportTime = reportTime.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any], weather = weather.asInstanceOf[js.Any], windDirection = windDirection.asInstanceOf[js.Any], windPower = windPower.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeatherLiveResult]
  }
  
  @scala.inline
  implicit class WeatherLiveResultOps[Self <: WeatherLiveResult] (val x: Self) extends AnyVal {
    
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
    def setAdcode(value: String): Self = this.set("adcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumidity(value: String): Self = this.set("humidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTime(value: String): Self = this.set("reportTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperature(value: Double): Self = this.set("temperature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeather(value: String): Self = this.set("weather", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindDirection(value: String): Self = this.set("windDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindPower(value: Double): Self = this.set("windPower", value.asInstanceOf[js.Any])
  }
}
