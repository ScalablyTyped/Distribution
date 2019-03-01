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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApplyFilter")(ApplyFilter)
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("Command")(Command)
    __obj.updateDynamic("EscapeProcessing")(EscapeProcessing)
    __obj.updateDynamic("Filter")(Filter)
    __obj.updateDynamic("FontDescriptor")(FontDescriptor)
    __obj.updateDynamic("GroupBy")(GroupBy)
    __obj.updateDynamic("HavingClause")(HavingClause)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Order")(Order)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RowHeight")(RowHeight)
    __obj.updateDynamic("TextColor")(TextColor)
    __obj.updateDynamic("UpdateCatalogName")(UpdateCatalogName)
    __obj.updateDynamic("UpdateSchemaName")(UpdateSchemaName)
    __obj.updateDynamic("UpdateTableName")(UpdateTableName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createDataDescriptor")(createDataDescriptor)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[QueryDescriptor]
  }
}

