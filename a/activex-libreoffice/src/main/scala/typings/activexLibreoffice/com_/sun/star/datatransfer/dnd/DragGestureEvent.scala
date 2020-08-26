package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link DragGestureEvent} is passed to the method {@link XDragGestureListener.dragGestureRecognized()} when a particular {@link
  * XDragGestureRecognizer} detects that a platform dependent drag initiating gesture has occurred on the component that it is tracking.
  */
@js.native
trait DragGestureEvent extends EventObject {
  /**
    * The action selected by the user.
    *
    * Different constants may be combined using a logical OR.
    *
    * It's further possible to combine the ACTION_DEFAULT with one of the other actions defined in {@link com.sun.star.datatransfer.dnd.DNDConstants} . This
    * means the user did not press any key during the Drag and Drop operation and the action that was combined with ACTION_DEFAULT is the system default
    * action.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DragAction: Double = js.native
  /** The x coordinate where the drag originated in component coordinates. */
  var DragOriginX: Double = js.native
  /** The y coordinate where the drag originated in component coordinates. */
  var DragOriginY: Double = js.native
  /** The DragSource associated with this drag action. */
  var DragSource: XDragSource = js.native
  /**
    * The last event comprising the gesture.
    *
    * The initial trigger event will presumably be a {@link com.sun.star.awt.MouseEvent} event. If it is not, the implementation should either react
    * accordingly or presume that the left mouse button was clicked.
    */
  var Event: js.Any = js.native
}

object DragGestureEvent {
  @scala.inline
  def apply(
    DragAction: Double,
    DragOriginX: Double,
    DragOriginY: Double,
    DragSource: XDragSource,
    Event: js.Any,
    Source: XInterface
  ): DragGestureEvent = {
    val __obj = js.Dynamic.literal(DragAction = DragAction.asInstanceOf[js.Any], DragOriginX = DragOriginX.asInstanceOf[js.Any], DragOriginY = DragOriginY.asInstanceOf[js.Any], DragSource = DragSource.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragGestureEvent]
  }
  @scala.inline
  implicit class DragGestureEventOps[Self <: DragGestureEvent] (val x: Self) extends AnyVal {
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
    def setDragAction(value: Double): Self = this.set("DragAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOriginX(value: Double): Self = this.set("DragOriginX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOriginY(value: Double): Self = this.set("DragOriginY", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragSource(value: XDragSource): Self = this.set("DragSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("Event", value.asInstanceOf[js.Any])
  }
  
}

