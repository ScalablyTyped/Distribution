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

