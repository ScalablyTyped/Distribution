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

