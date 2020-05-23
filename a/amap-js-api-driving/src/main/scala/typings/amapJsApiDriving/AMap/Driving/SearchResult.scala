package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiDriving.anon.IsWaypoint
import typings.amapJsApiDriving.anon.PoiisWaypointboolean
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiDriving.AMap.Driving.SearchResultBase
  - typings.amapJsApiDriving.AMap.Driving.SearchResultExt
*/
trait SearchResult extends js.Object

object SearchResult {
  @scala.inline
  def SearchResultBase(
    destination: LngLat,
    end: Poi,
    info: String,
    origin: LngLat,
    routes: js.Array[DriveRoute],
    start: Poi,
    waypoints: js.Array[PoiisWaypointboolean],
    taxi_cost: js.UndefOr[Double] = js.undefined
  ): SearchResult = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    if (!js.isUndefined(taxi_cost)) __obj.updateDynamic("taxi_cost")(taxi_cost.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  def SearchResultExt(
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    routes: js.Array[DriveRoute],
    start: PoiExt,
    waypoints: js.Array[PoiExt with IsWaypoint],
    taxi_cost: js.UndefOr[Double] = js.undefined
  ): SearchResult = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    if (!js.isUndefined(taxi_cost)) __obj.updateDynamic("taxi_cost")(taxi_cost.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

