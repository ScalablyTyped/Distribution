package typings.amapDashJsDashApiDashDriving.AMap.Driving

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApiDashDriving.Anon_IsWaypoint
import typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultExt
  extends SearchResultCommon
     with SearchResult {
  /**
    * 驾车规划终点名称
    */
  var destinationName: String
  /**
    * 驾车规划终点
    */
  var end: PoiExt
  /**
    * 驾车规划起点名称
    */
  var originName: String
  /**
    * 驾车规划起点
    */
  var start: PoiExt
  /**
    * 驾车规划途经点
    */
  var waypoints: js.Array[PoiExt with Anon_IsWaypoint]
}

object SearchResultExt {
  @scala.inline
  def apply(
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    routes: js.Array[DriveRoute],
    start: PoiExt,
    waypoints: js.Array[PoiExt with Anon_IsWaypoint],
    taxi_cost: Int | Double = null
  ): SearchResultExt = {
    val __obj = js.Dynamic.literal(destination = destination, destinationName = destinationName, end = end, info = info, origin = origin, originName = originName, routes = routes, start = start, waypoints = waypoints)
    if (taxi_cost != null) __obj.updateDynamic("taxi_cost")(taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultExt]
  }
}

