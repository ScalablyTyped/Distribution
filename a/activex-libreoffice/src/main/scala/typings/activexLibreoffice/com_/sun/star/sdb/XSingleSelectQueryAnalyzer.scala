package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * simplifies the analyzing of single select statements.
  *
  * The interface can be used for analyzing single SELECT statements without knowing the structure of the used query.
  */
trait XSingleSelectQueryAnalyzer extends XInterface {
  /**
    * returns the used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  val Filter: String
  /**
    * returns the currently used GROUP BY.
    *
    * The group criteria returned is part of the GROUP BY clause of the select command, but it does not contain the GROUP BY keyword .
    * @returns the group
    */
  val Group: String
  /**
    * returns the currently used group.
    *
    * The columns returned form the GROUP BY clause.
    * @returns a collection of com::sun::star::sdb::GroupColumn which form the GROUP BY.
    */
  val GroupColumns: XIndexAccess
  /**
    * returns the used HAVING filter.
    *
    * The HAVING filter criteria returned is part of the HAVING condition of the select command, but it does not contain the HAVING token.
    * @returns the filter
    */
  val HavingClause: String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  val Order: String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns a collection of {@link com.sun.star.sdb.OrderColumn} which form the ORDER BY.
    */
  val OrderColumns: XIndexAccess
  /**
    * returns the query.
    * @returns the query
    */
  var Query: String
  /**
    * returns the query previously set at the analyzer, with all application-level features being substituted by their database-level counterparts.
    *
    * The {@link XSingleSelectQueryAnalyzer} is an application-level component, which in some respect understands SQL features usually not present at the
    * database level. As a prominent example, you might pass a `SELECT` statement to the analyzer which is based on another query.
    *
    * While all other methods will handle those additional features transparently - e.g. the query in the `FROM` part of a `SELECT` statement will be
    * handled as if it really is a table -, `getQueryWithSubstitution` gives you the SQL statement where all those features have been stripped, and replaced
    * with appropriate standard SQL.
    *
    * For example, consider a database document which contains a client-side query named `All Orders` . This query is not known to the underlying database,
    * so an SQL statement like `SELECT * from "All Orders"` would be rejected by the database. However, instantiating a {@link SingleSelectQueryAnalyzer} at
    * the {@link Connection} object, and passing it the above query, you can then use `getQueryWithSubstitution` to retrieve a statement where `"All
    * Orders"` has been replaced with the `SELECT` statement which actually constitutes the `"All Orders"` query.
    * @see Connection
    * @see XQueriesSupplier
    * @see DatabaseDocument
    * @since OOo 2.0.4
    * @throws com::sun::star::sdbc::SQLException if the query represented cannot be completely substituted. A usual case for this is a recursion in the sub que
    */
  val QueryWithSubstitution: String
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured filter
    */
  val StructuredFilter: SafeArray[SafeArray[PropertyValue]]
  /**
    * returns the currently used HAVING filter.
    *
    * The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria
    * with the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured HAVING filter
    */
  val StructuredHavingClause: SafeArray[SafeArray[PropertyValue]]
  /**
    * returns the used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  def getFilter(): String
  /**
    * returns the currently used GROUP BY.
    *
    * The group criteria returned is part of the GROUP BY clause of the select command, but it does not contain the GROUP BY keyword .
    * @returns the group
    */
  def getGroup(): String
  /**
    * returns the currently used group.
    *
    * The columns returned form the GROUP BY clause.
    * @returns a collection of com::sun::star::sdb::GroupColumn which form the GROUP BY.
    */
  def getGroupColumns(): XIndexAccess
  /**
    * returns the used HAVING filter.
    *
    * The HAVING filter criteria returned is part of the HAVING condition of the select command, but it does not contain the HAVING token.
    * @returns the filter
    */
  def getHavingClause(): String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  def getOrder(): String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns a collection of {@link com.sun.star.sdb.OrderColumn} which form the ORDER BY.
    */
  def getOrderColumns(): XIndexAccess
  /**
    * returns the query.
    * @returns the query
    */
  def getQuery(): String
  /**
    * returns the query previously set at the analyzer, with all application-level features being substituted by their database-level counterparts.
    *
    * The {@link XSingleSelectQueryAnalyzer} is an application-level component, which in some respect understands SQL features usually not present at the
    * database level. As a prominent example, you might pass a `SELECT` statement to the analyzer which is based on another query.
    *
    * While all other methods will handle those additional features transparently - e.g. the query in the `FROM` part of a `SELECT` statement will be
    * handled as if it really is a table -, `getQueryWithSubstitution` gives you the SQL statement where all those features have been stripped, and replaced
    * with appropriate standard SQL.
    *
    * For example, consider a database document which contains a client-side query named `All Orders` . This query is not known to the underlying database,
    * so an SQL statement like `SELECT * from "All Orders"` would be rejected by the database. However, instantiating a {@link SingleSelectQueryAnalyzer} at
    * the {@link Connection} object, and passing it the above query, you can then use `getQueryWithSubstitution` to retrieve a statement where `"All
    * Orders"` has been replaced with the `SELECT` statement which actually constitutes the `"All Orders"` query.
    * @see Connection
    * @see XQueriesSupplier
    * @see DatabaseDocument
    * @since OOo 2.0.4
    * @throws com::sun::star::sdbc::SQLException if the query represented cannot be completely substituted. A usual case for this is a recursion in the sub que
    */
  def getQueryWithSubstitution(): String
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured filter
    */
  def getStructuredFilter(): SafeArray[SafeArray[PropertyValue]]
  /**
    * returns the currently used HAVING filter.
    *
    * The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria
    * with the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured HAVING filter
    */
  def getStructuredHavingClause(): SafeArray[SafeArray[PropertyValue]]
  /**
    * sets a new query for the composer, which may be expanded by filters, group by, having and sort criteria.
    * @param Command is the command which should be executed, the type of command depends on the {@link CommandType} .  In case of a `CommandType` of {@link c
    * @param CommandType is the type of the command.
    * @see com.sun.star.sdb.CommandType
    * @see com.sun.star.sdbc.RowSet.EscapeProcessing
    * @see com.sun.star.sdb.CommandType
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't a single select statement or the statement isn't vali
    */
  def setCommand(Command: String, CommandType: Double): Unit
  /**
    * sets a new query for the composer, which may be expanded by filters, group by, having and sort criteria.
    * @param command the single select statement to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't a single select statement or the statement isn't vali
    */
  def setQuery(command: String): Unit
}

