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
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter, CatalogName = CatalogName, Columns = Columns, Description = Description, Filter = Filter, FontDescriptor = FontDescriptor, GroupBy = GroupBy, HavingClause = HavingClause, Indexes = Indexes, Keys = Keys, Name = Name, Order = Order, Privileges = Privileges, PropertySetInfo = PropertySetInfo, RowHeight = RowHeight, SchemaName = SchemaName, TextColor = TextColor, Type = Type, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, alterColumnByIndex = alterColumnByIndex, alterColumnByName = alterColumnByName, createDataDescriptor = createDataDescriptor, getColumns = getColumns, getIndexes = getIndexes, getKeys = getKeys, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, rename = rename, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Table]
  }
}

