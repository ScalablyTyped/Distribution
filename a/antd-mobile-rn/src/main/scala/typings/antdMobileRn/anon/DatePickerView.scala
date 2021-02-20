package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerView extends StObject {
  
  var DatePicker: js.UndefOr[js.Object] = js.native
  
  var DatePickerView: js.UndefOr[js.Object] = js.native
  
  var InputItem: js.UndefOr[js.Object] = js.native
  
  var Modal: js.UndefOr[js.Object] = js.native
  
  var Pagination: js.UndefOr[js.Object] = js.native
  
  var exist: Boolean = js.native
}
object DatePickerView {
  
  @scala.inline
  def apply(exist: Boolean): DatePickerView = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerView]
  }
  
  @scala.inline
  implicit class DatePickerViewMutableBuilder[Self <: DatePickerView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatePicker(value: js.Object): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
    
    @scala.inline
    def setDatePickerView(value: js.Object): Self = StObject.set(x, "DatePickerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatePickerViewUndefined: Self = StObject.set(x, "DatePickerView", js.undefined)
    
    @scala.inline
    def setExist(value: Boolean): Self = StObject.set(x, "exist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputItem(value: js.Object): Self = StObject.set(x, "InputItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputItemUndefined: Self = StObject.set(x, "InputItem", js.undefined)
    
    @scala.inline
    def setModal(value: js.Object): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
    
    @scala.inline
    def setPagination(value: js.Object): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
  }
}
