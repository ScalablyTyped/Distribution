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
    acquire: () => scala.Unit,
    cancel: () => scala.Unit,
    exportData: (XOutputStream, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, XDataTransferEventListener) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDataExporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), exportData = js.Any.fromFunction3(exportData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataExporter]
  }
}

