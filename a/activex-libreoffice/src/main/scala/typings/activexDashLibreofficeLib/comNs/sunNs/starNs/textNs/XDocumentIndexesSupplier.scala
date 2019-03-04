package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the collection of document indexes.
  *
  * In general this interface is supported by a {@link TextDocument} .
  */
trait XDocumentIndexesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the collection of "DocumentIndexes" currently contained in the object. */
  val DocumentIndexes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** @returns the collection of "DocumentIndexes" currently contained in the object. */
  def getDocumentIndexes(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XDocumentIndexesSupplier {
  @scala.inline
  def apply(
    DocumentIndexes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: js.Function0[scala.Unit],
    getDocumentIndexes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDocumentIndexesSupplier = {
    val __obj = js.Dynamic.literal(DocumentIndexes = DocumentIndexes, acquire = acquire, getDocumentIndexes = getDocumentIndexes, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDocumentIndexesSupplier]
  }
}

