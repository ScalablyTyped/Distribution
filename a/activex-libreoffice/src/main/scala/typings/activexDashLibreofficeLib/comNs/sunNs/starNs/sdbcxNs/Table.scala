package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to specify a table in a database. A table is described by its name and one or more columns.
  *
  * In addition, it may contain indexes to improve the performance in the retrieval of the table's data and keys, and to define semantic rules for the
  * table.
  *
  * ** Note: ** All properties and columns of a table could by modified before it is appended to a database. In that case, the service is in fact a
  * descriptor. On existing tables, a user might alter columns, add or delete columns, indexes, and keys depending on the capabilities of the database and
  * on the user's privileges.
  * @see com.sun.star.sdbc.XDatabaseMetaData
  * @see com.sun.star.sdbcx.Privilege
  */
trait Table
  extends XDataDescriptorFactory
     with XColumnsSupplier
     with XIndexesSupplier
     with XKeysSupplier
     with XRename
     with XAlterTable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is the name of the table catalog. */
  var CatalogName: java.lang.String
  /** supplies a comment on the table. Could be empty, if not supported by the driver. */
  var Description: java.lang.String
  /** is the name of the table. */
  var Name: java.lang.String
  /** is the name of the table schema. */
  var SchemaName: java.lang.String
  /** indicates the type of the table like (TABLE, VIEW, SYSTEM TABLE). Could be empty, if not supported by the driver. */
  var Type: java.lang.String
}

object Table {
  @scala.inline
  def apply(
    CatalogName: java.lang.String,
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Description: java.lang.String,
    Indexes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Keys: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SchemaName: java.lang.String,
    Type: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    alterColumnByIndex: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Unit
    ],
    alterColumnByName: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Unit
    ],
    createDataDescriptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getIndexes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getKeys: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    rename: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): Table = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName, Columns = Columns, Description = Description, Indexes = Indexes, Keys = Keys, Name = Name, PropertySetInfo = PropertySetInfo, SchemaName = SchemaName, Type = Type, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, alterColumnByIndex = alterColumnByIndex, alterColumnByName = alterColumnByName, createDataDescriptor = createDataDescriptor, getColumns = getColumns, getIndexes = getIndexes, getKeys = getKeys, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, rename = rename, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Table]
  }
}

