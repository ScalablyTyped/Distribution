package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HomeViewModel
  extends Accessor
     with Evented
     with GoTo {
  /**
    * The current state of the widget.  **Possible Values:** disabled | ready | going-home
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * The view associated with the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), or point of view, to zoom to when going home. The initial value is determined a few different ways:
    *   * If no [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is provided, the value is `null`.
    *   * If the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is ready, but the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is not defined, the  initial value of the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is determined when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) became ready.
    *   * If the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is ready and the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is defined by the user, the initial viewpoint value is the user-defined [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#viewpoint)
    *
    * @default null
    */
  var viewpoint: Viewpoint = js.native
  /**
    * This function provides the ability to interrupt and cancel the process of navigating the view back to the view's initial extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#cancelGo)
    *
    *
    */
  def cancelGo(): Unit = js.native
  /**
    * Animates the view to the initial [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) of the view or the value of [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#viewpoint).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#go)
    *
    *
    */
  def go(): Unit = js.native
}

@JSGlobal("__esri.HomeViewModel")
@js.native
object HomeViewModel extends TopLevel[HomeViewModelConstructor]

