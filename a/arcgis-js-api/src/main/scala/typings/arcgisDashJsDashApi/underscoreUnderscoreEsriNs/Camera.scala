package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Camera
  extends Accessor
     with JSONSupport {
  /**
    * The field of view of the camera in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#fov)
    *
    * @default 55
    */
  var fov: Double = js.native
  /**
    * The compass heading of the camera in degrees. Heading is zero when north is the top of the screen. It increases as the view rotates clockwise. The angles are always normalized between 0 and 360 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading)
    *
    * @default 0
    */
  var heading: Double = js.native
  /**
    * The position of the camera defined by a map point.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position)
    */
  var position: Point = js.native
  /**
    * The tilt of the camera in degrees with respect to the surface as projected down from the camera position. Tilt is zero when looking straight down at the surface and 90 degrees when the camera is looking parallel to the surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt)
    *
    * @default 0
    */
  var tilt: Double = js.native
}

@JSGlobal("__esri.Camera")
@js.native
/**
  * The camera defines the [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position), [tilt](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt), and [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) of the point from which the [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) visible extent is observed. It is not associated with device hardware. This class only applies to 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html)
  */
class CameraCls () extends Camera {
  def this(properties: CameraProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

