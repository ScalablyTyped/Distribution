package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A minimum and maximum camera distance as meters from the center of the map.
  */
trait CameraZoomRange extends StObject {
  
  /**
    * The maximum allowed distance of the camera from the center of the map in meters.
    */
  var maxCameraDistance: Double
  
  /**
    * The minimum allowed distance of the camera from the center of the map in meters.
    */
  var minCameraDistance: Double
}
object CameraZoomRange {
  
  inline def apply(maxCameraDistance: Double, minCameraDistance: Double): CameraZoomRange = {
    val __obj = js.Dynamic.literal(maxCameraDistance = maxCameraDistance.asInstanceOf[js.Any], minCameraDistance = minCameraDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraZoomRange]
  }
  
  extension [Self <: CameraZoomRange](x: Self) {
    
    inline def setMaxCameraDistance(value: Double): Self = StObject.set(x, "maxCameraDistance", value.asInstanceOf[js.Any])
    
    inline def setMinCameraDistance(value: Double): Self = StObject.set(x, "minCameraDistance", value.asInstanceOf[js.Any])
  }
}
