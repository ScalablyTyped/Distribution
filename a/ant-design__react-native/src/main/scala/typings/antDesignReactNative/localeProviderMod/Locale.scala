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
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var DatePicker: DismissText
  var DatePickerView: Day
  var InputItem: BackspaceLabel
  var ListView: Done
  var Modal: ButtonText
  var Pagination: NextText
  var Picker: Extra
  var SearchBar: CancelText
  /** zh_CN */
  var locale: String
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
}

