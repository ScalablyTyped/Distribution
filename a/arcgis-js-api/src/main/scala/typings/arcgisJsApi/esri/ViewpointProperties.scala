package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewpointProperties extends StObject {
  
  /**
  		 * The viewpoint camera (3D only).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#camera)
  		 */
  var camera: js.UndefOr[CameraProperties] = js.undefined
  
  /**
  		 * The rotation of due north in relation to the top of the view in degrees.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#rotation)
  		 */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The scale of the viewpoint.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#scale)
  		 */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The target geometry framed by the viewpoint.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#targetGeometry)
  		 */
  var targetGeometry: js.UndefOr[GeometryProperties] = js.undefined
}
object ViewpointProperties {
  
  inline def apply(): ViewpointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewpointProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewpointProperties] (val x: Self) extends AnyVal {
    
    inline def setCamera(value: CameraProperties): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTargetGeometry(value: GeometryProperties): Self = StObject.set(x, "targetGeometry", value.asInstanceOf[js.Any])
    
    inline def setTargetGeometryUndefined: Self = StObject.set(x, "targetGeometry", js.undefined)
  }
}
