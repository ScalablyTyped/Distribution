package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of columns, typically used for tables and indexes. */
trait XColumnsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of columns.
    * @returns the columns
    */
  val Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of columns.
    * @returns the columns
    */
  def getColumns(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XColumnsSupplier {
  @scala.inline
  def apply(
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XColumnsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XColumnsSupplier]
  }
}

