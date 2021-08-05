package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePicker extends StObject {
  
  var DatePicker: js.UndefOr[js.Object] = js.undefined
  
  var DatePickerView: js.UndefOr[js.Object] = js.undefined
  
  var InputItem: js.UndefOr[js.Object] = js.undefined
  
  var Pagination: js.UndefOr[js.Object] = js.undefined
}
object DatePicker {
  
  inline def apply(): DatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePicker]
  }
  
  extension [Self <: DatePicker](x: Self) {
    
    inline def setDatePicker(value: js.Object): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
    
    inline def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
    
    inline def setDatePickerView(value: js.Object): Self = StObject.set(x, "DatePickerView", value.asInstanceOf[js.Any])
    
    inline def setDatePickerViewUndefined: Self = StObject.set(x, "DatePickerView", js.undefined)
    
    inline def setInputItem(value: js.Object): Self = StObject.set(x, "InputItem", value.asInstanceOf[js.Any])
    
    inline def setInputItemUndefined: Self = StObject.set(x, "InputItem", js.undefined)
    
    inline def setPagination(value: js.Object): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
  }
}
