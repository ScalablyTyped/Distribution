package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to export data from a component into a data sink.
  *
  * Exporter objects are registered for specific components and data types.
  */
trait XDataExporter
  extends StObject
     with XInterface {
  
  /** cancels the export process. */
  def cancel(): Unit
  
  /** exports data for a component into an output stream. */
  def exportData(aOutputStream: XOutputStream, Component: XComponent, aListener: XDataTransferEventListener): Unit
}
object XDataExporter {
  
  inline def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    exportData: (XOutputStream, XComponent, XDataTransferEventListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataExporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), exportData = js.Any.fromFunction3(exportData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataExporter]
  }
  
  extension [Self <: XDataExporter](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setExportData(value: (XOutputStream, XComponent, XDataTransferEventListener) => Unit): Self = StObject.set(x, "exportData", js.Any.fromFunction3(value))
  }
}
