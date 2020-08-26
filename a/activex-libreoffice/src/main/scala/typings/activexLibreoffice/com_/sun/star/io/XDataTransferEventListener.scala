package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to receive callbacks from an importer or exporter. */
@js.native
trait XDataTransferEventListener extends XEventListener {
  /** is called when an import or export process has been cancelled. */
  def cancelled(aEvent: DataTransferEvent): Unit = js.native
  /** is called when an import or export process has finished. */
  def finished(aEvent: DataTransferEvent): Unit = js.native
}

object XDataTransferEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancelled: DataTransferEvent => Unit,
    disposing: EventObject => Unit,
    finished: DataTransferEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataTransferEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelled = js.Any.fromFunction1(cancelled), disposing = js.Any.fromFunction1(disposing), finished = js.Any.fromFunction1(finished), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataTransferEventListener]
  }
  @scala.inline
  implicit class XDataTransferEventListenerOps[Self <: XDataTransferEventListener] (val x: Self) extends AnyVal {
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
    def setCancelled(value: DataTransferEvent => Unit): Self = this.set("cancelled", js.Any.fromFunction1(value))
    @scala.inline
    def setFinished(value: DataTransferEvent => Unit): Self = this.set("finished", js.Any.fromFunction1(value))
  }
  
}

