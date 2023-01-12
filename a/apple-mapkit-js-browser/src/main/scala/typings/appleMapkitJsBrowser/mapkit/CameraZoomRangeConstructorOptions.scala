package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialization options for the camera zoom range.
  */
trait CameraZoomRangeConstructorOptions extends StObject {
  
  /**
    * The maximum allowed distance of the camera from the center of the map in meters.
    */
  var maxCameraDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum allowed distance of the camera from the center of the map in meters.
    */
  var minCameraDistance: js.UndefOr[Double] = js.undefined
}
object CameraZoomRangeConstructorOptions {
  
  inline def apply(): CameraZoomRangeConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraZoomRangeConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraZoomRangeConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxCameraDistance(value: Double): Self = StObject.set(x, "maxCameraDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxCameraDistanceUndefined: Self = StObject.set(x, "maxCameraDistance", js.undefined)
    
    inline def setMinCameraDistance(value: Double): Self = StObject.set(x, "minCameraDistance", value.asInstanceOf[js.Any])
    
    inline def setMinCameraDistanceUndefined: Self = StObject.set(x, "minCameraDistance", js.undefined)
  }
}
