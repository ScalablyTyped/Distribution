package typings.amapJsApiGeocoder.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Lang
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApiGeocoder.AMap.Geocoder.BatchReGeocodeResult
import typings.amapJsApiGeocoder.AMap.Geocoder.GeocodeResult
import typings.amapJsApiGeocoder.AMap.Geocoder.ReGeocodeResult
import typings.amapJsApiGeocoder.AMap.Geocoder.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geocoder_ extends EventEmitter {
  
  /**
    * 根据给定坐标进行解析
    * @param locations 坐标数组
    * @param callback 回调
    */
  def getAddress(
    locations: js.Array[LocationValue],
    callback: js.Function2[/* status */ SearchStatus, /* result */ BatchReGeocodeResult | String, Unit]
  ): Unit = js.native
  /**
    * 根据给定坐标进行解析
    * @param location 坐标
    * @param callback 回调
    */
  def getAddress(
    location: LocationValue,
    callback: js.Function2[/* status */ SearchStatus, /* result */ ReGeocodeResult | String, Unit]
  ): Unit = js.native
  
  def getLang(): js.UndefOr[Lang] = js.native
  
  /**
    * 根据给定的地址描述进行解析
    * @param address 地址描述
    * @param callback 回调
    */
  def getLocation(
    address: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ GeocodeResult | String, Unit]
  ): Unit = js.native
  def getLocation(
    address: js.Array[String],
    callback: js.Function2[/* status */ SearchStatus, /* result */ GeocodeResult | String, Unit]
  ): Unit = js.native
  
  /**
    * 设置地址描述所在城市
    * @param city 城市
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  
  // internal
  def setLang(): Unit = js.native
  def setLang(lang: Lang): Unit = js.native
}
