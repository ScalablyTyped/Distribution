package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerView extends StObject {
  
  var DatePicker: js.UndefOr[js.Object] = js.undefined
  
  var DatePickerView: js.UndefOr[js.Object] = js.undefined
  
  var InputItem: js.UndefOr[js.Object] = js.undefined
  
  var Modal: js.UndefOr[js.Object] = js.undefined
  
  var Pagination: js.UndefOr[js.Object] = js.undefined
  
  var exist: Boolean
}
object DatePickerView {
  
  inline def apply(exist: Boolean): DatePickerView = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatePickerView] (val x: Self) extends AnyVal {
    
    inline def setDatePicker(value: js.Object): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
    
    inline def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
    
    inline def setDatePickerView(value: js.Object): Self = StObject.set(x, "DatePickerView", value.asInstanceOf[js.Any])
    
    inline def setDatePickerViewUndefined: Self = StObject.set(x, "DatePickerView", js.undefined)
    
    inline def setExist(value: Boolean): Self = StObject.set(x, "exist", value.asInstanceOf[js.Any])
    
    inline def setInputItem(value: js.Object): Self = StObject.set(x, "InputItem", value.asInstanceOf[js.Any])
    
    inline def setInputItemUndefined: Self = StObject.set(x, "InputItem", js.undefined)
    
    inline def setModal(value: js.Object): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
    
    inline def setPagination(value: js.Object): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
  }
}
