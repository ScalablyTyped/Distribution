package typings.angularBootstrapCalendar

import typings.angularBootstrapCalendar.anon.Angular
import typings.angularBootstrapCalendar.anon.CalendarDayView
import typings.angularBootstrapCalendar.anon.WeekNumber
import typings.moment.momentMod.Moment
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object bootstrap {
    
    object calendar {
      
      @js.native
      trait ICalendarCell extends StObject {
        
        var badgeTotal: Double = js.native
        
        var date: Moment = js.native
        
        var events: js.Array[IEvent] = js.native
        
        var inMonth: Boolean = js.native
        
        var isFuture: Boolean = js.native
        
        var isPast: Boolean = js.native
        
        var isToday: Boolean = js.native
        
        var isWeekend: Boolean = js.native
        
        var label: Double = js.native
      }
      object ICalendarCell {
        
        @scala.inline
        def apply(
          badgeTotal: Double,
          date: Moment,
          events: js.Array[IEvent],
          inMonth: Boolean,
          isFuture: Boolean,
          isPast: Boolean,
          isToday: Boolean,
          isWeekend: Boolean,
          label: Double
        ): ICalendarCell = {
          val __obj = js.Dynamic.literal(badgeTotal = badgeTotal.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], inMonth = inMonth.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], isWeekend = isWeekend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[ICalendarCell]
        }
        
        @scala.inline
        implicit class ICalendarCellMutableBuilder[Self <: ICalendarCell] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBadgeTotal(value: Double): Self = StObject.set(x, "badgeTotal", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEvents(value: js.Array[IEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEventsVarargs(value: IEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
          
          @scala.inline
          def setInMonth(value: Boolean): Self = StObject.set(x, "inMonth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsWeekend(value: Boolean): Self = StObject.set(x, "isWeekend", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ICalendarConfig extends StObject {
        
        var allDateFormats: Angular = js.native
        
        var dateFormats: IDateFormats = js.native
        
        var dateFormatter: String = js.native
        
        var displayAllMonthEvents: Boolean = js.native
        
        var displayEventEndTimes: Boolean = js.native
        
        var i18nStrings: WeekNumber = js.native
        
        var showTimesOnWeekView: Boolean = js.native
        
        var templates: CalendarDayView = js.native
        
        var titleFormats: ITitleFormats = js.native
      }
      object ICalendarConfig {
        
        @scala.inline
        def apply(
          allDateFormats: Angular,
          dateFormats: IDateFormats,
          dateFormatter: String,
          displayAllMonthEvents: Boolean,
          displayEventEndTimes: Boolean,
          i18nStrings: WeekNumber,
          showTimesOnWeekView: Boolean,
          templates: CalendarDayView,
          titleFormats: ITitleFormats
        ): ICalendarConfig = {
          val __obj = js.Dynamic.literal(allDateFormats = allDateFormats.asInstanceOf[js.Any], dateFormats = dateFormats.asInstanceOf[js.Any], dateFormatter = dateFormatter.asInstanceOf[js.Any], displayAllMonthEvents = displayAllMonthEvents.asInstanceOf[js.Any], displayEventEndTimes = displayEventEndTimes.asInstanceOf[js.Any], i18nStrings = i18nStrings.asInstanceOf[js.Any], showTimesOnWeekView = showTimesOnWeekView.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], titleFormats = titleFormats.asInstanceOf[js.Any])
          __obj.asInstanceOf[ICalendarConfig]
        }
        
        @scala.inline
        implicit class ICalendarConfigMutableBuilder[Self <: ICalendarConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAllDateFormats(value: Angular): Self = StObject.set(x, "allDateFormats", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDateFormats(value: IDateFormats): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDateFormatter(value: String): Self = StObject.set(x, "dateFormatter", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisplayAllMonthEvents(value: Boolean): Self = StObject.set(x, "displayAllMonthEvents", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisplayEventEndTimes(value: Boolean): Self = StObject.set(x, "displayEventEndTimes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setI18nStrings(value: WeekNumber): Self = StObject.set(x, "i18nStrings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShowTimesOnWeekView(value: Boolean): Self = StObject.set(x, "showTimesOnWeekView", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTemplates(value: CalendarDayView): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleFormats(value: ITitleFormats): Self = StObject.set(x, "titleFormats", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IDateFormats extends StObject {
        
        var datetime: String = js.native
        
        var day: String = js.native
        
        var hour: String = js.native
        
        var month: String = js.native
        
        var time: String = js.native
        
        var weekDay: String = js.native
      }
      object IDateFormats {
        
        @scala.inline
        def apply(datetime: String, day: String, hour: String, month: String, time: String, weekDay: String): IDateFormats = {
          val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], weekDay = weekDay.asInstanceOf[js.Any])
          __obj.asInstanceOf[IDateFormats]
        }
        
        @scala.inline
        implicit class IDateFormatsMutableBuilder[Self <: IDateFormats] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWeekDay(value: String): Self = StObject.set(x, "weekDay", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IEvent extends StObject {
        
        /**
          * Actions of the Event
          */
        var actions: js.UndefOr[js.Array[IEventAction]] = js.native
        
        /**
          * If set the event will display as all-day event
          */
        var allDay: js.UndefOr[Boolean] = js.native
        
        /**
          * Color of the Event
          */
        var color: js.UndefOr[IEventColor] = js.native
        
        /**
          * A CSS class (or more, just separate with spaces) that will be added to the event when it is displayed on each view. Useful for marking an event as selected / active etc
          */
        var cssClass: js.UndefOr[String] = js.native
        
        /**
          * If delete-event-html is set and this field is explicitly set to false then dont make it deleteable
          */
        var deletable: js.UndefOr[Boolean] = js.native
        
        /**
          * Allow an event to be dragged and dropped
          */
        var draggable: js.UndefOr[Boolean] = js.native
        
        /**
          * If edit-event-html is set and this field is explicitly set to false then dont make it editable.
          */
        var editable: js.UndefOr[Boolean] = js.native
        
        /**
          * Optional - a javascript date object for when the event ends
          */
        var endsAt: js.UndefOr[Date] = js.native
        
        /**
          * If set to false then will not count towards the badge total amount on the month and year view
          */
        var incrementsBadgeTotal: js.UndefOr[Boolean] = js.native
        
        /**
          * If set the event will recur on the given period. Valid values are year or month
          */
        var recursOn: js.UndefOr[String] = js.native
        
        /**
          * Allow an event to be resizable
          */
        var resizable: js.UndefOr[Boolean] = js.native
        
        /**
          * A javascript date object for when the event starts
          */
        var startsAt: Date = js.native
        
        /**
          * The title of the event
          */
        var title: String = js.native
        
        /**
          * The type of the event (determines its color). Can be important, warning, info, inverse, success or special
          */
        var `type`: js.UndefOr[String] = js.native
      }
      object IEvent {
        
        @scala.inline
        def apply(startsAt: Date, title: String): IEvent = {
          val __obj = js.Dynamic.literal(startsAt = startsAt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
          __obj.asInstanceOf[IEvent]
        }
        
        @scala.inline
        implicit class IEventMutableBuilder[Self <: IEvent] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActions(value: js.Array[IEventAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
          
          @scala.inline
          def setActionsVarargs(value: IEventAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
          
          @scala.inline
          def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
          
          @scala.inline
          def setColor(value: IEventColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
          
          @scala.inline
          def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
          
          @scala.inline
          def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
          
          @scala.inline
          def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
          
          @scala.inline
          def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
          
          @scala.inline
          def setEndsAt(value: Date): Self = StObject.set(x, "endsAt", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEndsAtUndefined: Self = StObject.set(x, "endsAt", js.undefined)
          
          @scala.inline
          def setIncrementsBadgeTotal(value: Boolean): Self = StObject.set(x, "incrementsBadgeTotal", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIncrementsBadgeTotalUndefined: Self = StObject.set(x, "incrementsBadgeTotal", js.undefined)
          
          @scala.inline
          def setRecursOn(value: String): Self = StObject.set(x, "recursOn", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRecursOnUndefined: Self = StObject.set(x, "recursOn", js.undefined)
          
          @scala.inline
          def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
          
          @scala.inline
          def setStartsAt(value: Date): Self = StObject.set(x, "startsAt", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      @js.native
      trait IEventAction extends StObject {
        
        /**
          * CSS class to be added to the action element
          */
        var cssClass: js.UndefOr[String] = js.native
        
        /**
          * The label of the action
          */
        var label: String = js.native
        
        /**
          * The action that occurs when it's clicked
          * @param args - the IEvent whose action was clicked
          */
        def onClick(args: js.Any): Unit = js.native
      }
      object IEventAction {
        
        @scala.inline
        def apply(label: String, onClick: js.Any => Unit): IEventAction = {
          val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
          __obj.asInstanceOf[IEventAction]
        }
        
        @scala.inline
        implicit class IEventActionMutableBuilder[Self <: IEventAction] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait IEventColor extends StObject {
        
        /**
          * The primary color of the event, should be darker than secondary
          */
        var primary: String = js.native
        
        /**
          * The secondary color of the event, should be lighter than primary
          */
        var secondary: String = js.native
      }
      object IEventColor {
        
        @scala.inline
        def apply(primary: String, secondary: String): IEventColor = {
          val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
          __obj.asInstanceOf[IEventColor]
        }
        
        @scala.inline
        implicit class IEventColorMutableBuilder[Self <: IEventColor] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IFormats extends StObject {
        
        var date: IDateFormats = js.native
        
        var title: ITitleFormats = js.native
      }
      object IFormats {
        
        @scala.inline
        def apply(date: IDateFormats, title: ITitleFormats): IFormats = {
          val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
          __obj.asInstanceOf[IFormats]
        }
        
        @scala.inline
        implicit class IFormatsMutableBuilder[Self <: IFormats] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDate(value: IDateFormats): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitle(value: ITitleFormats): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ITitleFormats extends StObject {
        
        var day: String = js.native
        
        var month: String = js.native
        
        var week: String = js.native
        
        var year: String = js.native
      }
      object ITitleFormats {
        
        @scala.inline
        def apply(day: String, month: String, week: String, year: String): ITitleFormats = {
          val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
          __obj.asInstanceOf[ITitleFormats]
        }
        
        @scala.inline
        implicit class ITitleFormatsMutableBuilder[Self <: ITitleFormats] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        }
      }
      
      object events {
        
        type IOnDeleteEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
        
        type IOnEditEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
        
        type IOnEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
        
        type IOnEventTimesChanged = js.Function3[
                /* calendarEvent */ IEvent, 
                /* calendarNewEventStart */ Date, 
                /* calendarNewEventEnd */ Date, 
                Unit
              ]
        
        type IOnTimespanClick = js.Function2[/* calendarDate */ Date, /* calendarCell */ ICalendarCell, Unit]
        
        type IOnViewChangeClick = js.Function2[/* calendarDate */ Date, /* calendarNextView */ String, Boolean]
      }
    }
  }
}
