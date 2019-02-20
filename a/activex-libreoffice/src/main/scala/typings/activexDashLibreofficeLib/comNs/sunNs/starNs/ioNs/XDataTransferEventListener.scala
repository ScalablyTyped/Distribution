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

