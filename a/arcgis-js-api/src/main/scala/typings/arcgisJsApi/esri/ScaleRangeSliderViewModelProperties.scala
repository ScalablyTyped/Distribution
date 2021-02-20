package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleRangeSliderViewModelProperties extends StObject {
  
  /**
    * When provided, the initial [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScale) values will match the layer's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  
  /**
    * The maximum scale of the active scale range.
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
    * The minimum scale of the active scale range.
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
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
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
  implicit class ScaleRangeSliderViewModelPropertiesMutableBuilder[Self <: ScaleRangeSliderViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: LayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleLimit(value: Double): Self = StObject.set(x, "maxScaleLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleLimitUndefined: Self = StObject.set(x, "maxScaleLimit", js.undefined)
    
    @scala.inline
    def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleLimit(value: Double): Self = StObject.set(x, "minScaleLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleLimitUndefined: Self = StObject.set(x, "minScaleLimit", js.undefined)
    
    @scala.inline
    def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    @scala.inline
    def setSliderViewModel(value: SliderViewModelProperties): Self = StObject.set(x, "sliderViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliderViewModelUndefined: Self = StObject.set(x, "sliderViewModel", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
