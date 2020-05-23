package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Indexes = Indexes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIndexes = js.Any.fromFunction0(getIndexes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIndexesSupplier]
  }
}

