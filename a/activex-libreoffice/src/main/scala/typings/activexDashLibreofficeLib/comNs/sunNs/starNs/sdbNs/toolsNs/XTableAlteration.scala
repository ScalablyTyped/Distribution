package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to alter a table.
  * @see com.sun.star.sdb.DataSource.Settings
  * @see com.sun.star.sdbcx.ColumnDescriptor
  * @see com.sun.star.sdbcx.XAlterTable
  * @see com.sun.star.sdbcx.XAppend
  * @see com.sun.star.sdbcx.XDrop
  * @since OOo 3.3
  */
trait XTableAlteration extends XConnectionSupplier {
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param table the table to be altered
    * @param descriptor the descriptor which should be serve to append a new object
    * @see com.sun.star.sdbcx.XAppend
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def addColumn(
    table: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    descriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  ): scala.Unit
  /**
    * alter the column defined by name
    * @param table the table to be altered
    * @param columnName the name of the column to be changed
    * @param columnDescriptor the column descriptor with the information of the new column definition
    * @see com.sun.star.sdbcx.XAlterTable
    * @throws com::sun::star::sdbc::SQLException
    */
  def alterColumnByName(
    table: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    columnName: java.lang.String,
    columnDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  ): scala.Unit
  /**
    * drops an object of the related container identified by its name.
    * @param table the table to be altered
    * @param columnName the name of the column to be dropped
    * @see com.sun.star.sdbcx.XDrop
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropColumn(
    table: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    columnName: java.lang.String
  ): scala.Unit
}

object XTableAlteration {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    acquire: () => scala.Unit,
    addColumn: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet) => scala.Unit,
    alterColumnByName: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet) => scala.Unit,
    dropColumn: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, java.lang.String) => scala.Unit,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTableAlteration = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, acquire = js.Any.fromFunction0(acquire), addColumn = js.Any.fromFunction2(addColumn), alterColumnByName = js.Any.fromFunction3(alterColumnByName), dropColumn = js.Any.fromFunction2(dropColumn), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTableAlteration]
  }
}

