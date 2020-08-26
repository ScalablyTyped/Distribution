package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to export data from a component into a data sink.
  *
  * Exporter objects are registered for specific components and data types.
  */
@js.native
trait XDataExporter extends XInterface {
  /** cancels the export process. */
  def cancel(): Unit = js.native
  /** exports data for a component into an output stream. */
  def exportData(aOutputStream: XOutputStream, Component: XComponent, aListener: XDataTransferEventListener): Unit = js.native
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
  @scala.inline
  implicit class XDataExporterOps[Self <: XDataExporter] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setExportData(value: (XOutputStream, XComponent, XDataTransferEventListener) => Unit): Self = this.set("exportData", js.Any.fromFunction3(value))
  }
  
}

