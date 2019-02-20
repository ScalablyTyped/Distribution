package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to connect a document with an {@link ExportFilter}
  *
  * An {@link ExportFilter} must know the source of his filter operation. To set this on a filter is part of this interface. Same mechanism exist for
  * import too.
  * @see ExportFilter
  * @see ImportFilter
  * @see XImporter
  */
trait XExporter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * sets the source document for the exporter
    * @param Document the source document
    * @throws com::sun::star::lang::IllegalArgumentException if **Document** does not support any service which is supported by this exporter
    */
  def setSourceDocument(Document: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent): scala.Unit
}

