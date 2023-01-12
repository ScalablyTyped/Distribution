package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraProperties extends StObject {
  
  /**
    * The diagonal field of view (fov) angle for the camera.
    *
    * @default 55
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#fov)
    */
  var fov: js.UndefOr[Double] = js.undefined
  
  /**
    * The compass heading of the camera in degrees.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading)
    */
  var heading: js.UndefOr[Double] = js.undefined
  
  /**
    * The position of the camera defined by a map point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position)
    */
  var position: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The tilt of the camera in degrees with respect to the surface as projected down from the camera position.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt)
    */
  var tilt: js.UndefOr[Double] = js.undefined
}
object CameraProperties {
  
  inline def apply(): CameraProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CameraProperties] (val x: Self) extends AnyVal {
    
    inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    inline def setFovUndefined: Self = StObject.set(x, "fov", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setPosition(value: PointProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
  }
}
