package typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs

import typings.amapDashJsDashApi.AMapNs.Bounds
import typings.amapDashJsDashApi.AMapNs.EventEmitter
import typings.amapDashJsDashApi.AMapNs.Lang
import typings.amapDashJsDashApi.AMapNs.LocationValue
import typings.amapDashJsDashApi.AMapNs.Polygon
import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.Options
import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.SearchResult
import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.SearchStatus
import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.PlaceSearch")
@js.native
/**
  * 地点搜索服务
  * @param options 选项
  */
class PlaceSearch () extends EventEmitter {
  def this(options: Options) = this()
  /**
    * 清除搜索结果
    */
  def clear(): Unit = js.native
  def close(): Unit = js.native
  /**
    * 唤起高德地图客户端POI详情页
    * @param obj 唤起参数
    */
  def detailOnAMAP(obj: Anon_Id): Unit = js.native
  /**
    * 根据POIID 查询POI 详细信息
    * @param POIID POIID
    * @param callback 搜索回调
    */
  def getDetails(
    POIID: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  /**
    * 获取检索语言类型
    */
  def getLang(): js.UndefOr[Lang] = js.native
  // internal
  def open(): Unit = js.native
  /**
    * 唤起高德地图客户端marker页
    * @param obj 唤起参数
    */
  def poiOnAMAP(obj: Anon_Id): Unit = js.native
  /**
    * 根据关键字搜索
    * @param keyword 根据关键字搜索
    * @param callback 回调
    */
  def search(
    keyword: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  /**
    * 根据范围和关键词进行范围查询
    * @param keyword 关键字
    * @param bounds 搜索范围
    * @param callback 回调
    */
  def searchInBounds(
    keyword: String,
    bounds: Bounds,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  def searchInBounds(
    keyword: String,
    bounds: Polygon[_],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  /**
    * 周边查询
    * @param keyword 关键字
    * @param center 搜索中心
    * @param radius 搜索半径
    * @param callback 回调
    */
  def searchNearBy(
    keyword: String,
    center: LocationValue,
    radius: Double,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  /**
    * 设置查询城市
    * @param city 城市
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  /**
    * 设置是否强制限制城市
    * @param limit 是否强制限制城市
    */
  def setCityLimit(): Unit = js.native
  def setCityLimit(limit: Boolean): Unit = js.native
  /**
    * 设置检索语言类型
    * @param lang 语言类型
    */
  def setLang(): Unit = js.native
  def setLang(lang: Lang): Unit = js.native
  /**
    * 设置查询结果特定页数
    * @param pageIndex 页码
    */
  def setPageIndex(): Unit = js.native
  def setPageIndex(pageIndex: Double): Unit = js.native
  /**
    * 设置查询单页结果数
    * @param pageSize 结果数
    */
  def setPageSize(): Unit = js.native
  def setPageSize(pageSize: Double): Unit = js.native
  /**
    * 设置查询类别
    * @param type 查询类别
    */
  def setType(): Unit = js.native
  def setType(`type`: String): Unit = js.native
}

