package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.sdbcx.XColumnsSupplier
import typings.activexLibreoffice.com_.sun.star.sdbcx.XTablesSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a service for composing a single select statement.
  *
  * It hides the complexity of parsing and evaluating a single select statement and provides sophisticated methods for expanding a statement with filter,
  * group by, having and order criteria. To get the new extended statement use the methods from {@link com.sun.star.sdb.SingleSelectQueryAnalyzer} .
  *
  * A {@link SingleSelectQueryComposer} is usually obtained from a {@link Connection} using the {@link com.sun.star.lang.XMultiServiceFactory} interface.
  */
@js.native
trait SingleSelectQueryComposer
  extends XSingleSelectQueryComposer
     with XPropertySet
     with XTablesSupplier
     with XColumnsSupplier
     with XParametersSupplier {
  /** is the original SQL statement set with the interface {@link com.sun.star.sdb.XSingleSelectQueryAnalyzer} . */
  var Original: String = js.native
}

object SingleSelectQueryComposer {
  @scala.inline
  def apply(
    Columns: XNameAccess,
    ElementaryQuery: String,
    Filter: String,
    Group: String,
    GroupColumns: XIndexAccess,
    HavingClause: String,
    Order: String,
    OrderColumns: XIndexAccess,
    Original: String,
    Parameters: XIndexAccess,
    PropertySetInfo: XPropertySetInfo,
    Query: String,
    QueryWithSubstitution: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    StructuredHavingClause: SafeArray[SafeArray[PropertyValue]],
    Tables: XNameAccess,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    appendFilterByColumn: (XPropertySet, Boolean, Double) => Unit,
    appendGroupByColumn: XPropertySet => Unit,
    appendHavingClauseByColumn: (XPropertySet, Boolean, Double) => Unit,
    appendOrderByColumn: (XPropertySet, Boolean) => Unit,
    getColumns: () => XNameAccess,
    getFilter: () => String,
    getGroup: () => String,
    getGroupColumns: () => XIndexAccess,
    getHavingClause: () => String,
    getOrder: () => String,
    getOrderColumns: () => XIndexAccess,
    getParameters: () => XIndexAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getQuery: () => String,
    getQueryWithSubstitution: () => String,
    getStructuredFilter: () => SafeArray[SafeArray[PropertyValue]],
    getStructuredHavingClause: () => SafeArray[SafeArray[PropertyValue]],
    getTables: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setCommand: (String, Double) => Unit,
    setFilter: String => Unit,
    setGroup: String => Unit,
    setHavingClause: String => Unit,
    setOrder: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setQuery: String => Unit,
    setStructuredFilter: SeqEquiv[SeqEquiv[PropertyValue]] => Unit,
    setStructuredHavingClause: SeqEquiv[SeqEquiv[PropertyValue]] => Unit
  ): SingleSelectQueryComposer = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], ElementaryQuery = ElementaryQuery.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupColumns = GroupColumns.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], OrderColumns = OrderColumns.asInstanceOf[js.Any], Original = Original.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], QueryWithSubstitution = QueryWithSubstitution.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], StructuredHavingClause = StructuredHavingClause.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), appendFilterByColumn = js.Any.fromFunction3(appendFilterByColumn), appendGroupByColumn = js.Any.fromFunction1(appendGroupByColumn), appendHavingClauseByColumn = js.Any.fromFunction3(appendHavingClauseByColumn), appendOrderByColumn = js.Any.fromFunction2(appendOrderByColumn), getColumns = js.Any.fromFunction0(getColumns), getFilter = js.Any.fromFunction0(getFilter), getGroup = js.Any.fromFunction0(getGroup), getGroupColumns = js.Any.fromFunction0(getGroupColumns), getHavingClause = js.Any.fromFunction0(getHavingClause), getOrder = js.Any.fromFunction0(getOrder), getOrderColumns = js.Any.fromFunction0(getOrderColumns), getParameters = js.Any.fromFunction0(getParameters), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getQuery = js.Any.fromFunction0(getQuery), getQueryWithSubstitution = js.Any.fromFunction0(getQueryWithSubstitution), getStructuredFilter = js.Any.fromFunction0(getStructuredFilter), getStructuredHavingClause = js.Any.fromFunction0(getStructuredHavingClause), getTables = js.Any.fromFunction0(getTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setCommand = js.Any.fromFunction2(setCommand), setFilter = js.Any.fromFunction1(setFilter), setGroup = js.Any.fromFunction1(setGroup), setHavingClause = js.Any.fromFunction1(setHavingClause), setOrder = js.Any.fromFunction1(setOrder), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setQuery = js.Any.fromFunction1(setQuery), setStructuredFilter = js.Any.fromFunction1(setStructuredFilter), setStructuredHavingClause = js.Any.fromFunction1(setStructuredHavingClause))
    __obj.asInstanceOf[SingleSelectQueryComposer]
  }
  @scala.inline
  implicit class SingleSelectQueryComposerOps[Self <: SingleSelectQueryComposer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginal(value: String): Self = this.set("Original", value.asInstanceOf[js.Any])
  }
  
}

