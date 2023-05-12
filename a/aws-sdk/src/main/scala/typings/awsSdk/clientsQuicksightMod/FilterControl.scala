package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterControl extends StObject {
  
  /**
    * A control from a date filter that is used to specify date and time.
    */
  var DateTimePicker: js.UndefOr[FilterDateTimePickerControl] = js.undefined
  
  /**
    * A control to display a dropdown list with buttons that are used to select a single value.
    */
  var Dropdown: js.UndefOr[FilterDropDownControl] = js.undefined
  
  /**
    * A control to display a list of buttons or boxes. This is used to select either a single value or multiple values.
    */
  var List: js.UndefOr[FilterListControl] = js.undefined
  
  /**
    * A control from a date filter that is used to specify the relative date.
    */
  var RelativeDateTime: js.UndefOr[FilterRelativeDateTimeControl] = js.undefined
  
  /**
    * A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
    */
  var Slider: js.UndefOr[FilterSliderControl] = js.undefined
  
  /**
    * A control to display a text box that is used to enter multiple entries.
    */
  var TextArea: js.UndefOr[FilterTextAreaControl] = js.undefined
  
  /**
    * A control to display a text box that is used to enter a single entry.
    */
  var TextField: js.UndefOr[FilterTextFieldControl] = js.undefined
}
object FilterControl {
  
  inline def apply(): FilterControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterControl] (val x: Self) extends AnyVal {
    
    inline def setDateTimePicker(value: FilterDateTimePickerControl): Self = StObject.set(x, "DateTimePicker", value.asInstanceOf[js.Any])
    
    inline def setDateTimePickerUndefined: Self = StObject.set(x, "DateTimePicker", js.undefined)
    
    inline def setDropdown(value: FilterDropDownControl): Self = StObject.set(x, "Dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownUndefined: Self = StObject.set(x, "Dropdown", js.undefined)
    
    inline def setList(value: FilterListControl): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "List", js.undefined)
    
    inline def setRelativeDateTime(value: FilterRelativeDateTimeControl): Self = StObject.set(x, "RelativeDateTime", value.asInstanceOf[js.Any])
    
    inline def setRelativeDateTimeUndefined: Self = StObject.set(x, "RelativeDateTime", js.undefined)
    
    inline def setSlider(value: FilterSliderControl): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
    
    inline def setTextArea(value: FilterTextAreaControl): Self = StObject.set(x, "TextArea", value.asInstanceOf[js.Any])
    
    inline def setTextAreaUndefined: Self = StObject.set(x, "TextArea", js.undefined)
    
    inline def setTextField(value: FilterTextFieldControl): Self = StObject.set(x, "TextField", value.asInstanceOf[js.Any])
    
    inline def setTextFieldUndefined: Self = StObject.set(x, "TextField", js.undefined)
  }
}
