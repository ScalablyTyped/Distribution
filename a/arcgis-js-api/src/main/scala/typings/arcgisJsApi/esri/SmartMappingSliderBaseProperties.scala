package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartMappingSliderBaseProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * The [Histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html) associated with the data represented on the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#histogramConfig)
  		 */
  var histogramConfig: js.UndefOr[HistogramConfig] = js.undefined
  
  /**
  		 * A function used to format user inputs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#inputFormatFunction)
  		 */
  var inputFormatFunction: js.UndefOr[SmartMappingSliderBaseLabelFormatter] = js.undefined
  
  /**
  		 * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#inputFormatFunction).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#inputParseFunction)
  		 */
  var inputParseFunction: js.UndefOr[InputParser] = js.undefined
  
  /**
  		 * A modified version of [Slider.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction), which is a custom function used to format labels on the thumbs, min, max, and average values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelFormatFunction)
  		 */
  var labelFormatFunction: js.UndefOr[SmartMappingSliderBaseLabelFormatter] = js.undefined
  
  /**
  		 * The maximum value or upper bound of the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#max)
  		 */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum value or lower bound of the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#min)
  		 */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Defines how slider thumb values should be rounded.
  		 *
  		 * @default 4
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#precision)
  		 */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
  		 * When `true`, all segments will sync together in updating thumb values when the user drags any segment.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#syncedSegmentsEnabled)
  		 */
  var syncedSegmentsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#visibleElements)
  		 */
  var visibleElements: js.UndefOr[SmartMappingSliderBaseVisibleElements] = js.undefined
  
  /**
  		 * Zooms the slider track to the bounds provided in this property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#zoomOptions)
  		 */
  var zoomOptions: js.UndefOr[SmartMappingSliderBaseZoomOptions] = js.undefined
}
object SmartMappingSliderBaseProperties {
  
  inline def apply(): SmartMappingSliderBaseProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartMappingSliderBaseProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartMappingSliderBaseProperties] (val x: Self) extends AnyVal {
    
    inline def setHistogramConfig(value: HistogramConfig): Self = StObject.set(x, "histogramConfig", value.asInstanceOf[js.Any])
    
    inline def setHistogramConfigUndefined: Self = StObject.set(x, "histogramConfig", js.undefined)
    
    inline def setInputFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "inputFormatFunction", js.Any.fromFunction3(value))
    
    inline def setInputFormatFunctionUndefined: Self = StObject.set(x, "inputFormatFunction", js.undefined)
    
    inline def setInputParseFunction(
      value: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "inputParseFunction", js.Any.fromFunction3(value))
    
    inline def setInputParseFunctionUndefined: Self = StObject.set(x, "inputParseFunction", js.undefined)
    
    inline def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    inline def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setSyncedSegmentsEnabled(value: Boolean): Self = StObject.set(x, "syncedSegmentsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSyncedSegmentsEnabledUndefined: Self = StObject.set(x, "syncedSegmentsEnabled", js.undefined)
    
    inline def setVisibleElements(value: SmartMappingSliderBaseVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
    
    inline def setZoomOptions(value: SmartMappingSliderBaseZoomOptions): Self = StObject.set(x, "zoomOptions", value.asInstanceOf[js.Any])
    
    inline def setZoomOptionsUndefined: Self = StObject.set(x, "zoomOptions", js.undefined)
  }
}
