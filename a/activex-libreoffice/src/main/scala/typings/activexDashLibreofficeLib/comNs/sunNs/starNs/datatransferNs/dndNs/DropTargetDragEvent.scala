package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

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
trait DropTargetDragEvent extends DropTargetEvent {
  /**
    * The drop target context of the current drag operation.
    * @see com.sun.star.datatransfer.dnd.XDropTargetDragContext
    */
  var Context: XDropTargetDragContext
  /**
    * This value represents the currently selected drop action.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: scala.Double
  /** The cursor's current x location within the window's coordinates. */
  var LocationX: scala.Double
  /** The cursor's current y location within the window's coordinates. */
  var LocationY: scala.Double
  /**
    * This value represents the action or actions supported by the source. This may be a combination of arbitrary source actions except ACTION_DEFAULT.
    *
    * To combine different actions use a logical OR.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var SourceActions: scala.Double
}

object DropTargetDragEvent {
  @scala.inline
  def apply(
    Context: XDropTargetDragContext,
    DropAction: scala.Double,
    Dummy: scala.Double,
    LocationX: scala.Double,
    LocationY: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    SourceActions: scala.Double
  ): DropTargetDragEvent = {
    val __obj = js.Dynamic.literal(Context = Context, DropAction = DropAction, Dummy = Dummy, LocationX = LocationX, LocationY = LocationY, Source = Source, SourceActions = SourceActions)
  
    __obj.asInstanceOf[DropTargetDragEvent]
  }
}

