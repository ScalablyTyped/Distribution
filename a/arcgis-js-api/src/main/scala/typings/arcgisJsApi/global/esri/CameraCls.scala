package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.CameraProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Camera")
@js.native
/**
  * The camera defines the [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position), [tilt](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt), and [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) of the point from which the [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) visible extent is observed. It is not associated with device hardware. This class only applies to 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html)
  */
class CameraCls ()
  extends typings.arcgisJsApi.esri.Camera {
  def this(properties: CameraProperties) = this()
}

