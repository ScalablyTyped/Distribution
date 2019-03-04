package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XTablesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier
     with XParametersSupplier

object SingleSelectQueryAnalyzer {
  @scala.inline
  def apply(
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    Filter: java.lang.String,
    Group: java.lang.String,
    GroupColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    HavingClause: java.lang.String,
    Order: java.lang.String,
    OrderColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Query: java.lang.String,
    QueryWithSubstitution: java.lang.String,
    StructuredFilter: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    StructuredHavingClause: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getFilter: js.Function0[java.lang.String],
    getGroup: js.Function0[java.lang.String],
    getGroupColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getHavingClause: js.Function0[java.lang.String],
    getOrder: js.Function0[java.lang.String],
    getOrderColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getParameters: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getQuery: js.Function0[java.lang.String],
    getQueryWithSubstitution: js.Function0[java.lang.String],
    getStructuredFilter: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    getStructuredHavingClause: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    getTables: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCommand: js.Function2[java.lang.String, scala.Double, scala.Unit],
    setQuery: js.Function1[java.lang.String, scala.Unit]
  ): SingleSelectQueryAnalyzer = {
    val __obj = js.Dynamic.literal(Columns = Columns, Filter = Filter, Group = Group, GroupColumns = GroupColumns, HavingClause = HavingClause, Order = Order, OrderColumns = OrderColumns, Parameters = Parameters, Query = Query, QueryWithSubstitution = QueryWithSubstitution, StructuredFilter = StructuredFilter, StructuredHavingClause = StructuredHavingClause, Tables = Tables, acquire = acquire, getColumns = getColumns, getFilter = getFilter, getGroup = getGroup, getGroupColumns = getGroupColumns, getHavingClause = getHavingClause, getOrder = getOrder, getOrderColumns = getOrderColumns, getParameters = getParameters, getQuery = getQuery, getQueryWithSubstitution = getQueryWithSubstitution, getStructuredFilter = getStructuredFilter, getStructuredHavingClause = getStructuredHavingClause, getTables = getTables, queryInterface = queryInterface, release = release, setCommand = setCommand, setQuery = setQuery)
  
    __obj.asInstanceOf[SingleSelectQueryAnalyzer]
  }
}

