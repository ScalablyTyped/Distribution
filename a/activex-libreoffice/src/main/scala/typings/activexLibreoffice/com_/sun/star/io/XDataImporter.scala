package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to import data from a data source into a component.
  *
  * Importer objects are registered for specific components and data types.
  */
@js.native
trait XDataImporter extends XInterface {
  /** cancels the import process. */
  def cancel(): Unit = js.native
  /** imports data for a component from an active data source. */
  def importData(aActiveSource: XActiveDataSource, Component: XComponent, aListener: XDataTransferEventListener): Unit = js.native
}

object XDataImporter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    importData: (XActiveDataSource, XComponent, XDataTransferEventListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataImporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), importData = js.Any.fromFunction3(importData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataImporter]
  }
  @scala.inline
  implicit class XDataImporterOps[Self <: XDataImporter] (val x: Self) extends AnyVal {
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
    def setImportData(value: (XActiveDataSource, XComponent, XDataTransferEventListener) => Unit): Self = this.set("importData", js.Any.fromFunction3(value))
  }
  
}

