package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenProperties extends WidgetProperties {
  /**
    * The [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) to present in fullscreen mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen.html#element)
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FullscreenViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen.html#viewModel)
    */
  var viewModel: js.UndefOr[FullscreenViewModelProperties] = js.undefined
}

object FullscreenProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    element: HTMLElement = null,
    id: String = null,
    label: String = null,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: FullscreenViewModelProperties = null
  ): FullscreenProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (element != null) __obj.updateDynamic("element")(element)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[FullscreenProperties]
  }
}

