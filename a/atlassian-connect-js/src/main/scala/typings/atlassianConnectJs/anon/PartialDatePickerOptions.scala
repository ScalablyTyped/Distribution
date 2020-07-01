package typings.atlassianConnectJs.anon

import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<atlassian-connect-js.AP.jira.DatePickerOptions> */
trait PartialDatePickerOptions extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[HTMLElement] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* isoDate */ String, /* date */ Date, Unit]] = js.undefined
  var position: js.UndefOr[Left] = js.undefined
  var showTime: js.UndefOr[Boolean] = js.undefined
}

object PartialDatePickerOptions {
  @scala.inline
  def apply(
    date: String = null,
    element: HTMLElement = null,
    onSelect: (/* isoDate */ String, /* date */ Date) => Unit = null,
    position: Left = null,
    showTime: js.UndefOr[Boolean] = js.undefined
  ): PartialDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDatePickerOptions]
  }
}

