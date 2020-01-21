package typings.amapJsApiRiding.AMap.Riding

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultCommon extends js.Object {
  /**
    * 骑行导航路段数目
    */
  var count: Double
  /**
    * 骑行导航终点坐标
    */
  var destination: LngLat
  /**
    * 成功状态说明
    */
  var info: String
  /**
    * 骑行导航起点坐标
    */
  var origin: LngLat
  /**
    * 骑行规划路线列表
    */
  var routes: js.Array[RideRoute]
}

object SearchResultCommon {
  @scala.inline
  def apply(count: Double, destination: LngLat, info: String, origin: LngLat, routes: js.Array[RideRoute]): SearchResultCommon = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResultCommon]
  }
}

