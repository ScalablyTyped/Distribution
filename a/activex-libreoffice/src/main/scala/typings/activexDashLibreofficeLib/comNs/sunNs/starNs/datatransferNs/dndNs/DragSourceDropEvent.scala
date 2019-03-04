package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link DragSourceDropEvent} is delivered from an object that implements {@link XDragSourceContext} to its currently registered drag source
  * listener's.
  *
  * It contains sufficient information for the originator of the operation to provide appropriate feedback to the end user when the operation completes.
  * @see com.sun.star.datatransfer.dnd.XDragSourceListener
  */
trait DragSourceDropEvent extends DragSourceEvent {
  /**
    * The action performed by the target on the subject of the drop.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: scala.Double
  /** Indicates if the drop was successful. */
  var DropSuccess: scala.Boolean
}

object DragSourceDropEvent {
  @scala.inline
  def apply(
    DragSource: XDragSource,
    DragSourceContext: XDragSourceContext,
    DropAction: scala.Double,
    DropSuccess: scala.Boolean,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): DragSourceDropEvent = {
    val __obj = js.Dynamic.literal(DragSource = DragSource, DragSourceContext = DragSourceContext, DropAction = DropAction, DropSuccess = DropSuccess, Source = Source)
  
    __obj.asInstanceOf[DragSourceDropEvent]
  }
}

