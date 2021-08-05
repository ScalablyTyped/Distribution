package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 天气插件
trait WeatherLiveResult extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: WeatherLiveResult](x: Self) {
    
    inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setHumidity(value: String): Self = StObject.set(x, "humidity", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    
    inline def setWeather(value: String): Self = StObject.set(x, "weather", value.asInstanceOf[js.Any])
    
    inline def setWindDirection(value: String): Self = StObject.set(x, "windDirection", value.asInstanceOf[js.Any])
    
    inline def setWindPower(value: Double): Self = StObject.set(x, "windPower", value.asInstanceOf[js.Any])
  }
}
