package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiDriving.PoiisWaypointboolean
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
  var waypoints: js.Array[PoiisWaypointboolean]
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
    waypoints: js.Array[PoiisWaypointboolean],
    taxi_cost: Int | Double = null
  ): SearchResultBase = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    if (taxi_cost != null) __obj.updateDynamic("taxi_cost")(taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultBase]
  }
}

