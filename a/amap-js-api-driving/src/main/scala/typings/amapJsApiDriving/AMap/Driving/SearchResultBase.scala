package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiDriving.anon.PoiisWaypointboolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResultBase
  extends SearchResultCommon
     with SearchResult {
  /**
    * 驾车规划终点
    */
  var end: Poi = js.native
  /**
    * 驾车规划起点
    */
  var start: Poi = js.native
  /**
    * 驾车规划途经点
    */
  var waypoints: js.Array[PoiisWaypointboolean] = js.native
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
    waypoints: js.Array[PoiisWaypointboolean]
  ): SearchResultBase = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultBase]
  }
  @scala.inline
  implicit class SearchResultBaseOps[Self <: SearchResultBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Poi): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Poi): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaypointsVarargs(value: PoiisWaypointboolean*): Self = this.set("waypoints", js.Array(value :_*))
    @scala.inline
    def setWaypoints(value: js.Array[PoiisWaypointboolean]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
  }
  
}

