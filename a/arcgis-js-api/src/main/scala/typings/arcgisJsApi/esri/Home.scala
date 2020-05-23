package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.go
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Home
  extends Widget_
     with GoTo {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [HomeViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewModel)
    */
  var viewModel: HomeViewModel = js.native
  /**
    * The [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), or point of view, to zoom to when going home. The initial value is determined a few different ways:
    *   * If no [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is provided, the value is `null`.
    *   * If the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is ready, but the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is not defined, the  initial value of the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is determined when the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) became ready.
    *   * If the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) is ready and the [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) is defined by the user, the initial viewpoint value is the user-defined [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
  /**
    * This function provides the ability to interrupt and cancel the process of navigating the view back to the view's initial extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#cancelGo)
    *
    *
    */
  def cancelGo(): Unit = js.native
  /**
    * Animates the view to the initial Viewpoint of the view or the value of [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#viewpoint).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html#go)
    *
    *
    */
  def go(): Unit = js.native
  @JSName("on")
  def on_go(name: go, eventHandler: HomeGoEventHandler): IHandle = js.native
}

