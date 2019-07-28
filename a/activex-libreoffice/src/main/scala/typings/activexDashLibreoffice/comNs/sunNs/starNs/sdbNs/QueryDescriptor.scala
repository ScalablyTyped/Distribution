package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.Descriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XDataDescriptorFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
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
  extends Descriptor
     with XDataDescriptorFactory
     with DataSettings
     with XColumnsSupplier {
  /** is the command of the query, this is typically a select statement. */
  var Command: String
  /** should we use escape processing for the query. */
  var EscapeProcessing: Boolean
  /** is the name of the update table catalog. */
  var UpdateCatalogName: String
  /** is the name of the update table schema. */
  var UpdateSchemaName: String
  /** is the name of the table which should be updated. This is usually used for queries which relate on more than one table. */
  var UpdateTableName: String
}

object QueryDescriptor {
  @scala.inline
  def apply(
    ApplyFilter: Boolean,
    Columns: XNameAccess,
    Command: String,
    EscapeProcessing: Boolean,
    Filter: String,
    FontDescriptor: FontDescriptor,
    GroupBy: String,
    HavingClause: String,
    Name: String,
    Order: String,
    PropertySetInfo: XPropertySetInfo,
    RowHeight: Double,
    TextColor: Color,
    UpdateCatalogName: String,
    UpdateSchemaName: String,
    UpdateTableName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    getColumns: () => XNameAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): QueryDescriptor = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter, Columns = Columns, Command = Command, EscapeProcessing = EscapeProcessing, Filter = Filter, FontDescriptor = FontDescriptor, GroupBy = GroupBy, HavingClause = HavingClause, Name = Name, Order = Order, PropertySetInfo = PropertySetInfo, RowHeight = RowHeight, TextColor = TextColor, UpdateCatalogName = UpdateCatalogName, UpdateSchemaName = UpdateSchemaName, UpdateTableName = UpdateTableName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), getColumns = js.Any.fromFunction0(getColumns), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[QueryDescriptor]
  }
}

