package typings.amapDashJsDashApiDashGeolocation.AMapNs

import typings.amapDashJsDashApi.AMapNs.EventEmitter
import typings.amapDashJsDashApiDashGeolocation.AMapNs.GeolocationNs.CityResult
import typings.amapDashJsDashApiDashGeolocation.AMapNs.GeolocationNs.ErrorStatus
import typings.amapDashJsDashApiDashGeolocation.AMapNs.GeolocationNs.GeolocationResult
import typings.amapDashJsDashApiDashGeolocation.AMapNs.GeolocationNs.Options
import typings.amapDashJsDashApiDashGeolocation.AMapNs.GeolocationNs.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Geolocation")
@js.native
/**
  * 定位服务
  * @param options 选项
  */
class Geolocation () extends EventEmitter {
  def this(options: Options) = this()
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

