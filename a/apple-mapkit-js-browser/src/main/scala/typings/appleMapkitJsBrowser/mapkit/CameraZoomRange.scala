package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A minimum and maximum camera distance as meters from the center of the map.
  */
@js.native
trait CameraZoomRange extends StObject {
  
  /**
    * The maximum allowed distance of the camera from the center of the map in meters.
    */
  var maxCameraDistance: Double = js.native
  
  /**
    * The minimum allowed distance of the camera from the center of the map in meters.
    */
  var minCameraDistance: Double = js.native
}
object CameraZoomRange {
  
  @scala.inline
  def apply(maxCameraDistance: Double, minCameraDistance: Double): CameraZoomRange = {
    val __obj = js.Dynamic.literal(maxCameraDistance = maxCameraDistance.asInstanceOf[js.Any], minCameraDistance = minCameraDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraZoomRange]
  }
  
  @scala.inline
  implicit class CameraZoomRangeMutableBuilder[Self <: CameraZoomRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCameraDistance(value: Double): Self = StObject.set(x, "maxCameraDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCameraDistance(value: Double): Self = StObject.set(x, "minCameraDistance", value.asInstanceOf[js.Any])
  }
}
