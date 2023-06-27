package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderViewModelProperties extends StObject {
  
  /**
  		 * When set, the user is restricted from moving slider thumbs to positions higher than this value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#effectiveMax)
  		 */
  var effectiveMax: js.UndefOr[Double] = js.undefined
  
  /**
  		 * When set, the user is restricted from moving slider thumbs to positions less than this value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#effectiveMin)
  		 */
  var effectiveMin: js.UndefOr[Double] = js.undefined
  
  /**
  		 * A function used to format user inputs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction)
  		 */
  var inputFormatFunction: js.UndefOr[SliderLabelFormatter] = js.undefined
  
  /**
  		 * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction)
  		 */
  var inputParseFunction: js.UndefOr[InputParser] = js.undefined
  
  /**
  		 * A function used to format labels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
  		 */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.undefined
  
  /**
  		 * The maximum possible data/thumb value of the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#max)
  		 */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum possible data/thumb value of the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#min)
  		 */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Defines how slider values should be rounded.
  		 *
  		 * @default 4
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision)
  		 */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
  		 * When `false`, the user can freely move any slider thumb to any position along the track.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#thumbsConstrained)
  		 */
  var thumbsConstrained: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * An array of numbers representing absolute thumb positions on the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values)
  		 */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object SliderViewModelProperties {
  
  inline def apply(): SliderViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setEffectiveMax(value: Double): Self = StObject.set(x, "effectiveMax", value.asInstanceOf[js.Any])
    
    inline def setEffectiveMaxUndefined: Self = StObject.set(x, "effectiveMax", js.undefined)
    
    inline def setEffectiveMin(value: Double): Self = StObject.set(x, "effectiveMin", value.asInstanceOf[js.Any])
    
    inline def setEffectiveMinUndefined: Self = StObject.set(x, "effectiveMin", js.undefined)
    
    inline def setInputFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "inputFormatFunction", js.Any.fromFunction3(value))
    
    inline def setInputFormatFunctionUndefined: Self = StObject.set(x, "inputFormatFunction", js.undefined)
    
    inline def setInputParseFunction(
      value: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "inputParseFunction", js.Any.fromFunction3(value))
    
    inline def setInputParseFunctionUndefined: Self = StObject.set(x, "inputParseFunction", js.undefined)
    
    inline def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    inline def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setThumbsConstrained(value: Boolean): Self = StObject.set(x, "thumbsConstrained", value.asInstanceOf[js.Any])
    
    inline def setThumbsConstrainedUndefined: Self = StObject.set(x, "thumbsConstrained", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
