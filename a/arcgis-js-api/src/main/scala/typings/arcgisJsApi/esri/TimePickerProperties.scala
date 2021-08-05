package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#value)
    */
  var value: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#viewModel)
    */
  var viewModel: js.UndefOr[TimePickerViewModelProperties] = js.undefined
}
object TimePickerProperties {
  
  inline def apply(): TimePickerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProperties]
  }
  
  extension [Self <: TimePickerProperties](x: Self) {
    
    inline def setValue(value: DateProperties): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setViewModel(value: TimePickerViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
