package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forecast extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Forecast](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDayTemp(value: Double): Self = StObject.set(x, "dayTemp", value.asInstanceOf[js.Any])
    
    inline def setDayWeather(value: String): Self = StObject.set(x, "dayWeather", value.asInstanceOf[js.Any])
    
    inline def setDayWindDir(value: String): Self = StObject.set(x, "dayWindDir", value.asInstanceOf[js.Any])
    
    inline def setDayWindPower(value: String): Self = StObject.set(x, "dayWindPower", value.asInstanceOf[js.Any])
    
    inline def setNightTemp(value: Double): Self = StObject.set(x, "nightTemp", value.asInstanceOf[js.Any])
    
    inline def setNightWeather(value: String): Self = StObject.set(x, "nightWeather", value.asInstanceOf[js.Any])
    
    inline def setNightWindDir(value: String): Self = StObject.set(x, "nightWindDir", value.asInstanceOf[js.Any])
    
    inline def setNightWindPower(value: String): Self = StObject.set(x, "nightWindPower", value.asInstanceOf[js.Any])
    
    inline def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
  }
}
