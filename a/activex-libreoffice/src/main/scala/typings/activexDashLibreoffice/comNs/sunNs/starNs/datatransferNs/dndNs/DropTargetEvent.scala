package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is the base class for {@link DropTargetDragEvent} and {@link DropTargetDropEvent} .
  *
  * To access the {@link XDropTarget} that originated this event, use the {@link com.sun.star.lang.EventObject.Source} member of this object.
  */
trait DropTargetEvent extends EventObject {
  /** UNO specification does not allow empty struct definitions. */
  var Dummy: Double
}

object DropTargetEvent {
  @scala.inline
  def apply(Dummy: Double, Source: XInterface): DropTargetEvent = {
    val __obj = js.Dynamic.literal(Dummy = Dummy, Source = Source)
  
    __obj.asInstanceOf[DropTargetEvent]
  }
}

