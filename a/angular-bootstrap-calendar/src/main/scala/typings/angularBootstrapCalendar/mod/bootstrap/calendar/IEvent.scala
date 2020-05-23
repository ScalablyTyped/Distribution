package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import typings.std.Date
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
  var endsAt: js.UndefOr[Date] = js.undefined
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
  var startsAt: Date
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
  @scala.inline
  def apply(
    startsAt: Date,
    title: String,
    actions: js.Array[IEventAction] = null,
    allDay: js.UndefOr[Boolean] = js.undefined,
    color: IEventColor = null,
    cssClass: String = null,
    deletable: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    endsAt: Date = null,
    incrementsBadgeTotal: js.UndefOr[Boolean] = js.undefined,
    recursOn: String = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): IEvent = {
    val __obj = js.Dynamic.literal(startsAt = startsAt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(allDay)) __obj.updateDynamic("allDay")(allDay.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(deletable)) __obj.updateDynamic("deletable")(deletable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (endsAt != null) __obj.updateDynamic("endsAt")(endsAt.asInstanceOf[js.Any])
    if (!js.isUndefined(incrementsBadgeTotal)) __obj.updateDynamic("incrementsBadgeTotal")(incrementsBadgeTotal.get.asInstanceOf[js.Any])
    if (recursOn != null) __obj.updateDynamic("recursOn")(recursOn.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEvent]
  }
}

