package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewpointProperties extends StObject {
  
  /**
    * The viewpoint camera (3D only).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#camera)
    */
  var camera: js.UndefOr[CameraProperties] = js.native
  
  /**
    * The rotation of due north in relation to the top of the view in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#rotation)
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * The scale of the viewpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The target geometry framed by the viewpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#targetGeometry)
    */
  var targetGeometry: js.UndefOr[GeometryProperties] = js.native
}
object ViewpointProperties {
  
  @scala.inline
  def apply(): ViewpointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewpointProperties]
  }
  
  @scala.inline
  implicit class ViewpointPropertiesMutableBuilder[Self <: ViewpointProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCamera(value: CameraProperties): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTargetGeometry(value: GeometryProperties): Self = StObject.set(x, "targetGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGeometryUndefined: Self = StObject.set(x, "targetGeometry", js.undefined)
  }
}
