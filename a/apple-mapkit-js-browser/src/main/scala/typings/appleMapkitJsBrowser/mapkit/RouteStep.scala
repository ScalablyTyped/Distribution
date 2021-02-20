package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single route between a requested start and end point.
  */
@js.native
trait RouteStep extends StObject {
  
  /**
    * The step distance in meters.
    */
  var distance: Double = js.native
  
  /**
    * The written instructions for following the path represented by the step.
    */
  var instructions: String = js.native
  
  /**
    * An array of coordinate objects representing the path of the route segment.
    */
  var path: js.Array[Coordinate] = js.native
  
  /**
    * The transport type of the step.
    */
  var transportType: Transport = js.native
}
object RouteStep {
  
  @scala.inline
  def apply(distance: Double, instructions: String, path: js.Array[Coordinate], transportType: Transport): RouteStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteStep]
  }
  
  @scala.inline
  implicit class RouteStepMutableBuilder[Self <: RouteStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Coordinate]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Coordinate*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setTransportType(value: Transport): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
  }
}
