package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterControl extends StObject {
  
  /**
    * A control from a date parameter that specifies date and time.
    */
  var DateTimePicker: js.UndefOr[ParameterDateTimePickerControl] = js.undefined
  
  /**
    * A control to display a dropdown list with buttons that are used to select a single value.
    */
  var Dropdown: js.UndefOr[ParameterDropDownControl] = js.undefined
  
  /**
    * A control to display a list with buttons or boxes that are used to select either a single value or multiple values.
    */
  var List: js.UndefOr[ParameterListControl] = js.undefined
  
  /**
    * A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
    */
  var Slider: js.UndefOr[ParameterSliderControl] = js.undefined
  
  /**
    * A control to display a text box that is used to enter multiple entries.
    */
  var TextArea: js.UndefOr[ParameterTextAreaControl] = js.undefined
  
  /**
    * A control to display a text box that is used to enter a single entry.
    */
  var TextField: js.UndefOr[ParameterTextFieldControl] = js.undefined
}
object ParameterControl {
  
  inline def apply(): ParameterControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterControl] (val x: Self) extends AnyVal {
    
    inline def setDateTimePicker(value: ParameterDateTimePickerControl): Self = StObject.set(x, "DateTimePicker", value.asInstanceOf[js.Any])
    
    inline def setDateTimePickerUndefined: Self = StObject.set(x, "DateTimePicker", js.undefined)
    
    inline def setDropdown(value: ParameterDropDownControl): Self = StObject.set(x, "Dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownUndefined: Self = StObject.set(x, "Dropdown", js.undefined)
    
    inline def setList(value: ParameterListControl): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "List", js.undefined)
    
    inline def setSlider(value: ParameterSliderControl): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
    
    inline def setTextArea(value: ParameterTextAreaControl): Self = StObject.set(x, "TextArea", value.asInstanceOf[js.Any])
    
    inline def setTextAreaUndefined: Self = StObject.set(x, "TextArea", js.undefined)
    
    inline def setTextField(value: ParameterTextFieldControl): Self = StObject.set(x, "TextField", value.asInstanceOf[js.Any])
    
    inline def setTextFieldUndefined: Self = StObject.set(x, "TextField", js.undefined)
  }
}
