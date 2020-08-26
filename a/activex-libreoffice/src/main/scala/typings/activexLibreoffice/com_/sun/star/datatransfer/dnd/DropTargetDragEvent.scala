package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link DropTargetDragEvent} is delivered from the drop target to the currently registered drop target listener.
  *
  * It contains information regarding the current state of the operation to enable the operations initiator to provide the end user with the appropriate
  * drag over feedback.
  * @see com.sun.star.datatransfer.dnd.XDropTargetListener
  */
@js.native
trait DropTargetDragEvent extends DropTargetEvent {
  /**
    * The drop target context of the current drag operation.
    * @see com.sun.star.datatransfer.dnd.XDropTargetDragContext
    */
  var Context: XDropTargetDragContext = js.native
  /**
    * This value represents the currently selected drop action.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: Double = js.native
  /** The cursor's current x location within the window's coordinates. */
  var LocationX: Double = js.native
  /** The cursor's current y location within the window's coordinates. */
  var LocationY: Double = js.native
  /**
    * This value represents the action or actions supported by the source. This may be a combination of arbitrary source actions except ACTION_DEFAULT.
    *
    * To combine different actions use a logical OR.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var SourceActions: Double = js.native
}

object DropTargetDragEvent {
  @scala.inline
  def apply(
    Context: XDropTargetDragContext,
    DropAction: Double,
    Dummy: Double,
    LocationX: Double,
    LocationY: Double,
    Source: XInterface,
    SourceActions: Double
  ): DropTargetDragEvent = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DropAction = DropAction.asInstanceOf[js.Any], Dummy = Dummy.asInstanceOf[js.Any], LocationX = LocationX.asInstanceOf[js.Any], LocationY = LocationY.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceActions = SourceActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetDragEvent]
  }
  @scala.inline
  implicit class DropTargetDragEventOps[Self <: DropTargetDragEvent] (val x: Self) extends AnyVal {
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
    def setContext(value: XDropTargetDragContext): Self = this.set("Context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropAction(value: Double): Self = this.set("DropAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationX(value: Double): Self = this.set("LocationX", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationY(value: Double): Self = this.set("LocationY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceActions(value: Double): Self = this.set("SourceActions", value.asInstanceOf[js.Any])
  }
  
}

