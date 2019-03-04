package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is the base class for {@link DropTargetDragEvent} and {@link DropTargetDropEvent} .
  *
  * To access the {@link XDropTarget} that originated this event, use the {@link com.sun.star.lang.EventObject.Source} member of this object.
  */
trait DropTargetEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** UNO specification does not allow empty struct definitions. */
  var Dummy: scala.Double
}

object DropTargetEvent {
  @scala.inline
  def apply(Dummy: scala.Double, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): DropTargetEvent = {
    val __obj = js.Dynamic.literal(Dummy = Dummy, Source = Source)
  
    __obj.asInstanceOf[DropTargetEvent]
  }
}

