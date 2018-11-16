package typings
package atAtlaskitCalendarLib.calendarMod

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

