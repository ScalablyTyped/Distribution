package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvent extends js.Object {
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
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
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
    def setStartsAt(value: Date): Self = this.set("startsAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: IEventAction*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[IEventAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setAllDay(value: Boolean): Self = this.set("allDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDay: Self = this.set("allDay", js.undefined)
    @scala.inline
    def setColor(value: IEventColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDeletable(value: Boolean): Self = this.set("deletable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletable: Self = this.set("deletable", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEndsAt(value: Date): Self = this.set("endsAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndsAt: Self = this.set("endsAt", js.undefined)
    @scala.inline
    def setIncrementsBadgeTotal(value: Boolean): Self = this.set("incrementsBadgeTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrementsBadgeTotal: Self = this.set("incrementsBadgeTotal", js.undefined)
    @scala.inline
    def setRecursOn(value: String): Self = this.set("recursOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursOn: Self = this.set("recursOn", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

