package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/locale-provider.Locale> */
trait PartialLocale extends js.Object {
  var DatePicker: js.UndefOr[AnonDismissText] = js.undefined
  var DatePickerView: js.UndefOr[AnonDay] = js.undefined
  var InputItem: js.UndefOr[AnonBackspaceLabel] = js.undefined
  var ListView: js.UndefOr[AnonDone] = js.undefined
  var Modal: js.UndefOr[AnonButtonText] = js.undefined
  var Pagination: js.UndefOr[AnonNextText] = js.undefined
  var Picker: js.UndefOr[AnonExtra] = js.undefined
  var SearchBar: js.UndefOr[AnonCancelText] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
}

object PartialLocale {
  @scala.inline
  def apply(
    DatePicker: AnonDismissText = null,
    DatePickerView: AnonDay = null,
    InputItem: AnonBackspaceLabel = null,
    ListView: AnonDone = null,
    Modal: AnonButtonText = null,
    Pagination: AnonNextText = null,
    Picker: AnonExtra = null,
    SearchBar: AnonCancelText = null,
    locale: String = null
  ): PartialLocale = {
    val __obj = js.Dynamic.literal()
    if (DatePicker != null) __obj.updateDynamic("DatePicker")(DatePicker.asInstanceOf[js.Any])
    if (DatePickerView != null) __obj.updateDynamic("DatePickerView")(DatePickerView.asInstanceOf[js.Any])
    if (InputItem != null) __obj.updateDynamic("InputItem")(InputItem.asInstanceOf[js.Any])
    if (ListView != null) __obj.updateDynamic("ListView")(ListView.asInstanceOf[js.Any])
    if (Modal != null) __obj.updateDynamic("Modal")(Modal.asInstanceOf[js.Any])
    if (Pagination != null) __obj.updateDynamic("Pagination")(Pagination.asInstanceOf[js.Any])
    if (Picker != null) __obj.updateDynamic("Picker")(Picker.asInstanceOf[js.Any])
    if (SearchBar != null) __obj.updateDynamic("SearchBar")(SearchBar.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLocale]
  }
}

