package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePicker extends js.Object {
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
  @scala.inline
  def apply(
    exist: Boolean,
    DatePicker: DismissText = null,
    DatePickerView: Day = null,
    InputItem: BackspaceLabel = null,
    ListView: Done = null,
    Modal: ButtonText = null,
    Pagination: NextText = null,
    Picker: Extra = null,
    SearchBar: CancelText = null,
    locale: String = null
  ): DatePicker = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker.asInstanceOf[js.Any])
    if (DatePickerView != null) __obj.updateDynamic("DatePickerView")(DatePickerView.asInstanceOf[js.Any])
    if (InputItem != null) __obj.updateDynamic("InputItem")(InputItem.asInstanceOf[js.Any])
    if (ListView != null) __obj.updateDynamic("ListView")(ListView.asInstanceOf[js.Any])
    if (Modal != null) __obj.updateDynamic("Modal")(Modal.asInstanceOf[js.Any])
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination.asInstanceOf[js.Any])
    if (Picker != null) __obj.updateDynamic("Picker")(Picker.asInstanceOf[js.Any])
    if (SearchBar != null) __obj.updateDynamic("SearchBar")(SearchBar.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker]
  }
}

