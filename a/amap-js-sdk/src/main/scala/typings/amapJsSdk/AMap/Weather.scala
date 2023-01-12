package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weather extends StObject {
  
  /**
    * 查询四天预报天气，包括查询当天天气信息
    * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
    * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
    */
  def getForecast(
    district: String,
    callback: js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]
  ): Unit
  
  /**
    * 查询实时天气信息
    * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
    * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
    */
  def getLive(
    district: String,
    callback: js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]
  ): Unit
}
object Weather {
  
  inline def apply(
    getForecast: (String, js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]) => Unit,
    getLive: (String, js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]) => Unit
  ): Weather = {
    val __obj = js.Dynamic.literal(getForecast = js.Any.fromFunction2(getForecast), getLive = js.Any.fromFunction2(getLive))
    __obj.asInstanceOf[Weather]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Weather] (val x: Self) extends AnyVal {
    
    inline def setGetForecast(
      value: (String, js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]) => Unit
    ): Self = StObject.set(x, "getForecast", js.Any.fromFunction2(value))
    
    inline def setGetLive(value: (String, js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]) => Unit): Self = StObject.set(x, "getLive", js.Any.fromFunction2(value))
  }
}
