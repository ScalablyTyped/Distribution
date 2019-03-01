package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of tables, typically used for a database definition object. */
trait XTablesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of tables.
    * @returns the tables
    */
  val Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of tables.
    * @returns the tables
    */
  def getTables(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XTablesSupplier {
  @scala.inline
  def apply(
    Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getTables: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTablesSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Tables")(Tables)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getTables")(getTables)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTablesSupplier]
  }
}

