package typings.amapDashJsDashApiDashCityDashSearch.AMapNs

import typings.amapDashJsDashApi.AMapNs.EventEmitter
import typings.amapDashJsDashApiDashCityDashSearch.AMapNs.CitySearchNs.SearchResult
import typings.amapDashJsDashApiDashCityDashSearch.AMapNs.CitySearchNs.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 根据IP返回对应城市信息
  */
@JSGlobal("AMap.CitySearch")
@js.native
class CitySearch () extends EventEmitter {
  /**
    * 根据输入IP地址返回对应城市信息
    * @param ip IP
    * @param callback 查询回调
    */
  def getCityByIp(
    ip: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
  ): Unit = js.native
  /**
    * 自动获取用户IP，回调返回当前用户所在城市
    * @param callback 查询回调
    */
  def getLocalCity(callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]): Unit = js.native
}

