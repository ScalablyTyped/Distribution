package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link DropTargetDropEvent} is delivered from the drop target to its currently registered drop target listener.
  *
  * It contains sufficient information for the originator of the operation to provide appropriate feedback to the end user when the operation completes.
  */
trait DropTargetDropEvent extends DropTargetEvent {
  /**
    * The drop target context of the current drag operation.
    * @see com.sun.star.datatransfer.dnd.XDropTargetDropContext
    */
  var Context: XDropTargetDropContext
  /**
    * This value represents the action or actions selected by the user at the time of the drop.
    *
    * If more than one action is specified, the {@link XDropTargetListener} should raise a dialog to ask the user which action to use.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: Double
  /** The cursor's current x location within the window's coordinates. */
  var LocationX: Double
  /** The cursor's current y location within the window's coordinates. */
  var LocationY: Double
  /** This value represents the action or actions supported by the source. */
  var SourceActions: Double
  /**
    * The transferable object associated with the drop.
    * @see com.sun.star.datatransfer.XTransferable
    */
  var Transferable: XTransferable
}

object DropTargetDropEvent {
  @scala.inline
  def apply(
    Context: XDropTargetDropContext,
    DropAction: Double,
    Dummy: Double,
    LocationX: Double,
    LocationY: Double,
    Source: XInterface,
    SourceActions: Double,
    Transferable: XTransferable
  ): DropTargetDropEvent = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DropAction = DropAction.asInstanceOf[js.Any], Dummy = Dummy.asInstanceOf[js.Any], LocationX = LocationX.asInstanceOf[js.Any], LocationY = LocationY.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceActions = SourceActions.asInstanceOf[js.Any], Transferable = Transferable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetDropEvent]
  }
}

