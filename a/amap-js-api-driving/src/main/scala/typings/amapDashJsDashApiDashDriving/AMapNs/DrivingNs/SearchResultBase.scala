package typings.amapDashJsDashApiDashDriving.AMapNs.DrivingNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApiDashDriving.Anon_IsWaypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultBase
  extends SearchResultCommon
     with SearchResult {
  /**
    * 驾车规划终点
    */
  var end: Poi
  /**
    * 驾车规划起点
    */
  var start: Poi
  /**
    * 驾车规划途经点
    */
  var waypoints: js.Array[Poi with Anon_IsWaypoint]
}

object SearchResultBase {
  @scala.inline
  def apply(
    destination: LngLat,
    end: Poi,
    info: String,
    origin: LngLat,
    routes: js.Array[DriveRoute],
    start: Poi,
    waypoints: js.Array[Poi with Anon_IsWaypoint],
    taxi_cost: Int | Double = null
  ): SearchResultBase = {
    val __obj = js.Dynamic.literal(destination = destination, end = end, info = info, origin = origin, routes = routes, start = start, waypoints = waypoints)
    if (taxi_cost != null) __obj.updateDynamic("taxi_cost")(taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultBase]
  }
}

