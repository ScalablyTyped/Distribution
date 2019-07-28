package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XTablesSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a service for analyzing a single select statement.
  *
  * It hides the complexity of parsing and evaluating a single select statement and provides sophisticated methods for accessing a statements filter,
  * group by, having and order criteria, as well as the corresponding select columns and tables. If supported, it even gives access to the parameters.
  * @see com.sun.star.sdb.SingleSelectQueryComposer
  */
trait SingleSelectQueryAnalyzer
  extends XSingleSelectQueryAnalyzer
     with XTablesSupplier
     with XColumnsSupplier
     with XParametersSupplier

object SingleSelectQueryAnalyzer {
  @scala.inline
  def apply(
    Columns: XNameAccess,
    Filter: String,
    Group: String,
    GroupColumns: XIndexAccess,
    HavingClause: String,
    Order: String,
    OrderColumns: XIndexAccess,
    Parameters: XIndexAccess,
    Query: String,
    QueryWithSubstitution: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    StructuredHavingClause: SafeArray[SafeArray[PropertyValue]],
    Tables: XNameAccess,
    acquire: () => Unit,
    getColumns: () => XNameAccess,
    getFilter: () => String,
    getGroup: () => String,
    getGroupColumns: () => XIndexAccess,
    getHavingClause: () => String,
    getOrder: () => String,
    getOrderColumns: () => XIndexAccess,
    getParameters: () => XIndexAccess,
    getQuery: () => String,
    getQueryWithSubstitution: () => String,
    getStructuredFilter: () => SafeArray[SafeArray[PropertyValue]],
    getStructuredHavingClause: () => SafeArray[SafeArray[PropertyValue]],
    getTables: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCommand: (String, Double) => Unit,
    setQuery: String => Unit
  ): SingleSelectQueryAnalyzer = {
    val __obj = js.Dynamic.literal(Columns = Columns, Filter = Filter, Group = Group, GroupColumns = GroupColumns, HavingClause = HavingClause, Order = Order, OrderColumns = OrderColumns, Parameters = Parameters, Query = Query, QueryWithSubstitution = QueryWithSubstitution, StructuredFilter = StructuredFilter, StructuredHavingClause = StructuredHavingClause, Tables = Tables, acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), getFilter = js.Any.fromFunction0(getFilter), getGroup = js.Any.fromFunction0(getGroup), getGroupColumns = js.Any.fromFunction0(getGroupColumns), getHavingClause = js.Any.fromFunction0(getHavingClause), getOrder = js.Any.fromFunction0(getOrder), getOrderColumns = js.Any.fromFunction0(getOrderColumns), getParameters = js.Any.fromFunction0(getParameters), getQuery = js.Any.fromFunction0(getQuery), getQueryWithSubstitution = js.Any.fromFunction0(getQueryWithSubstitution), getStructuredFilter = js.Any.fromFunction0(getStructuredFilter), getStructuredHavingClause = js.Any.fromFunction0(getStructuredHavingClause), getTables = js.Any.fromFunction0(getTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCommand = js.Any.fromFunction2(setCommand), setQuery = js.Any.fromFunction1(setQuery))
  
    __obj.asInstanceOf[SingleSelectQueryAnalyzer]
  }
}

