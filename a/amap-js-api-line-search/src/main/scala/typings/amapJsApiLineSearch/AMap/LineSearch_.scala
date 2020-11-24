package typings.amapJsApiLineSearch.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApiLineSearch.AMap.LineSearch.SearchResult
import typings.amapJsApiLineSearch.AMap.LineSearch.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSearch_ extends EventEmitter {
  
  /**
    * 根据给定公交线路名称进行公交线路详情查询
    * @param keyword 名称
    * @param callback 回调
    */
  def search(
    keyword: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 根据给定的公交线路id进行公交站点详情检索
    * @param id 公交线路的唯一标识
    * @param callback 回调
    */
  def searchById(
    id: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  /**
    * 设置查询城市
    * @param city 城市，默认值：“全国”，可选值：cityname（中文或中文全拼）、citycode、adcode
    */
  def setCity(): Unit = js.native
  def setCity(city: String): Unit = js.native
  
  /**
    * 设置查询结果页码
    * @param pageIndex 页码，默认值：1
    */
  def setPageIndex(): Unit = js.native
  def setPageIndex(pageIndex: Double): Unit = js.native
  
  /**
    * 设置单页显示结果条数
    * @param pageSize 条数，默认值：20
    */
  def setPageSize(): Unit = js.native
  def setPageSize(pageSize: Double): Unit = js.native
}
