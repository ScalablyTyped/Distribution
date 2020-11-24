package typings.amapJsApiRiding.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApiRiding.AMap.Riding.SearchPoint
import typings.amapJsApiRiding.AMap.Riding.SearchResultBase
import typings.amapJsApiRiding.AMap.Riding.SearchResultExt
import typings.amapJsApiRiding.AMap.Riding.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Riding_ extends EventEmitter {
  
  /**
    * 清除搜索的结果
    */
  def clear(): Unit = js.native
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
  
  /**
    * 根据起点和终点坐标，实现骑行路径规划
    * @param origin 起点坐标
    * @param destination 终点坐标
    * @param callback 查询回调
    */
  def search(origin: LocationValue, destination: LocationValue): Unit = js.native
  def search(
    origin: LocationValue,
    destination: LocationValue,
    callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResultBase | String, Unit]
  ): Unit = js.native
  /**
    * 根据起点终点名称查询路径规划
    * @param point 名称数组
    * @param callback 查询回调
    */
  def search(point: js.Array[SearchPoint]): Unit = js.native
  def search(
    point: js.Array[SearchPoint],
    callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResultExt | String, Unit]
  ): Unit = js.native
  
  // internal
  def setPolicy(policy: RidingPolicy): Unit = js.native
}
