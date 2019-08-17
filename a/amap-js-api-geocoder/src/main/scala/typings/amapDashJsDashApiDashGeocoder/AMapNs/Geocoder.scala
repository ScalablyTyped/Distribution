package typings.amapDashJsDashApiDashGeocoder.AMapNs

import typings.amapDashJsDashApi.AMapNs.EventEmitter
import typings.amapDashJsDashApi.AMapNs.Lang
import typings.amapDashJsDashApi.AMapNs.LocationValue
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.BatchReGeocodeResult
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.GeocodeResult
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.Options
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.ReGeocodeResult
import typings.amapDashJsDashApiDashGeocoder.AMapNs.GeocoderNs.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Geocoder")
@js.native
/**
  * 地理编码与逆地理编码
  * @param options 选项
  */
class Geocoder () extends EventEmitter {
  def this(options: Options) = this()
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

