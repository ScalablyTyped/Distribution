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
  
  @scala.inline
  def apply(): CameraZoomRangeConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraZoomRangeConstructorOptions]
  }
  
  @scala.inline
  implicit class CameraZoomRangeConstructorOptionsMutableBuilder[Self <: CameraZoomRangeConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCameraDistance(value: Double): Self = StObject.set(x, "maxCameraDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCameraDistanceUndefined: Self = StObject.set(x, "maxCameraDistance", js.undefined)
    
    @scala.inline
    def setMinCameraDistance(value: Double): Self = StObject.set(x, "minCameraDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCameraDistanceUndefined: Self = StObject.set(x, "minCameraDistance", js.undefined)
  }
}
