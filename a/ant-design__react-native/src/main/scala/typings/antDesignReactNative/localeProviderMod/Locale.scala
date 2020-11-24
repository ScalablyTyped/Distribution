package typings.antDesignReactNative.localeProviderMod

import typings.antDesignReactNative.anon.BackspaceLabel
import typings.antDesignReactNative.anon.ButtonText
import typings.antDesignReactNative.anon.CancelText
import typings.antDesignReactNative.anon.Day
import typings.antDesignReactNative.anon.DismissText
import typings.antDesignReactNative.anon.Done
import typings.antDesignReactNative.anon.Extra
import typings.antDesignReactNative.anon.NextText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  var DatePicker: DismissText = js.native
  
  var DatePickerView: Day = js.native
  
  var InputItem: BackspaceLabel = js.native
  
  var ListView: Done = js.native
  
  var Modal: ButtonText = js.native
  
  var Pagination: NextText = js.native
  
  var Picker: Extra = js.native
  
  var SearchBar: CancelText = js.native
  
  /** zh_CN */
  var locale: String = js.native
}
object Locale {
  
  @scala.inline
  def apply(
    DatePicker: DismissText,
    DatePickerView: Day,
    InputItem: BackspaceLabel,
    ListView: Done,
    Modal: ButtonText,
    Pagination: NextText,
    Picker: Extra,
    SearchBar: CancelText,
    locale: String
  ): Locale = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], DatePickerView = DatePickerView.asInstanceOf[js.Any], InputItem = InputItem.asInstanceOf[js.Any], ListView = ListView.asInstanceOf[js.Any], Modal = Modal.asInstanceOf[js.Any], Pagination = Pagination.asInstanceOf[js.Any], Picker = Picker.asInstanceOf[js.Any], SearchBar = SearchBar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    
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
    def setDatePicker(value: DismissText): Self = this.set("DatePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatePickerView(value: Day): Self = this.set("DatePickerView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputItem(value: BackspaceLabel): Self = this.set("InputItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListView(value: Done): Self = this.set("ListView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModal(value: ButtonText): Self = this.set("Modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: NextText): Self = this.set("Pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicker(value: Extra): Self = this.set("Picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBar(value: CancelText): Self = this.set("SearchBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
}
