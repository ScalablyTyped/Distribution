package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.DataFlavor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link DropTargetDragEnterEvent} is delivered from the drop target to the currently registered drop target listeners whenever the logical cursor
  * associated with a Drag and Drop operation enters the visible geometry of a window associated with a drop target.
  *
  * It contains the {@link com.sun.star.datatransfer.DataFlavor} types supported by the transferable object of the current Drag and Drop operation.
  * @see com.sun.star.datatransfer.XTransferable
  */
trait DropTargetDragEnterEvent extends DropTargetDragEvent {
  /** A sequence of supported {@link com.sun.star.datatransfer.DataFlavor} types. */
  var SupportedDataFlavors: SafeArray[DataFlavor]
}

object DropTargetDragEnterEvent {
  @scala.inline
  def apply(
    Context: XDropTargetDragContext,
    DropAction: Double,
    Dummy: Double,
    LocationX: Double,
    LocationY: Double,
    Source: XInterface,
    SourceActions: Double,
    SupportedDataFlavors: SafeArray[DataFlavor]
  ): DropTargetDragEnterEvent = {
    val __obj = js.Dynamic.literal(Context = Context, DropAction = DropAction, Dummy = Dummy, LocationX = LocationX, LocationY = LocationY, Source = Source, SourceActions = SourceActions, SupportedDataFlavors = SupportedDataFlavors)
  
    __obj.asInstanceOf[DropTargetDragEnterEvent]
  }
}

