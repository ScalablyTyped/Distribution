package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Camera
import typings.arcgisJsApi.esri.CameraConstructor
import typings.arcgisJsApi.esri.CameraProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraMod extends Shortcut {
  
  @JSImport("esri/Camera", JSImport.Namespace)
  @js.native
  val ^ : CameraConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
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
  
  type _To = CameraConstructor
  
  /* This means you don't have to write `^`, but can instead just say `cameraMod.foo` */
  override def _to: CameraConstructor = ^
}
