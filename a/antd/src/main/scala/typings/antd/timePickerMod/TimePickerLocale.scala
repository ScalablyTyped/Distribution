package typings.antd.timePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerLocale extends js.Object {
  var placeholder: js.UndefOr[String] = js.undefined
  var rangePlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
}

object TimePickerLocale {
  @scala.inline
  def apply(placeholder: String = null, rangePlaceholder: js.Tuple2[String, String] = null): TimePickerLocale = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rangePlaceholder != null) __obj.updateDynamic("rangePlaceholder")(rangePlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerLocale]
  }
}

