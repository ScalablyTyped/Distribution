package typings.amapJsApiRiding.AMap.Riding

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiRiding.AMap.Riding.SearchResultBase
  - typings.amapJsApiRiding.AMap.Riding.SearchResultExt
*/
trait SearchResult extends js.Object

object SearchResult {
  @scala.inline
  def SearchResultBase(
    count: Double,
    destination: LngLat,
    info: String,
    origin: LngLat,
    routes: js.Array[RideRoute],
    end: Poi = null,
    start: Poi = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  def SearchResultExt(
    count: Double,
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    routes: js.Array[RideRoute],
    start: PoiExt
  ): SearchResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

