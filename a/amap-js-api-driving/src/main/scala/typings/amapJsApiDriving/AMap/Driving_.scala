package typings.amapJsApiDriving.AMap

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApiDriving.AMap.Driving.SearchOptions
import typings.amapJsApiDriving.AMap.Driving.SearchPoint
import typings.amapJsApiDriving.AMap.Driving.SearchResultBase
import typings.amapJsApiDriving.AMap.Driving.SearchResultExt
import typings.amapJsApiDriving.AMap.Driving.SearchStatus
import typings.amapJsApiDriving.anon.Destination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Driving_ extends EventEmitter {
  
  /**
    * 清除搜索结果
    */
  def clear(): Unit = js.native
  
  /**
    * 清除避让区域
    */
  def clearAvoidPolygons(): Unit = js.native
  
  /**
    * 清除避让道路
    */
  def clearAvoidRoad(): Unit = js.native
  
  def close(): Unit = js.native
  
  /**
    * 获取避让区域
    */
  def getAvoidPolygons(): js.Array[LngLat] = js.native
  
  /**
    * 获取避让道路
    */
  def getAvoidRoad(): js.UndefOr[String] = js.native
  
  // internal
  def open(): Unit = js.native
  
  /**
    * 根据起点、终点坐标查询驾车路线规划
    * @param origin 起点坐标
    * @param destination 终点坐标
    * @param callback 查询回调
    */
  def search(origin: LocationValue, destination: LocationValue): Unit = js.native
  def search(
    origin: LocationValue,
    destination: LocationValue,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultBase, Unit]
  ): Unit = js.native
  def search(
    origin: LocationValue,
    destination: LocationValue,
    opts: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultBase, Unit]
  ): Unit = js.native
  def search(origin: LocationValue, destination: LocationValue, opts: SearchOptions): Unit = js.native
  def search(
    origin: LocationValue,
    destination: LocationValue,
    opts: SearchOptions,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultBase, Unit]
  ): Unit = js.native
  /**
    * 以名称关键字查询驾车路线规划
    * @param points 途经点数组
    * @param callback 查询回调
    */
  def search(points: js.Array[SearchPoint]): Unit = js.native
  def search(
    points: js.Array[SearchPoint],
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | SearchResultExt, Unit]
  ): Unit = js.native
  
  /**
    * 唤起高德地图客户端驾车路径规划
    * @param obj 唤起参数
    */
  def searchOnAMAP(obj: Destination): Unit = js.native
  
  /**
    * 设置避让区域，最大支持三个避让区域，避让道路和避让区域不能同时使用
    * @param path 避让区域
    */
  def setAvoidPolygons(path: js.Array[js.Array[LocationValue]]): Unit = js.native
  
  /**
    * 设置避让道路名称，只支持一条避让道路，避让道路和避让区域不能同时使用
    * @param road 道路名称
    */
  def setAvoidRoad(road: String): Unit = js.native
  
  /**
    * 设置驾车路线规划策略
    * @param policy 路线规划策略
    */
  def setPolicy(): Unit = js.native
  def setPolicy(policy: DrivingPolicy): Unit = js.native
  
  /**
    * 设置车牌的汉字首字符和首字后的号码，
    * 设置后路线规划的结果将考虑该车牌在当前时间的限行路段
    * @param province 省份缩写
    * @param number 车牌号码
    */
  def setProvinceAndNumber(province: String, number: String): Unit = js.native
}
