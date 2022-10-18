package typings.angularBootstrapCalendar

import typings.angularBootstrapCalendar.anon.Angular
import typings.angularBootstrapCalendar.anon.CalendarDayView
import typings.angularBootstrapCalendar.anon.WeekNumber
import typings.moment.ts3Dot1TypingsMomentMod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object bootstrap {
    
    object calendar {
      
      trait ICalendarCell extends StObject {
        
        var badgeTotal: Double
        
        var date: Moment
        
        var events: js.Array[IEvent]
        
        var inMonth: Boolean
        
        var isFuture: Boolean
        
        var isPast: Boolean
        
        var isToday: Boolean
        
        var isWeekend: Boolean
        
        var label: Double
      }
      object ICalendarCell {
        
        inline def apply(
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
        
        extension [Self <: ICalendarCell](x: Self) {
          
          inline def setBadgeTotal(value: Double): Self = StObject.set(x, "badgeTotal", value.asInstanceOf[js.Any])
          
          inline def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
          
          inline def setEvents(value: js.Array[IEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
          
          inline def setEventsVarargs(value: IEvent*): Self = StObject.set(x, "events", js.Array(value*))
          
          inline def setInMonth(value: Boolean): Self = StObject.set(x, "inMonth", value.asInstanceOf[js.Any])
          
          inline def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
          
          inline def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
          
          inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
          
          inline def setIsWeekend(value: Boolean): Self = StObject.set(x, "isWeekend", value.asInstanceOf[js.Any])
          
          inline def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        }
      }
      
      trait ICalendarConfig extends StObject {
        
        var allDateFormats: Angular
        
        var dateFormats: IDateFormats
        
        var dateFormatter: String
        
        var displayAllMonthEvents: Boolean
        
        var displayEventEndTimes: Boolean
        
        var i18nStrings: WeekNumber
        
        var showTimesOnWeekView: Boolean
        
        var templates: CalendarDayView
        
        var titleFormats: ITitleFormats
      }
      object ICalendarConfig {
        
        inline def apply(
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
        
        extension [Self <: ICalendarConfig](x: Self) {
          
          inline def setAllDateFormats(value: Angular): Self = StObject.set(x, "allDateFormats", value.asInstanceOf[js.Any])
          
          inline def setDateFormats(value: IDateFormats): Self = StObject.set(x, "dateFormats", value.asInstanceOf[js.Any])
          
          inline def setDateFormatter(value: String): Self = StObject.set(x, "dateFormatter", value.asInstanceOf[js.Any])
          
          inline def setDisplayAllMonthEvents(value: Boolean): Self = StObject.set(x, "displayAllMonthEvents", value.asInstanceOf[js.Any])
          
          inline def setDisplayEventEndTimes(value: Boolean): Self = StObject.set(x, "displayEventEndTimes", value.asInstanceOf[js.Any])
          
          inline def setI18nStrings(value: WeekNumber): Self = StObject.set(x, "i18nStrings", value.asInstanceOf[js.Any])
          
          inline def setShowTimesOnWeekView(value: Boolean): Self = StObject.set(x, "showTimesOnWeekView", value.asInstanceOf[js.Any])
          
          inline def setTemplates(value: CalendarDayView): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
          
          inline def setTitleFormats(value: ITitleFormats): Self = StObject.set(x, "titleFormats", value.asInstanceOf[js.Any])
        }
      }
      
      trait IDateFormats extends StObject {
        
        var datetime: String
        
        var day: String
        
        var hour: String
        
        var month: String
        
        var time: String
        
        var weekDay: String
      }
      object IDateFormats {
        
        inline def apply(datetime: String, day: String, hour: String, month: String, time: String, weekDay: String): IDateFormats = {
          val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], weekDay = weekDay.asInstanceOf[js.Any])
          __obj.asInstanceOf[IDateFormats]
        }
        
        extension [Self <: IDateFormats](x: Self) {
          
          inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
          
          inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
          
          inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
          
          inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
          
          inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
          
          inline def setWeekDay(value: String): Self = StObject.set(x, "weekDay", value.asInstanceOf[js.Any])
        }
      }
      
      trait IEvent extends StObject {
        
        /**
          * Actions of the Event
          */
        var actions: js.UndefOr[js.Array[IEventAction]] = js.undefined
        
        /**
          * If set the event will display as all-day event
          */
        var allDay: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Color of the Event
          */
        var color: js.UndefOr[IEventColor] = js.undefined
        
        /**
          * A CSS class (or more, just separate with spaces) that will be added to the event when it is displayed on each view. Useful for marking an event as selected / active etc
          */
        var cssClass: js.UndefOr[String] = js.undefined
        
        /**
          * If delete-event-html is set and this field is explicitly set to false then dont make it deleteable
          */
        var deletable: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Allow an event to be dragged and dropped
          */
        var draggable: js.UndefOr[Boolean] = js.undefined
        
        /**
          * If edit-event-html is set and this field is explicitly set to false then dont make it editable.
          */
        var editable: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Optional - a javascript date object for when the event ends
          */
        var endsAt: js.UndefOr[js.Date] = js.undefined
        
        /**
          * If set to false then will not count towards the badge total amount on the month and year view
          */
        var incrementsBadgeTotal: js.UndefOr[Boolean] = js.undefined
        
        /**
          * If set the event will recur on the given period. Valid values are year or month
          */
        var recursOn: js.UndefOr[String] = js.undefined
        
        /**
          * Allow an event to be resizable
          */
        var resizable: js.UndefOr[Boolean] = js.undefined
        
        /**
          * A javascript date object for when the event starts
          */
        var startsAt: js.Date
        
        /**
          * The title of the event
          */
        var title: String
        
        /**
          * The type of the event (determines its color). Can be important, warning, info, inverse, success or special
          */
        var `type`: js.UndefOr[String] = js.undefined
      }
      object IEvent {
        
        inline def apply(startsAt: js.Date, title: String): IEvent = {
          val __obj = js.Dynamic.literal(startsAt = startsAt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
          __obj.asInstanceOf[IEvent]
        }
        
        extension [Self <: IEvent](x: Self) {
          
          inline def setActions(value: js.Array[IEventAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
          
          inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
          
          inline def setActionsVarargs(value: IEventAction*): Self = StObject.set(x, "actions", js.Array(value*))
          
          inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
          
          inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
          
          inline def setColor(value: IEventColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
          
          inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
          
          inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
          
          inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
          
          inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
          
          inline def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
          
          inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
          
          inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
          
          inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
          
          inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
          
          inline def setEndsAt(value: js.Date): Self = StObject.set(x, "endsAt", value.asInstanceOf[js.Any])
          
          inline def setEndsAtUndefined: Self = StObject.set(x, "endsAt", js.undefined)
          
          inline def setIncrementsBadgeTotal(value: Boolean): Self = StObject.set(x, "incrementsBadgeTotal", value.asInstanceOf[js.Any])
          
          inline def setIncrementsBadgeTotalUndefined: Self = StObject.set(x, "incrementsBadgeTotal", js.undefined)
          
          inline def setRecursOn(value: String): Self = StObject.set(x, "recursOn", value.asInstanceOf[js.Any])
          
          inline def setRecursOnUndefined: Self = StObject.set(x, "recursOn", js.undefined)
          
          inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
          
          inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
          
          inline def setStartsAt(value: js.Date): Self = StObject.set(x, "startsAt", value.asInstanceOf[js.Any])
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      trait IEventAction extends StObject {
        
        /**
          * CSS class to be added to the action element
          */
        var cssClass: js.UndefOr[String] = js.undefined
        
        /**
          * The label of the action
          */
        var label: String
        
        /**
          * The action that occurs when it's clicked
          * @param args - the IEvent whose action was clicked
          */
        def onClick(args: Any): Unit
      }
      object IEventAction {
        
        inline def apply(label: String, onClick: Any => Unit): IEventAction = {
          val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
          __obj.asInstanceOf[IEventAction]
        }
        
        extension [Self <: IEventAction](x: Self) {
          
          inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
          
          inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          inline def setOnClick(value: Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
        }
      }
      
      trait IEventColor extends StObject {
        
        /**
          * The primary color of the event, should be darker than secondary
          */
        var primary: String
        
        /**
          * The secondary color of the event, should be lighter than primary
          */
        var secondary: String
      }
      object IEventColor {
        
        inline def apply(primary: String, secondary: String): IEventColor = {
          val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
          __obj.asInstanceOf[IEventColor]
        }
        
        extension [Self <: IEventColor](x: Self) {
          
          inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
          
          inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
        }
      }
      
      trait IFormats extends StObject {
        
        var date: IDateFormats
        
        var title: ITitleFormats
      }
      object IFormats {
        
        inline def apply(date: IDateFormats, title: ITitleFormats): IFormats = {
          val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
          __obj.asInstanceOf[IFormats]
        }
        
        extension [Self <: IFormats](x: Self) {
          
          inline def setDate(value: IDateFormats): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
          
          inline def setTitle(value: ITitleFormats): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        }
      }
      
      trait ITitleFormats extends StObject {
        
        var day: String
        
        var month: String
        
        var week: String
        
        var year: String
      }
      object ITitleFormats {
        
        inline def apply(day: String, month: String, week: String, year: String): ITitleFormats = {
          val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
          __obj.asInstanceOf[ITitleFormats]
        }
        
        extension [Self <: ITitleFormats](x: Self) {
          
          inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
          
          inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
          
          inline def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
          
          inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        }
      }
      
      object events {
        
        type IOnDeleteEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
        
        type IOnEditEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
        
        type IOnEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
        
        type IOnEventTimesChanged = js.Function3[
                /* calendarEvent */ IEvent, 
                /* calendarNewEventStart */ js.Date, 
                /* calendarNewEventEnd */ js.Date, 
                Unit
              ]
        
        type IOnTimespanClick = js.Function2[/* calendarDate */ js.Date, /* calendarCell */ ICalendarCell, Unit]
        
        type IOnViewChangeClick = js.Function2[/* calendarDate */ js.Date, /* calendarNextView */ String, Boolean]
      }
    }
  }
}
