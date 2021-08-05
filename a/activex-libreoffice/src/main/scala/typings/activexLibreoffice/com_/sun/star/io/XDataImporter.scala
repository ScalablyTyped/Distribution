package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to import data from a data source into a component.
  *
  * Importer objects are registered for specific components and data types.
  */
trait XDataImporter
  extends StObject
     with XInterface {
  
  /** cancels the import process. */
  def cancel(): Unit
  
  /** imports data for a component from an active data source. */
  def importData(aActiveSource: XActiveDataSource, Component: XComponent, aListener: XDataTransferEventListener): Unit
}
object XDataImporter {
  
  inline def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    importData: (XActiveDataSource, XComponent, XDataTransferEventListener) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataImporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), importData = js.Any.fromFunction3(importData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataImporter]
  }
  
  extension [Self <: XDataImporter](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setImportData(value: (XActiveDataSource, XComponent, XDataTransferEventListener) => Unit): Self = StObject.set(x, "importData", js.Any.fromFunction3(value))
  }
}
