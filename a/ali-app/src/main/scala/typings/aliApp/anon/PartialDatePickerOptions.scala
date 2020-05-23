package typings.aliApp.anon

import typings.aliApp.aliAppNumbers.`11`
import typings.aliApp.aliAppStrings.HHColonmm
import typings.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typings.aliApp.aliAppStrings.`yyyy-MM-dd`
import typings.aliApp.aliAppStrings.`yyyy-MM`
import typings.aliApp.aliAppStrings.yyyy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.DatePickerOptions> */
trait PartialDatePickerOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var currentDate: js.UndefOr[String] = js.undefined
  var endDate: js.UndefOr[String] = js.undefined
  var fail: js.UndefOr[js.Function1[`11`, Unit]] = js.undefined
  var format: js.UndefOr[`yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ Date, Unit]] = js.undefined
}

object PartialDatePickerOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Unit = null,
    currentDate: String = null,
    endDate: String = null,
    fail: `11` => Unit = null,
    format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy = null,
    startDate: String = null,
    success: /* result */ Date => Unit = null
  ): PartialDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PartialDatePickerOptions]
  }
}

