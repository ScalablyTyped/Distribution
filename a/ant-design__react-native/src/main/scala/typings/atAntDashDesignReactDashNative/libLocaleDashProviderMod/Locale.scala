package typings.atAntDashDesignReactDashNative.libLocaleDashProviderMod

import typings.atAntDashDesignReactDashNative.Anon_AmDay
import typings.atAntDashDesignReactDashNative.Anon_BackspaceLabel
import typings.atAntDashDesignReactDashNative.Anon_ButtonText
import typings.atAntDashDesignReactDashNative.Anon_CancelText
import typings.atAntDashDesignReactDashNative.Anon_DatePickerLocaleDismissText
import typings.atAntDashDesignReactDashNative.Anon_DismissText
import typings.atAntDashDesignReactDashNative.Anon_Done
import typings.atAntDashDesignReactDashNative.Anon_NextText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var DatePicker: Anon_DatePickerLocaleDismissText
  var DatePickerView: Anon_AmDay
  var InputItem: Anon_BackspaceLabel
  var ListView: Anon_Done
  var Modal: Anon_ButtonText
  var Pagination: Anon_NextText
  var Picker: Anon_DismissText
  var SearchBar: Anon_CancelText
  /** zh_CN */
  var locale: String
}

object Locale {
  @scala.inline
  def apply(
    DatePicker: Anon_DatePickerLocaleDismissText,
    DatePickerView: Anon_AmDay,
    InputItem: Anon_BackspaceLabel,
    ListView: Anon_Done,
    Modal: Anon_ButtonText,
    Pagination: Anon_NextText,
    Picker: Anon_DismissText,
    SearchBar: Anon_CancelText,
    locale: String
  ): Locale = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker, DatePickerView = DatePickerView, InputItem = InputItem, ListView = ListView, Modal = Modal, Pagination = Pagination, Picker = Picker, SearchBar = SearchBar, locale = locale)
  
    __obj.asInstanceOf[Locale]
  }
}

