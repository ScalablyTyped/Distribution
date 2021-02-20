package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrivingResult extends StObject {
  
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
  implicit class DrivingResultMutableBuilder[Self <: DrivingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: LngLat | Poi): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: js.Array[DriveRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: DriveRoute*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: Poi): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxi_cost(value: Double): Self = StObject.set(x, "taxi_cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoints(value: Poi): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
  }
}
