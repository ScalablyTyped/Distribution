package typings.amapDashJsDashApiDashRiding.AMapNs.RidingNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultBase
  extends SearchResultCommon
     with SearchResult {
  /**
    * 骑行导航终点
    */
  var end: js.UndefOr[Poi] = js.undefined
  /**
    * 骑行导航起点
    */
  var start: js.UndefOr[Poi] = js.undefined
}

object SearchResultBase {
  @scala.inline
  def apply(
    count: Double,
    destination: LngLat,
    info: String,
    origin: LngLat,
    routes: js.Array[RideRoute],
    end: Poi = null,
    start: Poi = null
  ): SearchResultBase = {
    val __obj = js.Dynamic.literal(count = count, destination = destination, info = info, origin = origin, routes = routes)
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SearchResultBase]
  }
}

