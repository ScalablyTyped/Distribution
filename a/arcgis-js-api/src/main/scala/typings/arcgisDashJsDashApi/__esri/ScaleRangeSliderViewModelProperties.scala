package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleRangeSliderViewModelProperties extends js.Object {
  /**
    * When provided, the initial [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScale) values will match the layer's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.undefined
  /**
    * The maximum scale of the active scale range. When the maxScale reaches the [maxScaleLimit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScaleLimit), the maxScale value becomes 0 and there is no maximum scale set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScale)
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  /**
    * The lowest possible maximum scale value from the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScaleLimit)
    */
  var maxScaleLimit: js.UndefOr[Double] = js.undefined
  /**
    * The minimum scale of the active scale range. When the minScale reaches the [minScaleLimit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScaleLimit), the minScale value becomes 0 and there is no minimum scale set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScale)
    */
  var minScale: js.UndefOr[Double] = js.undefined
  /**
    * The highest possible minimum scale value from the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScaleLimit)
    */
  var minScaleLimit: js.UndefOr[Double] = js.undefined
  /**
    * The [SliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html) for supporting the scale range slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#sliderViewModel)
    */
  var sliderViewModel: js.UndefOr[SliderViewModelProperties] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object ScaleRangeSliderViewModelProperties {
  @scala.inline
  def apply(
    layer: LayerProperties = null,
    maxScale: Int | Double = null,
    maxScaleLimit: Int | Double = null,
    minScale: Int | Double = null,
    minScaleLimit: Int | Double = null,
    sliderViewModel: SliderViewModelProperties = null,
    view: MapViewProperties | SceneViewProperties = null
  ): ScaleRangeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (maxScaleLimit != null) __obj.updateDynamic("maxScaleLimit")(maxScaleLimit.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (minScaleLimit != null) __obj.updateDynamic("minScaleLimit")(minScaleLimit.asInstanceOf[js.Any])
    if (sliderViewModel != null) __obj.updateDynamic("sliderViewModel")(sliderViewModel)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleRangeSliderViewModelProperties]
  }
}

