package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeatherForecastResult extends StObject {
  
  var adcode: String
  
  var city: String
  
  var forecasts: js.Array[Forecast]
  
  var info: String
  
  var province: String
  
  var reportTime: String
}
object WeatherForecastResult {
  
  inline def apply(
    adcode: String,
    city: String,
    forecasts: js.Array[Forecast],
    info: String,
    province: String,
    reportTime: String
  ): WeatherForecastResult = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], forecasts = forecasts.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], reportTime = reportTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeatherForecastResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeatherForecastResult] (val x: Self) extends AnyVal {
    
    inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setForecasts(value: js.Array[Forecast]): Self = StObject.set(x, "forecasts", value.asInstanceOf[js.Any])
    
    inline def setForecastsVarargs(value: Forecast*): Self = StObject.set(x, "forecasts", js.Array(value*))
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
  }
}
