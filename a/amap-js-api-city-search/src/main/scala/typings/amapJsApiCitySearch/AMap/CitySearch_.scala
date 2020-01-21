package typings.amapJsApiCitySearch.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApiCitySearch.AMap.CitySearch.SearchResult
import typings.amapJsApiCitySearch.AMap.CitySearch.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 根据IP返回对应城市信息
  */
@JSGlobal("AMap.CitySearch")
@js.native
class CitySearch_ () extends EventEmitter {
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

