package typings.arcgisJsApi.cameraMod

import typings.arcgisJsApi.esri.Camera
import typings.arcgisJsApi.esri.CameraProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/Camera", JSImport.Namespace)
@js.native
/**
  * The camera defines the [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position), [tilt](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt), and [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) of the point from which the [SceneView's](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) visible extent is observed.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html)
  */
class Class () extends Camera {
  def this(properties: CameraProperties) = this()
}
