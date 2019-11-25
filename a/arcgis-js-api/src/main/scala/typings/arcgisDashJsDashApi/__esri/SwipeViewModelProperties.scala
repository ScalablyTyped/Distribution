package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.horizontal
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeViewModelProperties extends js.Object {
  /**
    * The direction the Swipe widget moves across the view. If `"horizontal"`, the widget will move left and right and if `"vertical"`, the widget will move up and down.
    *
    * | horizontal | vertical |
    * |------------|----------|
    * |[![widgets-swipe-horizontal](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/widgets-swipe-horizontal.png)](https://developers.arcgis.com/javascript/latest/sample-code/widgets-swipe/index.html) |[![widgets-swipe-vertical](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/widgets-swipe-vertical.png)](https://developers.arcgis.com/javascript/latest/sample-code/widgets-swipe/index.html)|
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#direction)
    *
    * @default "horizontal"
    */
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of Swipe widget. See the image in the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) class description. Currently, all layers are supported except VectorTileLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers)
    */
  var leadingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  /**
    * The position of the Swipe widget. This determines what percentage of the view will be taken up by the [leadingLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#position)
    *
    * @default 25
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of Swipe widget. See the image in the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) class description. Currently, all layers are supported except VectorTileLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#trailingLayers)
    */
  var trailingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object SwipeViewModelProperties {
  @scala.inline
  def apply(
    direction: horizontal | vertical = null,
    leadingLayers: CollectionProperties[LayerProperties] = null,
    position: Int | Double = null,
    trailingLayers: CollectionProperties[LayerProperties] = null,
    view: MapViewProperties = null
  ): SwipeViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (leadingLayers != null) __obj.updateDynamic("leadingLayers")(leadingLayers.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (trailingLayers != null) __obj.updateDynamic("trailingLayers")(trailingLayers.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeViewModelProperties]
  }
}

