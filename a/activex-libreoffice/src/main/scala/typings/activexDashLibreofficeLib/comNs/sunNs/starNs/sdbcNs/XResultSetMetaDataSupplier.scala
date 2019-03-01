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
    acquire: js.Function0[scala.Unit],
    getMetaData: js.Function0[XResultSetMetaData],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XResultSetMetaDataSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MetaData")(MetaData)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMetaData")(getMetaData)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XResultSetMetaDataSupplier]
  }
}

