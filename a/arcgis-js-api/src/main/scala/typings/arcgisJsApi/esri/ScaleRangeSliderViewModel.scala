package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleRangeSliderViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * When provided, the initial [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScale) values will match the layer's.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#layer)
  		 */
  var layer: Layer = js.native
  
  /**
  		 * Utility method for converting scale-to-slider values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#mapScaleToSlider)
  		 */
  def mapScaleToSlider(scale: Double): Double = js.native
  
  /**
  		 * Utility method for converting slider-to-scale values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#mapSliderToScale)
  		 */
  def mapSliderToScale(value: Double): Double = js.native
  
  /**
  		 * The maximum scale of the active scale range.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScale)
  		 */
  var maxScale: Double = js.native
  
  /**
  		 * The lowest possible maximum scale value from the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#maxScaleLimit)
  		 */
  var maxScaleLimit: Double = js.native
  
  /**
  		 * The minimum scale of the active scale range.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScale)
  		 */
  var minScale: Double = js.native
  
  /**
  		 * The highest possible minimum scale value from the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#minScaleLimit)
  		 */
  var minScaleLimit: Double = js.native
  
  /**
  		 * The valid scale ranges available based on the slider position.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#scaleRanges)
  		 */
  val scaleRanges: ScaleRanges = js.native
  
  /**
  		 * The [SliderViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html) for supporting the scale range slider widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#sliderViewModel)
  		 */
  var sliderViewModel: SliderViewModel = js.native
  
  /**
  		 * The current state of the widget.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#state)
  		 */
  val state: disabled | ready = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html#view)
  		 */
  var view: MapView | SceneView = js.native
}
