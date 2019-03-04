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
    acquire: js.Function0[scala.Unit],
    getIndexes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIndexesSupplier = {
    val __obj = js.Dynamic.literal(Indexes = Indexes, acquire = acquire, getIndexes = getIndexes, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XIndexesSupplier]
  }
}

