package typings
package angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  /**
  	         * Actions of the Event
  	         */
  var actions: js.UndefOr[js.Array[IEventAction]] = js.undefined
  /**
  	         * If set the event will display as all-day event
  	         */
  var allDay: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	         * Color of the Event
  	         */
  var color: js.UndefOr[IEventColor] = js.undefined
  /**
    * A CSS class (or more, just separate with spaces) that will be added to the event when it is displayed on each view. Useful for marking an event as selected / active etc
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If delete-event-html is set and this field is explicitly set to false then dont make it deleteable
    */
  var deletable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow an event to be dragged and dropped
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If edit-event-html is set and this field is explicitly set to false then dont make it editable.
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional - a javascript date object for when the event ends
    */
  var endsAt: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * If set to false then will not count towards the badge total amount on the month and year view
    */
  var incrementsBadgeTotal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set the event will recur on the given period. Valid values are year or month
    */
  var recursOn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow an event to be resizable
    */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A javascript date object for when the event starts
    */
  var startsAt: stdLib.Date
  /**
    * The title of the event
    */
  var title: java.lang.String
  /**
    * The type of the event (determines its color). Can be important, warning, info, inverse, success or special
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

