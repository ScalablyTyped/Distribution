package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of indexes, typically used for a table definition object. */
trait XIndexesSupplier extends XInterface {
  /**
    * returns the container of indexes.
    * @returns the indexes
    */
  val Indexes: XNameAccess
  /**
    * returns the container of indexes.
    * @returns the indexes
    */
  def getIndexes(): XNameAccess
}

object XIndexesSupplier {
  @scala.inline
  def apply(
    Indexes: XNameAccess,
    acquire: () => Unit,
    getIndexes: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndexesSupplier = {
    val __obj = js.Dynamic.literal(Indexes = Indexes, acquire = js.Any.fromFunction0(acquire), getIndexes = js.Any.fromFunction0(getIndexes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIndexesSupplier]
  }
}

