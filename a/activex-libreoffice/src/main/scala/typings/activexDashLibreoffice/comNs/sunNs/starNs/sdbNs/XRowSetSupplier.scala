package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XRowSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * uses a row set as datasource.
  * @see XRowSetChangeBroadcaster
  */
trait XRowSetSupplier extends XInterface {
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  var RowSet: XRowSet
  /**
    * provides access to the data source.
    * @returns the {@link RowSet} object
    */
  def getRowSet(): XRowSet
  /**
    * sets the data source.
    * @param xDataSource the {@link RowSet} object to set
    */
  def setRowSet(xDataSource: XRowSet): Unit
}

object XRowSetSupplier {
  @scala.inline
  def apply(
    RowSet: XRowSet,
    acquire: () => Unit,
    getRowSet: () => XRowSet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setRowSet: XRowSet => Unit
  ): XRowSetSupplier = {
    val __obj = js.Dynamic.literal(RowSet = RowSet, acquire = js.Any.fromFunction0(acquire), getRowSet = js.Any.fromFunction0(getRowSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRowSet = js.Any.fromFunction1(setRowSet))
  
    __obj.asInstanceOf[XRowSetSupplier]
  }
}

