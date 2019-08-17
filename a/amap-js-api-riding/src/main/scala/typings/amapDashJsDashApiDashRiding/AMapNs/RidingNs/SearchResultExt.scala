package typings.amapDashJsDashApiDashRiding.AMapNs.RidingNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultExt
  extends SearchResultCommon
     with SearchResult {
  /**
    * 骑行导航终点名称
    */
  var destinationName: String
  /**
    * 骑行导航终点
    */
  var end: PoiExt
  /**
    * 骑行导航起点名称
    */
  var originName: String
  /**
    * 骑行导航起点
    */
  var start: PoiExt
}

object SearchResultExt {
  @scala.inline
  def apply(
    count: Double,
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    routes: js.Array[RideRoute],
    start: PoiExt
  ): SearchResultExt = {
    val __obj = js.Dynamic.literal(count = count, destination = destination, destinationName = destinationName, end = end, info = info, origin = origin, originName = originName, routes = routes, start = start)
  
    __obj.asInstanceOf[SearchResultExt]
  }
}

