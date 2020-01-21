package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingResult extends js.Object {
  var destination: LngLat | Poi
  var info: String
  var origin: LngLat
  var routes: js.Array[DriveRoute]
  var start: Poi
  var taxi_cost: Double
  var waypoints: Poi
}

object DrivingResult {
  @scala.inline
  def apply(
    destination: LngLat | Poi,
    info: String,
    origin: LngLat,
    routes: js.Array[DriveRoute],
    start: Poi,
    taxi_cost: Double,
    waypoints: Poi
  ): DrivingResult = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], taxi_cost = taxi_cost.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrivingResult]
  }
}

