package typings.atlaskitCalendar.mod

import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /** The number of the day currently focused. Places border around the date. 0 highlights no date. */
  var day: js.UndefOr[Double] = js.native
  
  /** Default for `day`. */
  var defaultDay: js.UndefOr[Double] = js.native
  
  /** Default for `disabled`. */
  var defaultDisabled: js.UndefOr[js.Array[String]] = js.native
  
  /** Default for `month`. */
  var defaultMonth: js.UndefOr[Double] = js.native
  
  /** Default for `previouslySelected`. */
  var defaultPreviouslySelected: js.UndefOr[js.Array[String]] = js.native
  
  /** Default for `selected`. */
  var defaultSelected: js.UndefOr[js.Array[String]] = js.native
  
  /** Default for `year`. */
  var defaultYear: js.UndefOr[Double] = js.native
  
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates provided are greyed out.
    * This does not prevent these dates being selected.
    */
  var disabled: js.UndefOr[js.Array[String]] = js.native
  
  /** Props to apply to the container. */
  var innerProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  /** The number of the month (from 1 to 12) which the calendar should be on. */
  var month: js.UndefOr[Double] = js.native
  
  /** Function which is called when the calendar is no longer focused. */
  var onBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLDivElement]], Unit]] = js.native
  
  /**
    * Called when the calendar is navigated. This can be triggered by the keyboard, or by clicking the navigational buttons.
    * The 'type' property indicates the the direction the calendar was navigated whereas the 'iso' property is a string of the format YYYY-MM-DD.
    */
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent, Unit]] = js.native
  
  /** Called when the calendar receives focus. This could be from a mouse event on the container by tabbing into it. */
  var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLDivElement]], Unit]] = js.native
  
  /**
    * Function called when a day is clicked on. Calls with an object that has
    * a day, month and week property as numbers, representing the date just clicked.
    * It also has an 'iso' property, which is a string of the selected date in the
    * format YYYY-MM-DD.
    */
  var onSelect: js.UndefOr[js.Function1[/* e */ SelectEvent, Unit]] = js.native
  
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
    * provided are given a background color.
    */
  var previouslySelected: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Takes an array of dates as string in the format 'YYYY-MM-DD'. All dates
    * provided are given a background color.
    */
  var selected: js.UndefOr[js.Array[String]] = js.native
  
  /** Value of current day, as a string in the format 'YYYY-MM-DD'. */
  var today: js.UndefOr[String] = js.native
  
  /** Year to display the calendar for. */
  var year: js.UndefOr[Double] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setDefaultDay(value: Double): Self = this.set("defaultDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDay: Self = this.set("defaultDay", js.undefined)
    
    @scala.inline
    def setDefaultDisabledVarargs(value: String*): Self = this.set("defaultDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDefaultDisabled(value: js.Array[String]): Self = this.set("defaultDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDisabled: Self = this.set("defaultDisabled", js.undefined)
    
    @scala.inline
    def setDefaultMonth(value: Double): Self = this.set("defaultMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMonth: Self = this.set("defaultMonth", js.undefined)
    
    @scala.inline
    def setDefaultPreviouslySelectedVarargs(value: String*): Self = this.set("defaultPreviouslySelected", js.Array(value :_*))
    
    @scala.inline
    def setDefaultPreviouslySelected(value: js.Array[String]): Self = this.set("defaultPreviouslySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPreviouslySelected: Self = this.set("defaultPreviouslySelected", js.undefined)
    
    @scala.inline
    def setDefaultSelectedVarargs(value: String*): Self = this.set("defaultSelected", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelected(value: js.Array[String]): Self = this.set("defaultSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSelected: Self = this.set("defaultSelected", js.undefined)
    
    @scala.inline
    def setDefaultYear(value: Double): Self = this.set("defaultYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultYear: Self = this.set("defaultYear", js.undefined)
    
    @scala.inline
    def setDisabledVarargs(value: String*): Self = this.set("disabled", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: js.Array[String]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInnerProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("innerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerProps: Self = this.set("innerProps", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ js.UndefOr[FocusEvent[HTMLDivElement]] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ ChangeEvent => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ js.UndefOr[FocusEvent[HTMLDivElement]] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* e */ SelectEvent => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPreviouslySelectedVarargs(value: String*): Self = this.set("previouslySelected", js.Array(value :_*))
    
    @scala.inline
    def setPreviouslySelected(value: js.Array[String]): Self = this.set("previouslySelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviouslySelected: Self = this.set("previouslySelected", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: String*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[String]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
