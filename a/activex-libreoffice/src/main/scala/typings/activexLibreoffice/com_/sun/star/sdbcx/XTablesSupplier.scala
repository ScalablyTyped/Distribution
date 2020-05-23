package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of tables, typically used for a database definition object. */
trait XTablesSupplier extends XInterface {
  /**
    * returns the container of tables.
    * @returns the tables
    */
  val Tables: XNameAccess
  /**
    * returns the container of tables.
    * @returns the tables
    */
  def getTables(): XNameAccess
}

object XTablesSupplier {
  @scala.inline
  def apply(
    Tables: XNameAccess,
    acquire: () => Unit,
    getTables: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTablesSupplier = {
    val __obj = js.Dynamic.literal(Tables = Tables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTables = js.Any.fromFunction0(getTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTablesSupplier]
  }
}

