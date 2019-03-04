package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stored definition of a SQL query.
  *
  * It can be used if there is a need to execute SQL statements more than once, or if you want to format the query result fields differently from the
  * underlying table definitions.
  */
trait Query
  extends XQueryDefinition
     with DataSettings
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XDataDescriptorFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XRename
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier

object Query {
  @scala.inline
  def apply(
    ApplyFilter: scala.Boolean,
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    ContentType: java.lang.String,
    Filter: java.lang.String,
    FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    GroupBy: java.lang.String,
    HavingClause: java.lang.String,
    Identifier: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentIdentifier,
    Order: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RowHeight: scala.Double,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    acquire: js.Function0[scala.Unit],
    addContentEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentEventListener, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
    dispose: js.Function0[scala.Unit],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getContentType: js.Function0[java.lang.String],
    getIdentifier: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentIdentifier],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeContentEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContentEventListener, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
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
  ): Query = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter, Columns = Columns, ContentType = ContentType, Filter = Filter, FontDescriptor = FontDescriptor, GroupBy = GroupBy, HavingClause = HavingClause, Identifier = Identifier, Order = Order, PropertySetInfo = PropertySetInfo, RowHeight = RowHeight, TextColor = TextColor, acquire = acquire, addContentEventListener = addContentEventListener, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDataDescriptor = createDataDescriptor, dispose = dispose, getColumns = getColumns, getContentType = getContentType, getIdentifier = getIdentifier, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removeContentEventListener = removeContentEventListener, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, rename = rename, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Query]
  }
}

