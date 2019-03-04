package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stored definition of a SQL "Select statement".
  *
  * It can be used, if there is a need to execute SQL statement more than once or if you want to format the query result fields different from the
  * underlying table definitions.
  */
trait QueryDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Descriptor
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XDataDescriptorFactory
     with DataSettings
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier {
  /** is the command of the query, this is typically a select statement. */
  var Command: java.lang.String
  /** should we use escape processing for the query. */
  var EscapeProcessing: scala.Boolean
  /** is the name of the update table catalog. */
  var UpdateCatalogName: java.lang.String
  /** is the name of the update table schema. */
  var UpdateSchemaName: java.lang.String
  /** is the name of the table which should be updated. This is usually used for queries which relate on more than one table. */
  var UpdateTableName: java.lang.String
}

object QueryDescriptor {
  @scala.inline
  def apply(
    ApplyFilter: scala.Boolean,
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Command: java.lang.String,
    EscapeProcessing: scala.Boolean,
    Filter: java.lang.String,
    FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    GroupBy: java.lang.String,
    HavingClause: java.lang.String,
    Name: java.lang.String,
    Order: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RowHeight: scala.Double,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    UpdateCatalogName: java.lang.String,
    UpdateSchemaName: java.lang.String,
    UpdateTableName: java.lang.String,
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
    createDataDescriptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): QueryDescriptor = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter, Columns = Columns, Command = Command, EscapeProcessing = EscapeProcessing, Filter = Filter, FontDescriptor = FontDescriptor, GroupBy = GroupBy, HavingClause = HavingClause, Name = Name, Order = Order, PropertySetInfo = PropertySetInfo, RowHeight = RowHeight, TextColor = TextColor, UpdateCatalogName = UpdateCatalogName, UpdateSchemaName = UpdateSchemaName, UpdateTableName = UpdateTableName, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDataDescriptor = createDataDescriptor, getColumns = getColumns, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[QueryDescriptor]
  }
}

