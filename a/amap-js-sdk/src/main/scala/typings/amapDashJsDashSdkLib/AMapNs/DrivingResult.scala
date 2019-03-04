package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingResult extends js.Object {
  var destination: LngLat | Poi
  var info: java.lang.String
  var origin: LngLat
  var routes: js.Array[DriveRoute]
  var start: Poi
  var taxi_cost: scala.Double
  var waypoints: Poi
}

object DrivingResult {
  @scala.inline
  def apply(
    destination: LngLat | Poi,
    info: java.lang.String,
    origin: LngLat,
    routes: js.Array[DriveRoute],
    start: Poi,
    taxi_cost: scala.Double,
    waypoints: Poi
  ): DrivingResult = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], info = info, origin = origin, routes = routes, start = start, taxi_cost = taxi_cost, waypoints = waypoints)
  
    __obj.asInstanceOf[DrivingResult]
  }
}

