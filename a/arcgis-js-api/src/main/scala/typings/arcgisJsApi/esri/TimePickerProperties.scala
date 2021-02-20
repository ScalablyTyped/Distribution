package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerProperties extends WidgetProperties {
  
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#value)
    */
  var value: js.UndefOr[DateProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html#viewModel)
    */
  var viewModel: js.UndefOr[TimePickerViewModelProperties] = js.native
}
object TimePickerProperties {
  
  @scala.inline
  def apply(): TimePickerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProperties]
  }
  
  @scala.inline
  implicit class TimePickerPropertiesMutableBuilder[Self <: TimePickerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: DateProperties): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setViewModel(value: TimePickerViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
