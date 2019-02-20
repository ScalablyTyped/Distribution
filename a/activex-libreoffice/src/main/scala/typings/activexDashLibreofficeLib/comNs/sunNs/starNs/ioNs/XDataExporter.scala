package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to export data from a component into a data sink.
  *
  * Exporter objects are registered for specific components and data types.
  */
trait XDataExporter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** cancels the export process. */
  def cancel(): scala.Unit
  /** exports data for a component into an output stream. */
  def exportData(
    aOutputStream: XOutputStream,
    Component: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    aListener: XDataTransferEventListener
  ): scala.Unit
}

