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
    acquire: js.Function0[scala.Unit],
    cancelled: js.Function1[DataTransferEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    finished: js.Function1[DataTransferEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataTransferEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("cancelled")(cancelled)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("finished")(finished)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDataTransferEventListener]
  }
}

