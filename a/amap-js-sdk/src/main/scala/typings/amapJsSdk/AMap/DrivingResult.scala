package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrivingResult extends js.Object {
  var destination: LngLat | Poi = js.native
  var info: String = js.native
  var origin: LngLat = js.native
  var routes: js.Array[DriveRoute] = js.native
  var start: Poi = js.native
  var taxi_cost: Double = js.native
  var waypoints: Poi = js.native
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
  @scala.inline
  implicit class DrivingResultOps[Self <: DrivingResult] (val x: Self) extends AnyVal {
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
    def setDestination(value: LngLat | Poi): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: LngLat): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: DriveRoute*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[DriveRoute]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Poi): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaxi_cost(value: Double): Self = this.set("taxi_cost", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaypoints(value: Poi): Self = this.set("waypoints", value.asInstanceOf[js.Any])
  }
  
}

