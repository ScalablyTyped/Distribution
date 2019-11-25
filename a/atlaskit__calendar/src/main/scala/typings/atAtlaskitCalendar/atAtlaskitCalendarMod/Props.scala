package typings.atAtlaskitCalendar.atAtlaskitCalendarMod

import typings.react.reactMod.FocusEvent
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /** The number of the day currently focused. Places border around the date. 0 highlights no date. */
  var day: js.UndefOr[Double] = js.undefined
  /** Default for `day`. */
  var defaultDay: js.UndefOr[Double] = js.undefined
  /** Default for `disabled`. */
  var defaultDisabled: js.UndefOr[js.Array[String]] = js.undefined
  /** Default for `month`. */
  var defaultMonth: js.UndefOr[Double] = js.undefined
  /** Default for `previouslySelected`. */
  var defaultPreviouslySelected: js.UndefOr[js.Array[String]] = js.undefined
  /** Default for `selected`. */
  var defaultSelected: js.UndefOr[js.Array[String]] = js.undefined
  /** Default for `year`. */
  var defaultYear: js.UndefOr[Double] = js.undefined
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates provided are greyed out.
    * This does not prevent these dates being selected.
    */
  var disabled: js.UndefOr[js.Array[String]] = js.undefined
  /** Props to apply to the container. */
  var innerProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  /** The number of the month (from 1 to 12) which the calendar should be on. */
  var month: js.UndefOr[Double] = js.undefined
  /** Function which is called when the calendar is no longer focused. */
  var onBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLDivElement]], Unit]] = js.undefined
  /**
    * Called when the calendar is navigated. This can be triggered by the keyboard, or by clicking the navigational buttons.
    * The 'type' property indicates the the direction the calendar was navigated whereas the 'iso' property is a string of the format YYYY-MM-DD.
    */
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent, Unit]] = js.undefined
  /** Called when the calendar receives focus. This could be from a mouse event on the container by tabbing into it. */
  var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLDivElement]], Unit]] = js.undefined
  /**
    * Function called when a day is clicked on. Calls with an object that has
    * a day, month and week property as numbers, representing the date just clicked.
    * It also has an 'iso' property, which is a string of the selected date in the
    * format YYYY-MM-DD.
    */
  var onSelect: js.UndefOr[js.Function1[/* e */ SelectEvent, Unit]] = js.undefined
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
    * provided are given a background color.
    */
  var previouslySelected: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
    * provided are given a background color.
    */
  var selected: js.UndefOr[js.Array[String]] = js.undefined
  /** Value of current day, as a string in the format 'YYYY-MM-DD'. */
  var today: js.UndefOr[String] = js.undefined
  /** Year to display the calendar for. */
  var year: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    day: Int | Double = null,
    defaultDay: Int | Double = null,
    defaultDisabled: js.Array[String] = null,
    defaultMonth: Int | Double = null,
    defaultPreviouslySelected: js.Array[String] = null,
    defaultSelected: js.Array[String] = null,
    defaultYear: Int | Double = null,
    disabled: js.Array[String] = null,
    innerProps: HTMLAttributes[HTMLDivElement] = null,
    month: Int | Double = null,
    onBlur: /* e */ js.UndefOr[FocusEvent[HTMLDivElement]] => Unit = null,
    onChange: /* e */ ChangeEvent => Unit = null,
    onFocus: /* e */ js.UndefOr[FocusEvent[HTMLDivElement]] => Unit = null,
    onSelect: /* e */ SelectEvent => Unit = null,
    previouslySelected: js.Array[String] = null,
    selected: js.Array[String] = null,
    today: String = null,
    year: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (defaultDay != null) __obj.updateDynamic("defaultDay")(defaultDay.asInstanceOf[js.Any])
    if (defaultDisabled != null) __obj.updateDynamic("defaultDisabled")(defaultDisabled.asInstanceOf[js.Any])
    if (defaultMonth != null) __obj.updateDynamic("defaultMonth")(defaultMonth.asInstanceOf[js.Any])
    if (defaultPreviouslySelected != null) __obj.updateDynamic("defaultPreviouslySelected")(defaultPreviouslySelected.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (defaultYear != null) __obj.updateDynamic("defaultYear")(defaultYear.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (innerProps != null) __obj.updateDynamic("innerProps")(innerProps.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (previouslySelected != null) __obj.updateDynamic("previouslySelected")(previouslySelected.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

