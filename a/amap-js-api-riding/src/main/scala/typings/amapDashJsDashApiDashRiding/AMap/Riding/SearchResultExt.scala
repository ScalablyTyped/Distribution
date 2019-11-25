package typings.amapDashJsDashApiDashRiding.AMap.Riding

import typings.amapDashJsDashApi.AMap.LngLat
import typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch.PoiExt
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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResultExt]
  }
}

