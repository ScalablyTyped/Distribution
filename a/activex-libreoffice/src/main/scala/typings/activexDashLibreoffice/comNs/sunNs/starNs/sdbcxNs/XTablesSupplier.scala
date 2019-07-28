package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(Tables = Tables, acquire = js.Any.fromFunction0(acquire), getTables = js.Any.fromFunction0(getTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTablesSupplier]
  }
}

