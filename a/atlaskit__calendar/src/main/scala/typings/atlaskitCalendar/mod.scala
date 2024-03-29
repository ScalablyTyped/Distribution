package typings.atlaskitCalendar

import typings.atlaskitCalendar.atlaskitCalendarStrings.down
import typings.atlaskitCalendar.atlaskitCalendarStrings.left
import typings.atlaskitCalendar.atlaskitCalendarStrings.next
import typings.atlaskitCalendar.atlaskitCalendarStrings.prev
import typings.atlaskitCalendar.atlaskitCalendarStrings.right
import typings.atlaskitCalendar.atlaskitCalendarStrings.up
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/calendar", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitCalendar.atlaskitCalendarStrings.left
    - typings.atlaskitCalendar.atlaskitCalendarStrings.up
    - typings.atlaskitCalendar.atlaskitCalendarStrings.right
    - typings.atlaskitCalendar.atlaskitCalendarStrings.down
  */
  trait ArrowKeys extends StObject
  object ArrowKeys {
    
    inline def down: typings.atlaskitCalendar.atlaskitCalendarStrings.down = "down".asInstanceOf[typings.atlaskitCalendar.atlaskitCalendarStrings.down]
    
    inline def left: typings.atlaskitCalendar.atlaskitCalendarStrings.left = "left".asInstanceOf[typings.atlaskitCalendar.atlaskitCalendarStrings.left]
    
    inline def right: typings.atlaskitCalendar.atlaskitCalendarStrings.right = "right".asInstanceOf[typings.atlaskitCalendar.atlaskitCalendarStrings.right]
    
    inline def up: typings.atlaskitCalendar.atlaskitCalendarStrings.up = "up".asInstanceOf[typings.atlaskitCalendar.atlaskitCalendarStrings.up]
  }
  
  type Calendar = Component[Props, js.Object, js.Any]
  
  trait ChangeEvent
    extends StObject
       with DateObj {
    
    var iso: String
    
    var `type`: left | up | right | down | prev | next
  }
  object ChangeEvent {
    
    inline def apply(
      day: Double,
      iso: String,
      month: Double,
      `type`: left | up | right | down | prev | next,
      year: Double
    ): ChangeEvent = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent]
    }
    
    extension [Self <: ChangeEvent](x: Self) {
      
      inline def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
      
      inline def setType(value: left | up | right | down | prev | next): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateObj extends StObject {
    
    var day: Double
    
    var month: Double
    
    var year: Double
  }
  object DateObj {
    
    inline def apply(day: Double, month: Double, year: Double): DateObj = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateObj]
    }
    
    extension [Self <: DateObj](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
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
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setDefaultDay(value: Double): Self = StObject.set(x, "defaultDay", value.asInstanceOf[js.Any])
      
      inline def setDefaultDayUndefined: Self = StObject.set(x, "defaultDay", js.undefined)
      
      inline def setDefaultDisabled(value: js.Array[String]): Self = StObject.set(x, "defaultDisabled", value.asInstanceOf[js.Any])
      
      inline def setDefaultDisabledUndefined: Self = StObject.set(x, "defaultDisabled", js.undefined)
      
      inline def setDefaultDisabledVarargs(value: String*): Self = StObject.set(x, "defaultDisabled", js.Array(value :_*))
      
      inline def setDefaultMonth(value: Double): Self = StObject.set(x, "defaultMonth", value.asInstanceOf[js.Any])
      
      inline def setDefaultMonthUndefined: Self = StObject.set(x, "defaultMonth", js.undefined)
      
      inline def setDefaultPreviouslySelected(value: js.Array[String]): Self = StObject.set(x, "defaultPreviouslySelected", value.asInstanceOf[js.Any])
      
      inline def setDefaultPreviouslySelectedUndefined: Self = StObject.set(x, "defaultPreviouslySelected", js.undefined)
      
      inline def setDefaultPreviouslySelectedVarargs(value: String*): Self = StObject.set(x, "defaultPreviouslySelected", js.Array(value :_*))
      
      inline def setDefaultSelected(value: js.Array[String]): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      inline def setDefaultSelectedVarargs(value: String*): Self = StObject.set(x, "defaultSelected", js.Array(value :_*))
      
      inline def setDefaultYear(value: Double): Self = StObject.set(x, "defaultYear", value.asInstanceOf[js.Any])
      
      inline def setDefaultYearUndefined: Self = StObject.set(x, "defaultYear", js.undefined)
      
      inline def setDisabled(value: js.Array[String]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisabledVarargs(value: String*): Self = StObject.set(x, "disabled", js.Array(value :_*))
      
      inline def setInnerProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      inline def setInnerPropsUndefined: Self = StObject.set(x, "innerProps", js.undefined)
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setOnBlur(value: /* e */ js.UndefOr[FocusEvent[HTMLDivElement]] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ ChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[FocusEvent[HTMLDivElement]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnSelect(value: /* e */ SelectEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPreviouslySelected(value: js.Array[String]): Self = StObject.set(x, "previouslySelected", value.asInstanceOf[js.Any])
      
      inline def setPreviouslySelectedUndefined: Self = StObject.set(x, "previouslySelected", js.undefined)
      
      inline def setPreviouslySelectedVarargs(value: String*): Self = StObject.set(x, "previouslySelected", js.Array(value :_*))
      
      inline def setSelected(value: js.Array[String]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: String*): Self = StObject.set(x, "selected", js.Array(value :_*))
      
      inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait SelectEvent
    extends StObject
       with DateObj {
    
    var iso: String
  }
  object SelectEvent {
    
    inline def apply(day: Double, iso: String, month: Double, year: Double): SelectEvent = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectEvent]
    }
    
    extension [Self <: SelectEvent](x: Self) {
      
      inline def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    }
  }
}
