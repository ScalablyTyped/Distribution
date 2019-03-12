package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of indexes, typically used for a table definition object. */
trait XIndexesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of indexes.
    * @returns the indexes
    */
  val Indexes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of indexes.
    * @returns the indexes
    */
  def getIndexes(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XIndexesSupplier {
  @scala.inline
  def apply(
    Indexes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: () => scala.Unit,
    getIndexes: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XIndexesSupplier = {
    val __obj = js.Dynamic.literal(Indexes = Indexes, acquire = js.Any.fromFunction0(acquire), getIndexes = js.Any.fromFunction0(getIndexes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIndexesSupplier]
  }
}

