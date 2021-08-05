package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter for exporting Basic macros to the OpenOffice.org file format.
  *
  * First the {@link XExporter.setSourceDocument()} method must be called in order to provide the export component with the source document from which the
  * data should be exported. After that, the export is started by calling the {@link XFilter.filter()} method.
  * @since OOo 2.0
  */
trait XMLBasicExporter
  extends StObject
     with XXMLBasicExporter {
  
  def createWithHandler(DocumentHandler: XDocumentHandler): Unit
}
object XMLBasicExporter {
  
  inline def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    createWithHandler: XDocumentHandler => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSourceDocument: XComponent => Unit
  ): XMLBasicExporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), createWithHandler = js.Any.fromFunction1(createWithHandler), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSourceDocument = js.Any.fromFunction1(setSourceDocument))
    __obj.asInstanceOf[XMLBasicExporter]
  }
  
  extension [Self <: XMLBasicExporter](x: Self) {
    
    inline def setCreateWithHandler(value: XDocumentHandler => Unit): Self = StObject.set(x, "createWithHandler", js.Any.fromFunction1(value))
  }
}
