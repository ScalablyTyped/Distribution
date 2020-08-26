package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is the base class for {@link DropTargetDragEvent} and {@link DropTargetDropEvent} .
  *
  * To access the {@link XDropTarget} that originated this event, use the {@link com.sun.star.lang.EventObject.Source} member of this object.
  */
@js.native
trait DropTargetEvent extends EventObject {
  /** UNO specification does not allow empty struct definitions. */
  var Dummy: Double = js.native
}

object DropTargetEvent {
  @scala.inline
  def apply(Dummy: Double, Source: XInterface): DropTargetEvent = {
    val __obj = js.Dynamic.literal(Dummy = Dummy.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetEvent]
  }
  @scala.inline
  implicit class DropTargetEventOps[Self <: DropTargetEvent] (val x: Self) extends AnyVal {
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
    def setDummy(value: Double): Self = this.set("Dummy", value.asInstanceOf[js.Any])
  }
  
}

