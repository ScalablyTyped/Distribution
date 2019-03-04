package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

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
trait XMLOasisBasicExporter extends XXMLBasicExporter {
  def createWithHandler(DocumentHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler): scala.Unit
}

object XMLOasisBasicExporter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    createWithHandler: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      scala.Unit
    ],
    filter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setSourceDocument: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, scala.Unit]
  ): XMLOasisBasicExporter = {
    val __obj = js.Dynamic.literal(acquire = acquire, cancel = cancel, createWithHandler = createWithHandler, filter = filter, queryInterface = queryInterface, release = release, setSourceDocument = setSourceDocument)
  
    __obj.asInstanceOf[XMLOasisBasicExporter]
  }
}

