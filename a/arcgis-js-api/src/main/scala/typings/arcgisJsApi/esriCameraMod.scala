package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Camera
import typings.arcgisJsApi.esri.CameraProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriCameraMod {
  
  @JSImport("esri/Camera", JSImport.Namespace)
  @js.native
  /**
    * The camera defines the [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position), [tilt](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt), and [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) of the point from which the [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) visible extent is observed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html)
    */
  open class ^ ()
    extends StObject
       with Camera {
    def this(properties: CameraProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/Camera", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Camera = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Camera]
}
