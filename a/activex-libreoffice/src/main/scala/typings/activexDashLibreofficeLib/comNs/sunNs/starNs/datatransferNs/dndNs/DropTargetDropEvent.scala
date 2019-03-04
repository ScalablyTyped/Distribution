package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

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
  var DropAction: scala.Double
  /** The cursor's current x location within the window's coordinates. */
  var LocationX: scala.Double
  /** The cursor's current y location within the window's coordinates. */
  var LocationY: scala.Double
  /** This value represents the action or actions supported by the source. */
  var SourceActions: scala.Double
  /**
    * The transferable object associated with the drop.
    * @see com.sun.star.datatransfer.XTransferable
    */
  var Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
}

object DropTargetDropEvent {
  @scala.inline
  def apply(
    Context: XDropTargetDropContext,
    DropAction: scala.Double,
    Dummy: scala.Double,
    LocationX: scala.Double,
    LocationY: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    SourceActions: scala.Double,
    Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  ): DropTargetDropEvent = {
    val __obj = js.Dynamic.literal(Context = Context, DropAction = DropAction, Dummy = Dummy, LocationX = LocationX, LocationY = LocationY, Source = Source, SourceActions = SourceActions, Transferable = Transferable)
  
    __obj.asInstanceOf[DropTargetDropEvent]
  }
}

