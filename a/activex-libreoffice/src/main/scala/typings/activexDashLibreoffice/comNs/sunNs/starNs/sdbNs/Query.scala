package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XDataDescriptorFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XRename
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs.XContentEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs.XContentIdentifier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
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
     with XDataDescriptorFactory
     with XRename
     with XColumnsSupplier

object Query {
  @scala.inline
  def apply(
    ApplyFilter: Boolean,
    Columns: XNameAccess,
    ContentType: String,
    Filter: String,
    FontDescriptor: FontDescriptor,
    GroupBy: String,
    HavingClause: String,
    Identifier: XContentIdentifier,
    Order: String,
    PropertySetInfo: XPropertySetInfo,
    RowHeight: Double,
    TextColor: Color,
    acquire: () => Unit,
    addContentEventListener: XContentEventListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDataDescriptor: () => XPropertySet,
    dispose: () => Unit,
    getColumns: () => XNameAccess,
    getContentType: () => String,
    getIdentifier: () => XContentIdentifier,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContentEventListener: XContentEventListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rename: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Query = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter, Columns = Columns, ContentType = ContentType, Filter = Filter, FontDescriptor = FontDescriptor, GroupBy = GroupBy, HavingClause = HavingClause, Identifier = Identifier, Order = Order, PropertySetInfo = PropertySetInfo, RowHeight = RowHeight, TextColor = TextColor, acquire = js.Any.fromFunction0(acquire), addContentEventListener = js.Any.fromFunction1(addContentEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), dispose = js.Any.fromFunction0(dispose), getColumns = js.Any.fromFunction0(getColumns), getContentType = js.Any.fromFunction0(getContentType), getIdentifier = js.Any.fromFunction0(getIdentifier), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContentEventListener = js.Any.fromFunction1(removeContentEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rename = js.Any.fromFunction1(rename), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Query]
  }
}

