package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link DragGestureEvent} is passed to the method {@link XDragGestureListener.dragGestureRecognized()} when a particular {@link
  * XDragGestureRecognizer} detects that a platform dependent drag initiating gesture has occurred on the component that it is tracking.
  */
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
  var DragAction: Double
  /** The x coordinate where the drag originated in component coordinates. */
  var DragOriginX: Double
  /** The y coordinate where the drag originated in component coordinates. */
  var DragOriginY: Double
  /** The DragSource associated with this drag action. */
  var DragSource: XDragSource
  /**
    * The last event comprising the gesture.
    *
    * The initial trigger event will presumably be a {@link com.sun.star.awt.MouseEvent} event. If it is not, the implementation should either react
    * accordingly or presume that the left mouse button was clicked.
    */
  var Event: js.Any
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
    val __obj = js.Dynamic.literal(DragAction = DragAction, DragOriginX = DragOriginX, DragOriginY = DragOriginY, DragSource = DragSource, Event = Event, Source = Source)
  
    __obj.asInstanceOf[DragGestureEvent]
  }
}

