package typings.amapJsApiRiding.AMap.Riding

import typings.amapJsApi.AMap.LngLat
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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultBase]
  }
}

