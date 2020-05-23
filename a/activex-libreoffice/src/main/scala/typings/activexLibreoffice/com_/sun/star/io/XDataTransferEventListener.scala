package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to receive callbacks from an importer or exporter. */
trait XDataTransferEventListener extends XEventListener {
  /** is called when an import or export process has been cancelled. */
  def cancelled(aEvent: DataTransferEvent): Unit
  /** is called when an import or export process has finished. */
  def finished(aEvent: DataTransferEvent): Unit
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
}

