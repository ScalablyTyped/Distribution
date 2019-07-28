package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to export data from a component into a data sink.
  *
  * Exporter objects are registered for specific components and data types.
  */
trait XDataExporter extends XInterface {
  /** cancels the export process. */
  def cancel(): Unit
  /** exports data for a component into an output stream. */
  def exportData(aOutputStream: XOutputStream, Component: XComponent, aListener: XDataTransferEventListener): Unit
}

object XDataExporter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    exportData: (XOutputStream, XComponent, XDataTransferEventListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataExporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), exportData = js.Any.fromFunction3(exportData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataExporter]
  }
}

