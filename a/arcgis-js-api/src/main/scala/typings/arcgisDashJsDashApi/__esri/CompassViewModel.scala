package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.compass
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.rotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompassViewModel
  extends Accessor
     with GoTo {
  /**
    * The orientation axes (x, y, z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html#orientation)
    *
    * @default { x: 0, y: 0, z: 0 }
    */
  var orientation: js.Any = js.native
  /**
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html#state)
    *
    * @default disabled
    */
  val state: compass | rotation | disabled = js.native
  /**
    * The view in which the Compass obtains and indicates camera [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading), using a (SceneView) or rotation (MapView).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * If working in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html), sets the view's [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) is to `0`. If working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), sets the camera's [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) to `0`.  This method is executed each time the [Compass](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html) is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html#reset)
    *
    *
    */
  def reset(): Unit = js.native
}

@JSGlobal("__esri.CompassViewModel")
@js.native
object CompassViewModel extends TopLevel[CompassViewModelConstructor]

