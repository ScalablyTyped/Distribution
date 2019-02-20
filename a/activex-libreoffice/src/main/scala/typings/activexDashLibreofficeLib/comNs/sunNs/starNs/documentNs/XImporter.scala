package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to connect a document with an {@link ImportFilter}
  *
  * An {@link ImportFilter} must know the target of his filter operation. To set this on a filter is part of this interface. Same mechanism exist for
  * export too.
  * @see ExportFilter
  * @see ImportFilter
  * @see XExporter
  */
trait XImporter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * sets the target document for the importer
    * @param Document the target document
    * @throws com::sun::star::lang::IllegalArgumentException if **Document** does not support any service which is supported by this importer
    */
  def setTargetDocument(Document: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent): scala.Unit
}

