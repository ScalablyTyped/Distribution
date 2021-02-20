package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a route, including step-by-step instructions, distance,
  * and estimated travel time.
  */
@js.native
trait Route extends StObject {
  
  /**
    * The route distance in meters.
    */
  var distance: Double = js.native
  
  /**
    * The expected travel time in seconds.
    */
  var expectedTravelTime: Double = js.native
  
  /**
    * The name assigned to the route.
    */
  var name: String = js.native
  
  /**
    * An array of coordinate objects representing the path of the route.
    * @deprecated
    */
  var path: js.Array[Coordinate] = js.native
  
  /**
    * An instance of a polyline overlay that represents the path of a route.
    */
  var polyline: PolylineOverlay = js.native
  
  /**
    * An array of steps that comprise the overall route.
    */
  var steps: js.Array[RouteStep] = js.native
  
  /**
    * The overall route transport type.
    */
  var transportType: Transport = js.native
}
object Route {
  
  @scala.inline
  def apply(
    distance: Double,
    expectedTravelTime: Double,
    name: String,
    path: js.Array[Coordinate],
    polyline: PolylineOverlay,
    steps: js.Array[RouteStep],
    transportType: Transport
  ): Route = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], expectedTravelTime = expectedTravelTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedTravelTime(value: Double): Self = StObject.set(x, "expectedTravelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Coordinate]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Coordinate*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setPolyline(value: PolylineOverlay): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[RouteStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: RouteStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setTransportType(value: Transport): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
  }
}
