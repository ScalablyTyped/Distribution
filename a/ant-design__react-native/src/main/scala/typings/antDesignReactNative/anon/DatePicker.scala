package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePicker extends js.Object {
  
  var DatePicker: js.UndefOr[DismissText] = js.native
  
  var DatePickerView: js.UndefOr[Day] = js.native
  
  var InputItem: js.UndefOr[BackspaceLabel] = js.native
  
  var ListView: js.UndefOr[Done] = js.native
  
  var Modal: js.UndefOr[ButtonText] = js.native
  
  var Pagination: js.UndefOr[NextText] = js.native
  
  var Picker: js.UndefOr[Extra] = js.native
  
  var SearchBar: js.UndefOr[CancelText] = js.native
  
  var exist: Boolean = js.native
  
  var locale: js.UndefOr[String] = js.native
}
object DatePicker {
  
  @scala.inline
  def apply(exist: Boolean): DatePicker = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker]
  }
  
  @scala.inline
  implicit class DatePickerOps[Self <: DatePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExist(value: Boolean): Self = this.set("exist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatePicker(value: DismissText): Self = this.set("DatePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatePicker: Self = this.set("DatePicker", js.undefined)
    
    @scala.inline
    def setDatePickerView(value: Day): Self = this.set("DatePickerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatePickerView: Self = this.set("DatePickerView", js.undefined)
    
    @scala.inline
    def setInputItem(value: BackspaceLabel): Self = this.set("InputItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputItem: Self = this.set("InputItem", js.undefined)
    
    @scala.inline
    def setListView(value: Done): Self = this.set("ListView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListView: Self = this.set("ListView", js.undefined)
    
    @scala.inline
    def setModal(value: ButtonText): Self = this.set("Modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("Modal", js.undefined)
    
    @scala.inline
    def setPagination(value: NextText): Self = this.set("Pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("Pagination", js.undefined)
    
    @scala.inline
    def setPicker(value: Extra): Self = this.set("Picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicker: Self = this.set("Picker", js.undefined)
    
    @scala.inline
    def setSearchBar(value: CancelText): Self = this.set("SearchBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBar: Self = this.set("SearchBar", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
}
