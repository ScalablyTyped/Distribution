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

object XDataExporter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    exportData: js.Function3[
      XOutputStream, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, 
      XDataTransferEventListener, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataExporter = {
    val __obj = js.Dynamic.literal(acquire = acquire, cancel = cancel, exportData = exportData, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDataExporter]
  }
}

