package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XTablesSupplier
import typings.std.SafeArray
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
     with XTablesSupplier
     with XColumnsSupplier

object SQLQueryComposer {
  @scala.inline
  def apply(
    Columns: XNameAccess,
    ComposedQuery: String,
    Filter: String,
    Order: String,
    Query: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    Tables: XNameAccess,
    acquire: () => Unit,
    appendFilterByColumn: XPropertySet => Unit,
    appendOrderByColumn: (XPropertySet, Boolean) => Unit,
    getColumns: () => XNameAccess,
    getComposedQuery: () => String,
    getFilter: () => String,
    getOrder: () => String,
    getQuery: () => String,
    getStructuredFilter: () => SafeArray[SafeArray[PropertyValue]],
    getTables: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFilter: String => Unit,
    setOrder: String => Unit,
    setQuery: String => Unit
  ): SQLQueryComposer = {
    val __obj = js.Dynamic.literal(Columns = Columns, ComposedQuery = ComposedQuery, Filter = Filter, Order = Order, Query = Query, StructuredFilter = StructuredFilter, Tables = Tables, acquire = js.Any.fromFunction0(acquire), appendFilterByColumn = js.Any.fromFunction1(appendFilterByColumn), appendOrderByColumn = js.Any.fromFunction2(appendOrderByColumn), getColumns = js.Any.fromFunction0(getColumns), getComposedQuery = js.Any.fromFunction0(getComposedQuery), getFilter = js.Any.fromFunction0(getFilter), getOrder = js.Any.fromFunction0(getOrder), getQuery = js.Any.fromFunction0(getQuery), getStructuredFilter = js.Any.fromFunction0(getStructuredFilter), getTables = js.Any.fromFunction0(getTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilter = js.Any.fromFunction1(setFilter), setOrder = js.Any.fromFunction1(setOrder), setQuery = js.Any.fromFunction1(setQuery))
  
    __obj.asInstanceOf[SQLQueryComposer]
  }
}

