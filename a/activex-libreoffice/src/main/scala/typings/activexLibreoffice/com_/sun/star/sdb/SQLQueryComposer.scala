package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.sdbcx.XColumnsSupplier
import typings.activexLibreoffice.com_.sun.star.sdbcx.XTablesSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a tool for composing SQL select statements.
  *
  * It hides the complexity of parsing and evaluating SQL Statements and provides sophisticated methods for expanding a SQL-Statement with filter and
  * order criteria.
  */
@js.native
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
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], ComposedQuery = ComposedQuery.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendFilterByColumn = js.Any.fromFunction1(appendFilterByColumn), appendOrderByColumn = js.Any.fromFunction2(appendOrderByColumn), getColumns = js.Any.fromFunction0(getColumns), getComposedQuery = js.Any.fromFunction0(getComposedQuery), getFilter = js.Any.fromFunction0(getFilter), getOrder = js.Any.fromFunction0(getOrder), getQuery = js.Any.fromFunction0(getQuery), getStructuredFilter = js.Any.fromFunction0(getStructuredFilter), getTables = js.Any.fromFunction0(getTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilter = js.Any.fromFunction1(setFilter), setOrder = js.Any.fromFunction1(setOrder), setQuery = js.Any.fromFunction1(setQuery))
    __obj.asInstanceOf[SQLQueryComposer]
  }
}
