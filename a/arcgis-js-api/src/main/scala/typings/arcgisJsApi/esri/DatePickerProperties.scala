package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerProperties extends WidgetProperties {
  
  /**
    * Indicates whether the date gets updated when the user changes the month in the drop-down.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#commitOnMonthChange)
    */
  var commitOnMonthChange: js.UndefOr[Boolean] = js.native
  
  /**
    * The input value for the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#value)
    */
  var value: js.UndefOr[DateProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DatePicker.html#viewModel)
    */
  var viewModel: js.UndefOr[DatePickerViewModelProperties] = js.native
}
object DatePickerProperties {
  
  @scala.inline
  def apply(): DatePickerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProperties]
  }
  
  @scala.inline
  implicit class DatePickerPropertiesMutableBuilder[Self <: DatePickerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitOnMonthChange(value: Boolean): Self = StObject.set(x, "commitOnMonthChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitOnMonthChangeUndefined: Self = StObject.set(x, "commitOnMonthChange", js.undefined)
    
    @scala.inline
    def setValue(value: DateProperties): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setViewModel(value: DatePickerViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
