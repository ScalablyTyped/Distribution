package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to receive callbacks from an importer or exporter. */
trait XDataTransferEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called when an import or export process has been cancelled. */
  def cancelled(aEvent: DataTransferEvent): scala.Unit
  /** is called when an import or export process has finished. */
  def finished(aEvent: DataTransferEvent): scala.Unit
}

object XDataTransferEventListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    cancelled: DataTransferEvent => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    finished: DataTransferEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDataTransferEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelled = js.Any.fromFunction1(cancelled), disposing = js.Any.fromFunction1(disposing), finished = js.Any.fromFunction1(finished), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataTransferEventListener]
  }
}

