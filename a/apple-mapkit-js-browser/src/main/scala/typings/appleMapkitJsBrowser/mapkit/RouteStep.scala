package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single route between a requested start and end point.
  */
trait RouteStep extends StObject {
  
  /**
    * The step distance in meters.
    */
  var distance: Double
  
  /**
    * The written instructions for following the path represented by the step.
    */
  var instructions: String
  
  /**
    * An array of coordinate objects representing the path of the route segment.
    */
  var path: js.Array[Coordinate]
  
  /**
    * The transport type of the step.
    */
  var transportType: Transport
}
object RouteStep {
  
  inline def apply(distance: Double, instructions: String, path: js.Array[Coordinate], transportType: Transport): RouteStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteStep]
  }
  
  extension [Self <: RouteStep](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[Coordinate]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Coordinate*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setTransportType(value: Transport): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
  }
}
