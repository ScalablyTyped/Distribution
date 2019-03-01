package typings
package atAtlaskitCalendarLib.atAtlaskitCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /** The number of the day currently focused. Places border around the date. 0 highlights no date. */
  var day: js.UndefOr[scala.Double] = js.undefined
  /** Default for `day`. */
  var defaultDay: js.UndefOr[scala.Double] = js.undefined
  /** Default for `disabled`. */
  var defaultDisabled: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Default for `month`. */
  var defaultMonth: js.UndefOr[scala.Double] = js.undefined
  /** Default for `previouslySelected`. */
  var defaultPreviouslySelected: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Default for `selected`. */
  var defaultSelected: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Default for `year`. */
  var defaultYear: js.UndefOr[scala.Double] = js.undefined
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates provided are greyed out.
    * This does not prevent these dates being selected.
    */
  var disabled: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Props to apply to the container. */
  var innerProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  /** The number of the month (from 1 to 12) which the calendar should be on. */
  var month: js.UndefOr[scala.Double] = js.undefined
  /** Function which is called when the calendar is no longer focused. */
  var onBlur: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the calendar is navigated. This can be triggered by the keyboard, or by clicking the navigational buttons.
    * The 'type' property indicates the the direction the calendar was navigated whereas the 'iso' property is a string of the format YYYY-MM-DD.
    */
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent, scala.Unit]] = js.undefined
  /** Called when the calendar receives focus. This could be from a mouse event on the container by tabbing into it. */
  var onFocus: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Function called when a day is clicked on. Calls with an object that has
    * a day, month and week property as numbers, representing the date just clicked.
    * It also has an 'iso' property, which is a string of the selected date in the
    * format YYYY-MM-DD.
    */
  var onSelect: js.UndefOr[js.Function1[/* e */ SelectEvent, scala.Unit]] = js.undefined
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
    * provided are given a background color.
    */
  var previouslySelected: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
    * provided are given a background color.
    */
  var selected: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Value of current day, as a string in the format 'YYYY-MM-DD'. */
  var today: js.UndefOr[java.lang.String] = js.undefined
  /** Year to display the calendar for. */
  var year: js.UndefOr[scala.Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    day: scala.Int | scala.Double = null,
    defaultDay: scala.Int | scala.Double = null,
    defaultDisabled: js.Array[java.lang.String] = null,
    defaultMonth: scala.Int | scala.Double = null,
    defaultPreviouslySelected: js.Array[java.lang.String] = null,
    defaultSelected: js.Array[java.lang.String] = null,
    defaultYear: scala.Int | scala.Double = null,
    disabled: js.Array[java.lang.String] = null,
    innerProps: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    month: scala.Int | scala.Double = null,
    onBlur: js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement]], 
      scala.Unit
    ] = null,
    onChange: js.Function1[/* e */ ChangeEvent, scala.Unit] = null,
    onFocus: js.Function1[
      /* e */ js.UndefOr[reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLDivElement]], 
      scala.Unit
    ] = null,
    onSelect: js.Function1[/* e */ SelectEvent, scala.Unit] = null,
    previouslySelected: js.Array[java.lang.String] = null,
    selected: js.Array[java.lang.String] = null,
    today: java.lang.String = null,
    year: scala.Int | scala.Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (defaultDay != null) __obj.updateDynamic("defaultDay")(defaultDay.asInstanceOf[js.Any])
    if (defaultDisabled != null) __obj.updateDynamic("defaultDisabled")(defaultDisabled)
    if (defaultMonth != null) __obj.updateDynamic("defaultMonth")(defaultMonth.asInstanceOf[js.Any])
    if (defaultPreviouslySelected != null) __obj.updateDynamic("defaultPreviouslySelected")(defaultPreviouslySelected)
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected)
    if (defaultYear != null) __obj.updateDynamic("defaultYear")(defaultYear.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (innerProps != null) __obj.updateDynamic("innerProps")(innerProps)
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (previouslySelected != null) __obj.updateDynamic("previouslySelected")(previouslySelected)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (today != null) __obj.updateDynamic("today")(today)
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

