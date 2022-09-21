package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface to filter documents
  *
  * This interface will be used by service {@link ImportFilter} or {@link ExportFilter} to support loading/saving of documents in different formats. The
  * target/source of such filter operations must be known **before** filtering will be started. (see {@link XImporter} and {@link XExporter} too)
  * Otherwise this interface can't work right.
  * @see ImportFilter
  * @see ExportFilter
  * @see XImporter
  * @see XExporter
  */
trait XFilter
  extends StObject
     with XInterface {
  
  /** cancel the process. */
  def cancel(): Unit
  
  /**
    * filter the document.
    *
    * The given {@link MediaDescriptor} holds all necessary information about the document.
    *
    * Don't hold hard references to the descriptor items. You must copy needed information! Otherwise we couldn't destroy (for example) an existing input
    * stream!
    * @param aDescriptor the {@link MediaDescriptor} describing the respective document.
    * @returns a boolean value indicating whether the filter operation was successful or not.
    */
  def filter(aDescriptor: SeqEquiv[PropertyValue]): Boolean
}
object XFilter {
  
  inline def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XFilter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFilter]
  }
  
  extension [Self <: XFilter](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setFilter(value: SeqEquiv[PropertyValue] => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
  }
}