object XSingleSelectQueryAnalyzer {
  @scala.inline
  def apply(
    Filter: String,
    Group: String,
    GroupColumns: XIndexAccess,
    HavingClause: String,
    Order: String,
    OrderColumns: XIndexAccess,
    Query: String,
    QueryWithSubstitution: String,
    StructuredFilter: SafeArray[SafeArray[PropertyValue]],
    StructuredHavingClause: SafeArray[SafeArray[PropertyValue]],
    acquire: () => Unit,
    getFilter: () => String,
    getGroup: () => String,
    getGroupColumns: () => XIndexAccess,
    getHavingClause: () => String,
    getOrder: () => String,
    getOrderColumns: () => XIndexAccess,
    getQuery: () => String,
    getQueryWithSubstitution: () => String,
    getStructuredFilter: () => SafeArray[SafeArray[PropertyValue]],
    getStructuredHavingClause: () => SafeArray[SafeArray[PropertyValue]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCommand: (String, Double) => Unit,
    setQuery: String => Unit
  ): XSingleSelectQueryAnalyzer = {
    val __obj = js.Dynamic.literal(Filter = Filter.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupColumns = GroupColumns.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], OrderColumns = OrderColumns.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], QueryWithSubstitution = QueryWithSubstitution.asInstanceOf[js.Any], StructuredFilter = StructuredFilter.asInstanceOf[js.Any], StructuredHavingClause = StructuredHavingClause.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilter = js.Any.fromFunction0(getFilter), getGroup = js.Any.fromFunction0(getGroup), getGroupColumns = js.Any.fromFunction0(getGroupColumns), getHavingClause = js.Any.fromFunction0(getHavingClause), getOrder = js.Any.fromFunction0(getOrder), getOrderColumns = js.Any.fromFunction0(getOrderColumns), getQuery = js.Any.fromFunction0(getQuery), getQueryWithSubstitution = js.Any.fromFunction0(getQueryWithSubstitution), getStructuredFilter = js.Any.fromFunction0(getStructuredFilter), getStructuredHavingClause = js.Any.fromFunction0(getStructuredHavingClause), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCommand = js.Any.fromFunction2(setCommand), setQuery = js.Any.fromFunction1(setQuery))
    __obj.asInstanceOf[XSingleSelectQueryAnalyzer]
  }
}

