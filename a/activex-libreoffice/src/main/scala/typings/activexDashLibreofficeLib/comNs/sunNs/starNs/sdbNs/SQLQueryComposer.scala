package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a tool for composing SQL select statements.
  *
  * It hides the complexity of parsing and evaluating SQL Statements and provides sophisticated methods for expanding a SQL-Statement with filter and
  * order criteria.
  */
trait SQLQueryComposer
  extends XSQLQueryComposer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XTablesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier

object SQLQueryComposer {
  @scala.inline
  def apply(
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    ComposedQuery: java.lang.String,
    Filter: java.lang.String,
    Order: java.lang.String,
    Query: java.lang.String,
    StructuredFilter: activexDashInteropLib.SafeArray[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    appendFilterByColumn: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit],
    appendOrderByColumn: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Boolean, 
      scala.Unit
    ],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    getComposedQuery: js.Function0[java.lang.String],
    getFilter: js.Function0[java.lang.String],
    getOrder: js.Function0[java.lang.String],
    getQuery: js.Function0[java.lang.String],
    getStructuredFilter: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ]
    ],
    getTables: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFilter: js.Function1[java.lang.String, scala.Unit],
    setOrder: js.Function1[java.lang.String, scala.Unit],
    setQuery: js.Function1[java.lang.String, scala.Unit]
  ): SQLQueryComposer = {
    val __obj = js.Dynamic.literal(Columns = Columns, ComposedQuery = ComposedQuery, Filter = Filter, Order = Order, Query = Query, StructuredFilter = StructuredFilter, Tables = Tables, acquire = acquire, appendFilterByColumn = appendFilterByColumn, appendOrderByColumn = appendOrderByColumn, getColumns = getColumns, getComposedQuery = getComposedQuery, getFilter = getFilter, getOrder = getOrder, getQuery = getQuery, getStructuredFilter = getStructuredFilter, getTables = getTables, queryInterface = queryInterface, release = release, setFilter = setFilter, setOrder = setOrder, setQuery = setQuery)
  
    __obj.asInstanceOf[SQLQueryComposer]
  }
}

