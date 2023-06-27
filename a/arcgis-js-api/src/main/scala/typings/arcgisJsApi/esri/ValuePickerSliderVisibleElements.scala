package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuePickerSliderVisibleElements extends StObject {
  
  /**
  		 * When set to `true`, the current value is displayed in a permanent tooltip directly over the slider's thumb.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#VisibleElements)
  		 */
  var thumbTooltip: js.UndefOr[Boolean] = js.undefined
}
object ValuePickerSliderVisibleElements {
  
  inline def apply(): ValuePickerSliderVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValuePickerSliderVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerSliderVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setThumbTooltip(value: Boolean): Self = StObject.set(x, "thumbTooltip", value.asInstanceOf[js.Any])
    
    inline def setThumbTooltipUndefined: Self = StObject.set(x, "thumbTooltip", js.undefined)
  }
}
