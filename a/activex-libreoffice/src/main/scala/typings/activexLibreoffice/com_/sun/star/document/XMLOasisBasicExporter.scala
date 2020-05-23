package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter for exporting Basic macros to the OASIS Open Office file format.
  *
  * First the {@link XExporter.setSourceDocument()} method must be called in order to provide the export component with the source document from which the
  * data should be exported. After that, the export is started by calling the {@link XFilter.filter()} method.
  * @since OOo 2.0
  */
trait XMLOasisBasicExporter
  extends XExporter
     with XFilter {
  def createWithHandler(DocumentHandler: XDocumentHandler): Unit
}

object XMLOasisBasicExporter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancel: () => Unit,
    createWithHandler: XDocumentHandler => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setSourceDocument: XComponent => Unit
  ): XMLOasisBasicExporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), createWithHandler = js.Any.fromFunction1(createWithHandler), filter = js.Any.fromFunction1(filter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setSourceDocument = js.Any.fromFunction1(setSourceDocument))
    __obj.asInstanceOf[XMLOasisBasicExporter]
  }
}

