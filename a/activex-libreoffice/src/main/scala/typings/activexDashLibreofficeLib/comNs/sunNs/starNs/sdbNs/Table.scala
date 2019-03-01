package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the service {@link com.sun.star.sdbcx.Table} with additional display information, sorting, and filtering criteria. */
trait Table
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.Table
     with DataSettings {
  /**
    * indicates the privileges for the table.
    * @see com.sun.star.sdbcx.Privilege
    */
  var Privileges: scala.Double
}

object Table {
  @scala.inline
  def apply(
    ApplyFilter: scala.Boolean,
    CatalogName: java.lang.String,
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Description: java.lang.String,
    Filter: java.lang.String,
    FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    GroupBy: java.lang.String,
    HavingClause: java.lang.String,
    Indexes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Keys: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Name: java.lang.String,
    Order: java.lang.String,
    Privileges: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RowHeight: scala.Double,
    SchemaName: java.lang.String,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApplyFilter")(ApplyFilter)
    __obj.updateDynamic("CatalogName")(CatalogName)
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Filter")(Filter)
    __obj.updateDynamic("FontDescriptor")(FontDescriptor)
    __obj.updateDynamic("GroupBy")(GroupBy)
    __obj.updateDynamic("HavingClause")(HavingClause)
    __obj.updateDynamic("Indexes")(Indexes)
    __obj.updateDynamic("Keys")(Keys)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Order")(Order)
    __obj.updateDynamic("Privileges")(Privileges)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RowHeight")(RowHeight)
    __obj.updateDynamic("SchemaName")(SchemaName)
    __obj.updateDynamic("TextColor")(TextColor)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("alterColumnByIndex")(alterColumnByIndex)
    __obj.updateDynamic("alterColumnByName")(alterColumnByName)
    __obj.updateDynamic("createDataDescriptor")(createDataDescriptor)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getIndexes")(getIndexes)
    __obj.updateDynamic("getKeys")(getKeys)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("rename")(rename)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[Table]
  }
}

