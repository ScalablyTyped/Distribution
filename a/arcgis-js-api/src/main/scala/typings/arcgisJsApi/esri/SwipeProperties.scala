package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeProperties extends WidgetProperties {
  /**
    * The direction the Swipe widget moves across the view. If `"horizontal"`, the widget will move left and right and if `"vertical"`, the widget will move up and down.
    *
    * | horizontal | vertical |
    * |------------|----------|
    * |[![widgets-swipe-horizontal](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/widgets-swipe-horizontal.png)](https://developers.arcgis.com/javascript/latest/sample-code/widgets-swipe/index.html) |[![widgets-swipe-vertical](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/widgets-swipe-vertical.png)](https://developers.arcgis.com/javascript/latest/sample-code/widgets-swipe/index.html)|
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#direction)
    *
    * @default "horizontal"
    */
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * When `true`, sets the widget to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#disabled)
    *
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The text that shows in a tooltip when hovering over the handle of the Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#dragLabel)
    */
  var dragLabel: js.UndefOr[String] = js.undefined
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of the Swipe widget. See the image in the [class description](#) at the top of the page. Currently, all layers are supported except GroupLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#leadingLayers)
    */
  var leadingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  /**
    * The position of the Swipe widget. This determines what percentage of the view will be taken up by the [leadingLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#leadingLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#position)
    *
    * @default 25
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of the Swipe widget. See the image in the [class description](#) at the top of the page. Currently, all layers are supported except GroupLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#trailingLayers)
    */
  var trailingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SwipeViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#viewModel)
    */
  var viewModel: js.UndefOr[SwipeViewModelProperties] = js.undefined
  /**
    * The visible elements that are displayed within the widget. This property provides the ability change the visibility of individual elements of the widget's display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html#visibleElements)
    */
  var visibleElements: js.UndefOr[SwipeVisibleElements] = js.undefined
}

object SwipeProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    direction: horizontal | vertical = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dragLabel: String = null,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    leadingLayers: CollectionProperties[LayerProperties] = null,
    position: Int | Double = null,
    trailingLayers: CollectionProperties[LayerProperties] = null,
    view: MapViewProperties = null,
    viewModel: SwipeViewModelProperties = null,
    visibleElements: SwipeVisibleElements = null
  ): SwipeProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dragLabel != null) __obj.updateDynamic("dragLabel")(dragLabel.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leadingLayers != null) __obj.updateDynamic("leadingLayers")(leadingLayers.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (trailingLayers != null) __obj.updateDynamic("trailingLayers")(trailingLayers.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (visibleElements != null) __obj.updateDynamic("visibleElements")(visibleElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeProperties]
  }
}

