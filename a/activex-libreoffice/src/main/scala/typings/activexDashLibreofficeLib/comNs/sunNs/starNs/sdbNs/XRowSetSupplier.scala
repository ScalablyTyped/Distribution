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
    acquire: () => scala.Unit,
    getRowSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setRowSet: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet => scala.Unit
  ): XRowSetSupplier = {
    val __obj = js.Dynamic.literal(RowSet = RowSet, acquire = js.Any.fromFunction0(acquire), getRowSet = js.Any.fromFunction0(getRowSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRowSet = js.Any.fromFunction1(setRowSet))
  
    __obj.asInstanceOf[XRowSetSupplier]
  }
}

