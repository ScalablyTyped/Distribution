package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var direction: js.UndefOr[horizontal | vertical] = js.native
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of Swipe widget. See the image in the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) class description. Currently, all layers are supported except GroupLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers)
    */
  var leadingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.native
  /**
    * The position of the Swipe widget. This determines what percentage of the view will be taken up by the [leadingLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#position)
    *
    * @default 25
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of Swipe widget. See the image in the [Swipe](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html) class description. Currently, all layers are supported except GroupLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#trailingLayers)
    */
  var trailingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}

object SwipeViewModelProperties {
  @scala.inline
  def apply(): SwipeViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeViewModelProperties]
  }
  @scala.inline
  implicit class SwipeViewModelPropertiesOps[Self <: SwipeViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setLeadingLayersVarargs(value: LayerProperties*): Self = this.set("leadingLayers", js.Array(value :_*))
    @scala.inline
    def setLeadingLayers(value: CollectionProperties[LayerProperties]): Self = this.set("leadingLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeadingLayers: Self = this.set("leadingLayers", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTrailingLayersVarargs(value: LayerProperties*): Self = this.set("trailingLayers", js.Array(value :_*))
    @scala.inline
    def setTrailingLayers(value: CollectionProperties[LayerProperties]): Self = this.set("trailingLayers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingLayers: Self = this.set("trailingLayers", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

