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

