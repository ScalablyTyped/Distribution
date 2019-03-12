package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the meta data of a result set.
  *
  * The number, types, and properties of a {@link ResultSet} 's columns are provided by the {@link com.sun.star.sdbc.XResultSetMetaData} interface
  * returned by the {@link com.sun.star.sdbc.XResultSetMetaDataSupplier.getMetaData()} method.
  */
trait XResultSetMetaDataSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the number, types, and properties of a {@link ResultSet} 's columns.
    * @returns the meta data of the {@link ResultSet} .
    * @throws SQLException if a database access error occurs.
    */
  val MetaData: XResultSetMetaData
  /**
    * retrieves the number, types, and properties of a {@link ResultSet} 's columns.
    * @returns the meta data of the {@link ResultSet} .
    * @throws SQLException if a database access error occurs.
    */
  def getMetaData(): XResultSetMetaData
}

object XResultSetMetaDataSupplier {
  @scala.inline
  def apply(
    MetaData: XResultSetMetaData,
    acquire: () => scala.Unit,
    getMetaData: () => XResultSetMetaData,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XResultSetMetaDataSupplier = {
    val __obj = js.Dynamic.literal(MetaData = MetaData, acquire = js.Any.fromFunction0(acquire), getMetaData = js.Any.fromFunction0(getMetaData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XResultSetMetaDataSupplier]
  }
}

