package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
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
     with XPropertySet {
  /** is the name of the table catalog. */
  var CatalogName: String
  /** supplies a comment on the table. Could be empty, if not supported by the driver. */
  var Description: String
  /** is the name of the table. */
  var Name: String
  /** is the name of the table schema. */
  var SchemaName: String
  /** indicates the type of the table like (TABLE, VIEW, SYSTEM TABLE). Could be empty, if not supported by the driver. */
  var Type: String
}

object Table {
  @scala.inline
  def apply(
    CatalogName: String,
    Columns: XNameAccess,
    Description: String,
    Indexes: XNameAccess,
    Keys: XIndexAccess,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    SchemaName: String,
    Type: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    alterColumnByIndex: (Double, XPropertySet) => Unit,
    alterColumnByName: (String, XPropertySet) => Unit,
    createDataDescriptor: () => XPropertySet,
    getColumns: () => XNameAccess,
    getIndexes: () => XNameAccess,
    getKeys: () => XIndexAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rename: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Table = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName, Columns = Columns, Description = Description, Indexes = Indexes, Keys = Keys, Name = Name, PropertySetInfo = PropertySetInfo, SchemaName = SchemaName, Type = Type, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), alterColumnByIndex = js.Any.fromFunction2(alterColumnByIndex), alterColumnByName = js.Any.fromFunction2(alterColumnByName), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getColumns = js.Any.fromFunction0(getColumns), getIndexes = js.Any.fromFunction0(getIndexes), getKeys = js.Any.fromFunction0(getKeys), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rename = js.Any.fromFunction1(rename), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Table]
  }
}

