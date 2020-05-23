package typings.amapJsApiGeolocation.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApiGeolocation.AMap.Geolocation.CityResult
import typings.amapJsApiGeolocation.AMap.Geolocation.ErrorStatus
import typings.amapJsApiGeolocation.AMap.Geolocation.GeolocationResult
import typings.amapJsApiGeolocation.AMap.Geolocation.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolocation_ extends EventEmitter {
  /**
    * 取消对当前位置的监控
    * @param wathcId 监控id
    */
  def clearWatch(wathcId: String): js.UndefOr[String] = js.native
  /**
    * 进行IP城市查询
    * @param callback 回调
    */
  def getCityInfo(callback: js.Function2[/* status */ SearchStatus, /* result */ CityResult | ErrorStatus, Unit]): Unit = js.native
  /**
    * 获取用户当前的精确位置信息
    * @param callback 回调
    */
  def getCurrentPosition(
    callback: js.Function2[/* status */ SearchStatus, /* result */ GeolocationResult | ErrorStatus, Unit]
  ): Unit = js.native
  /**
    * 是否支持浏览器定位
    */
  def isSupported(): Boolean = js.native
  /**
    * 使用浏览器定位接口监控当前位置，移动端有效
    */
  def watchPosition(): js.UndefOr[String | Null] = js.native
}

