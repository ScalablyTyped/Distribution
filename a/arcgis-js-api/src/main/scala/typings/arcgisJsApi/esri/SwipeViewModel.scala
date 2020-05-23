package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeViewModel extends Accessor {
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
  var direction: horizontal | vertical = js.native
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of Swipe widget. See the image in the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) class description. Currently, all layers are supported except GroupLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers)
    */
  var leadingLayers: Collection[Layer] = js.native
  /**
    * The position of the Swipe widget. This determines what percentage of the view will be taken up by the [leadingLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#position)
    *
    * @default 25
    */
  var position: Double = js.native
  /**
    * The current state of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready = js.native
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of Swipe widget. See the image in the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) class description. Currently, all layers are supported except GroupLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#trailingLayers)
    */
  var trailingLayers: Collection[Layer] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#view)
    */
  var view: MapView = js.native
}

