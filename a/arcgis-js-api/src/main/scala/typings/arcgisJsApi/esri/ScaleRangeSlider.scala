package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleRangeSlider extends Widget_ {
  /**
    * When `true`, sets the widget to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#disabled)
    *
    * @default false
    */
  var disabled: Boolean = js.native
  /**
    * When provided, the initial [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScale) values will match the layer's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#layer)
    */
  var layer: Layer = js.native
  /**
    * The maximum scale of the active scale range. When the maxScale reaches the [maxScaleLimit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScaleLimit), the maxScale value becomes 0 and there is no maximum scale set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScale)
    */
  var maxScale: Double = js.native
  /**
    * The lowest possible maximum scale value on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#maxScaleLimit)
    */
  var maxScaleLimit: Double = js.native
  /**
    * The minimum scale of the active scale range. When the minScale reaches the [minScaleLimit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScaleLimit), the minScale value becomes 0 and there is no minimum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScale)
    */
  var minScale: Double = js.native
  /**
    * The highest possible minimum scale value on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#minScaleLimit)
    */
  var minScaleLimit: Double = js.native
  /**
    * The region that the scale thumbnails will focus on. Each region comes from the [ISO 3166-1 alpha-2 code](https://en.wikipedia.org/wiki/List_of_ISO_3166_country_codes). See [SupportedRegion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#SupportedRegion) for the list of regions that are currently supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#region)
    *
    * @default "US"
    */
  var region: SupportedRegion = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [ScaleRangeSliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#viewModel)
    */
  var viewModel: ScaleRangeSliderViewModel = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html#visibleElements)
    */
  var visibleElements: ScaleRangeSliderVisibleElements = js.native
}

