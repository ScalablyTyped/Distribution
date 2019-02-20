package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

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
  var SupportedDataFlavors: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.DataFlavor]
}

