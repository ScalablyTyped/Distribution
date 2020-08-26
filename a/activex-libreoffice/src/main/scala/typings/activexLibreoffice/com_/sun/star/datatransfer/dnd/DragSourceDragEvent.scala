package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link DragSourceDragEvent} is delivered from an object that implements the {@link XDragSourceContext} to the currently registered drag source
  * listener.
  *
  * It contains state regarding the current state of the operation to enable the operations initiator to provide the end user with the appropriate drag
  * over feedback.
  * @see com.sun.star.datatransfer.dnd.XDragSourceListener
  */
@js.native
trait DragSourceDragEvent extends DragSourceEvent {
  /**
    * The drag action selected by the current drop target.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: Double = js.native
  /**
    * The user's currently selected drop action.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var UserAction: Double = js.native
}

object DragSourceDragEvent {
  @scala.inline
  def apply(
    DragSource: XDragSource,
    DragSourceContext: XDragSourceContext,
    DropAction: Double,
    Source: XInterface,
    UserAction: Double
  ): DragSourceDragEvent = {
    val __obj = js.Dynamic.literal(DragSource = DragSource.asInstanceOf[js.Any], DragSourceContext = DragSourceContext.asInstanceOf[js.Any], DropAction = DropAction.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], UserAction = UserAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSourceDragEvent]
  }
  @scala.inline
  implicit class DragSourceDragEventOps[Self <: DragSourceDragEvent] (val x: Self) extends AnyVal {
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
    def setDropAction(value: Double): Self = this.set("DropAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAction(value: Double): Self = this.set("UserAction", value.asInstanceOf[js.Any])
  }
  
}

