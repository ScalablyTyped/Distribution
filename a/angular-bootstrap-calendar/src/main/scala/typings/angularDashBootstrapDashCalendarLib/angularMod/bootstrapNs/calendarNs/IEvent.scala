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

object IEvent {
  @scala.inline
  def apply(
    startsAt: stdLib.Date,
    title: java.lang.String,
    actions: js.Array[IEventAction] = null,
    allDay: js.UndefOr[scala.Boolean] = js.undefined,
    color: IEventColor = null,
    cssClass: java.lang.String = null,
    deletable: js.UndefOr[scala.Boolean] = js.undefined,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    endsAt: stdLib.Date = null,
    incrementsBadgeTotal: js.UndefOr[scala.Boolean] = js.undefined,
    recursOn: java.lang.String = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startsAt")(startsAt)
    __obj.updateDynamic("title")(title)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(deletable)) __obj.updateDynamic("deletable")(deletable)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (endsAt != null) __obj.updateDynamic("endsAt")(endsAt)
    if (!js.isUndefined(incrementsBadgeTotal)) __obj.updateDynamic("incrementsBadgeTotal")(incrementsBadgeTotal)
    if (recursOn != null) __obj.updateDynamic("recursOn")(recursOn)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IEvent]
  }
}

