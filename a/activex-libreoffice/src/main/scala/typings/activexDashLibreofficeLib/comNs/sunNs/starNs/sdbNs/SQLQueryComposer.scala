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
    StructuredFilter: stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    Tables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: () => scala.Unit,
    appendFilterByColumn: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet => scala.Unit,
    appendOrderByColumn: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Boolean) => scala.Unit,
    getColumns: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getComposedQuery: () => java.lang.String,
    getFilter: () => java.lang.String,
    getOrder: () => java.lang.String,
    getQuery: () => java.lang.String,
    getStructuredFilter: () => stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getTables: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFilter: java.lang.String => scala.Unit,
    setOrder: java.lang.String => scala.Unit,
    setQuery: java.lang.String => scala.Unit
  ): SQLQueryComposer = {
    val __obj = js.Dynamic.literal(Columns = Columns, ComposedQuery = ComposedQuery, Filter = Filter, Order = Order, Query = Query, StructuredFilter = StructuredFilter, Tables = Tables, acquire = js.Any.fromFunction0(acquire), appendFilterByColumn = js.Any.fromFunction1(appendFilterByColumn), appendOrderByColumn = js.Any.fromFunction2(appendOrderByColumn), getColumns = js.Any.fromFunction0(getColumns), getComposedQuery = js.Any.fromFunction0(getComposedQuery), getFilter = js.Any.fromFunction0(getFilter), getOrder = js.Any.fromFunction0(getOrder), getQuery = js.Any.fromFunction0(getQuery), getStructuredFilter = js.Any.fromFunction0(getStructuredFilter), getTables = js.Any.fromFunction0(getTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilter = js.Any.fromFunction1(setFilter), setOrder = js.Any.fromFunction1(setOrder), setQuery = js.Any.fromFunction1(setQuery))
  
    __obj.asInstanceOf[SQLQueryComposer]
  }
}

