package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.mapkit.Directions.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single route between a requested start and end point.
  */
@js.native
trait RouteStep extends js.Object {
  
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
  implicit class RouteStepOps[Self <: RouteStep] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructions(value: String): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Coordinate*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[Coordinate]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportType(value: Transport): Self = this.set("transportType", value.asInstanceOf[js.Any])
  }
}
