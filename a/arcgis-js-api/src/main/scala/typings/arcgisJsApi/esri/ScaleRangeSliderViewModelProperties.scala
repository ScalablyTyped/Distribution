package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleRangeSliderViewModelProperties extends js.Object {
  /**
    * When provided, the initial [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScale) values will match the layer's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  /**
    * The maximum scale of the active scale range. When the maxScale reaches the [maxScaleLimit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScaleLimit), the maxScale value becomes 0 and there is no maximum scale set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScale)
    */
  var maxScale: js.UndefOr[Double] = js.native
  /**
    * The lowest possible maximum scale value from the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScaleLimit)
    */
  var maxScaleLimit: js.UndefOr[Double] = js.native
  /**
    * The minimum scale of the active scale range. When the minScale reaches the [minScaleLimit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScaleLimit), the minScale value becomes 0 and there is no minimum scale set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScale)
    */
  var minScale: js.UndefOr[Double] = js.native
  /**
    * The highest possible minimum scale value from the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScaleLimit)
    */
  var minScaleLimit: js.UndefOr[Double] = js.native
  /**
    * The [SliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html) for supporting the scale range slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#sliderViewModel)
    */
  var sliderViewModel: js.UndefOr[SliderViewModelProperties] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object ScaleRangeSliderViewModelProperties {
  @scala.inline
  def apply(): ScaleRangeSliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleRangeSliderViewModelProperties]
  }
  @scala.inline
  implicit class ScaleRangeSliderViewModelPropertiesOps[Self <: ScaleRangeSliderViewModelProperties] (val x: Self) extends AnyVal {
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
    def setLayer(value: LayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxScale: Self = this.set("maxScale", js.undefined)
    @scala.inline
    def setMaxScaleLimit(value: Double): Self = this.set("maxScaleLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxScaleLimit: Self = this.set("maxScaleLimit", js.undefined)
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScale: Self = this.set("minScale", js.undefined)
    @scala.inline
    def setMinScaleLimit(value: Double): Self = this.set("minScaleLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScaleLimit: Self = this.set("minScaleLimit", js.undefined)
    @scala.inline
    def setSliderViewModel(value: SliderViewModelProperties): Self = this.set("sliderViewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderViewModel: Self = this.set("sliderViewModel", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

