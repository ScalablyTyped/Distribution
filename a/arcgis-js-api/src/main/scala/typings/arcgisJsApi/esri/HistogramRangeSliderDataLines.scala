package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramRangeSliderDataLines extends StObject {
  
  /**
  		 * The label associated with the line.
  		 *
  		 * [Read more...](global.html)
  		 */
  var label: js.UndefOr[String | Double] = js.undefined
  
  /**
  		 * The value on the data axis of the histogram where a line will be rendered.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#dataLines)
  		 */
  var value: Double
}
object HistogramRangeSliderDataLines {
  
  inline def apply(value: Double): HistogramRangeSliderDataLines = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramRangeSliderDataLines]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramRangeSliderDataLines] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
