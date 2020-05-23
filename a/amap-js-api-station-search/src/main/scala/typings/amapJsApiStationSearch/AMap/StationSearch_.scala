package typings.amapJsApiStationSearch.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApiStationSearch.AMap.StationSearch.SearchResult
import typings.amapJsApiStationSearch.AMap.StationSearch.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 公交站点查询服务
  */
@js.native
trait StationSearch_ extends EventEmitter {
  /**
    * 根据给定公交站点名称进行公交站点详情查询
    * @param keyword 查询关键词，多个关键字用"|"分割
    * @param callback 查询回调
    */
  def search(
    keyword: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
  ): Unit = js.native
  /**
    * 根据给定的公交站点id进行公交站点详情检索
    * @param id 公交站点的唯一标识
    * @param callback 查询回调
    */
  def searchById(
    id: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
  ): Unit = js.native
  /**
    * 设置查询城市
    * @param city 城市:cityname（中文或中文全拼）、citycode或adcode
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  /**
    * 设置查询结果页码
    * @param pageIndex 页码,取值范围：1-100
    */
  def setPageIndex(): Unit = js.native
  def setPageIndex(pageIndex: Double): Unit = js.native
  /**
    * 设置单页显示结果条数
    * @param pageSize 条数,取值范围：1-100
    */
  def setPageSize(): Unit = js.native
  def setPageSize(pageSize: Double): Unit = js.native
}

