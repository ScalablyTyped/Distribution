package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePicker extends StObject {
  
  var DatePicker: js.UndefOr[DismissText] = js.undefined
  
  var DatePickerView: js.UndefOr[Day] = js.undefined
  
  var InputItem: js.UndefOr[BackspaceLabel] = js.undefined
  
  var ListView: js.UndefOr[Done] = js.undefined
  
  var Modal: js.UndefOr[ButtonText] = js.undefined
  
  var Pagination: js.UndefOr[NextText] = js.undefined
  
  var Picker: js.UndefOr[Extra] = js.undefined
  
  var SearchBar: js.UndefOr[CancelText] = js.undefined
  
  var exist: Boolean
  
  var locale: js.UndefOr[String] = js.undefined
}
object DatePicker {
  
  inline def apply(exist: Boolean): DatePicker = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker]
  }
  
  extension [Self <: DatePicker](x: Self) {
    
    inline def setDatePicker(value: DismissText): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
    
    inline def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
    
    inline def setDatePickerView(value: Day): Self = StObject.set(x, "DatePickerView", value.asInstanceOf[js.Any])
    
    inline def setDatePickerViewUndefined: Self = StObject.set(x, "DatePickerView", js.undefined)
    
    inline def setExist(value: Boolean): Self = StObject.set(x, "exist", value.asInstanceOf[js.Any])
    
    inline def setInputItem(value: BackspaceLabel): Self = StObject.set(x, "InputItem", value.asInstanceOf[js.Any])
    
    inline def setInputItemUndefined: Self = StObject.set(x, "InputItem", js.undefined)
    
    inline def setListView(value: Done): Self = StObject.set(x, "ListView", value.asInstanceOf[js.Any])
    
    inline def setListViewUndefined: Self = StObject.set(x, "ListView", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setModal(value: ButtonText): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
    
    inline def setPagination(value: NextText): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
    
    inline def setPicker(value: Extra): Self = StObject.set(x, "Picker", value.asInstanceOf[js.Any])
    
    inline def setPickerUndefined: Self = StObject.set(x, "Picker", js.undefined)
    
    inline def setSearchBar(value: CancelText): Self = StObject.set(x, "SearchBar", value.asInstanceOf[js.Any])
    
    inline def setSearchBarUndefined: Self = StObject.set(x, "SearchBar", js.undefined)
  }
}
