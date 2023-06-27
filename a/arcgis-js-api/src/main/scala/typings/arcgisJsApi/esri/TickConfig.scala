package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.percent
import typings.arcgisJsApi.arcgisJsApiStrings.position
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickConfig extends StObject {
  
  /**
  		 * Callback for formatting tick labels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
  		 */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.undefined
  
  /**
  		 * Indicates whether to render labels for the ticks.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
  		 */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The mode or method of positioning ticks along the slider track.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
  		 */
  var mode: count | percent | position
  
  /**
  		 * Callback that fires for each tick.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
  		 */
  var tickCreatedFunction: js.UndefOr[TickCreatedFunction] = js.undefined
  
  /**
  		 * Indicates where ticks will be rendered below the track.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickConfig)
  		 */
  var values: Double | js.Array[Double]
}
object TickConfig {
  
  inline def apply(mode: count | percent | position, values: Double | js.Array[Double]): TickConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TickConfig] (val x: Self) extends AnyVal {
    
    inline def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    inline def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    inline def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    inline def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    inline def setMode(value: count | percent | position): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTickCreatedFunction(
      value: (/* value */ Double, /* tickElement */ HTMLElement, /* labelElement */ js.UndefOr[HTMLElement]) => scala.Unit
    ): Self = StObject.set(x, "tickCreatedFunction", js.Any.fromFunction3(value))
    
    inline def setTickCreatedFunctionUndefined: Self = StObject.set(x, "tickCreatedFunction", js.undefined)
    
    inline def setValues(value: Double | js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
