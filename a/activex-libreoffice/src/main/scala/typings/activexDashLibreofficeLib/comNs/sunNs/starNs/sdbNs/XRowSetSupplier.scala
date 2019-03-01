package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * uses a row set as datasource.
  * @see XRowSetChangeBroadcaster
  */
trait XRowSetSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  var RowSet: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  def getRowSet(): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet
  /**
    * sets the data source.
    * @param xDataSource the {@link RowSet} object to set
    */
  def setRowSet(xDataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet): scala.Unit
}

object XRowSetSupplier {
  @scala.inline
  def apply(
    RowSet: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet,
    acquire: js.Function0[scala.Unit],
    getRowSet: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setRowSet: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet, scala.Unit]
  ): XRowSetSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RowSet")(RowSet)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getRowSet")(getRowSet)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setRowSet")(setRowSet)
    __obj.asInstanceOf[XRowSetSupplier]
  }
}

