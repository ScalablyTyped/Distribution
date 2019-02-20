package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * simplifies the analyzing of single select statements.
  *
  * The interface can be used for analyzing single SELECT statements without knowing the structure of the used query.
  */
trait XSingleSelectQueryAnalyzer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  val Filter: java.lang.String
  /**
    * returns the currently used GROUP BY.
    *
    * The group criteria returned is part of the GROUP BY clause of the select command, but it does not contain the GROUP BY keyword .
    * @returns the group
    */
  val Group: java.lang.String
  /**
    * returns the currently used group.
    *
    * The columns returned form the GROUP BY clause.
    * @returns a collection of com::sun::star::sdb::GroupColumn which form the GROUP BY.
    */
  val GroupColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the used HAVING filter.
    *
    * The HAVING filter criteria returned is part of the HAVING condition of the select command, but it does not contain the HAVING token.
    * @returns the filter
    */
  val HavingClause: java.lang.String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  val Order: java.lang.String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns a collection of {@link com.sun.star.sdb.OrderColumn} which form the ORDER BY.
    */
  val OrderColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the query.
    * @returns the query
    */
  var Query: java.lang.String
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
  val QueryWithSubstitution: java.lang.String
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured filter
    */
  val StructuredFilter: activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * returns the currently used HAVING filter.
    *
    * The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria
    * with the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured HAVING filter
    */
  val StructuredHavingClause: activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * returns the used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  def getFilter(): java.lang.String
  /**
    * returns the currently used GROUP BY.
    *
    * The group criteria returned is part of the GROUP BY clause of the select command, but it does not contain the GROUP BY keyword .
    * @returns the group
    */
  def getGroup(): java.lang.String
  /**
    * returns the currently used group.
    *
    * The columns returned form the GROUP BY clause.
    * @returns a collection of com::sun::star::sdb::GroupColumn which form the GROUP BY.
    */
  def getGroupColumns(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the used HAVING filter.
    *
    * The HAVING filter criteria returned is part of the HAVING condition of the select command, but it does not contain the HAVING token.
    * @returns the filter
    */
  def getHavingClause(): java.lang.String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  def getOrder(): java.lang.String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns a collection of {@link com.sun.star.sdb.OrderColumn} which form the ORDER BY.
    */
  def getOrderColumns(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the query.
    * @returns the query
    */
  def getQuery(): java.lang.String
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
  def getQueryWithSubstitution(): java.lang.String
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured filter
    */
  def getStructuredFilter(): activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * returns the currently used HAVING filter.
    *
    * The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria
    * with the name of the column and the filter condition. The filter condition is of type string. The operator used, is defined by {@link
    * com.sun.star.sdb.SQLFilterOperator} .
    * @returns the structured HAVING filter
    */
  def getStructuredHavingClause(): activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * sets a new query for the composer, which may be expanded by filters, group by, having and sort criteria.
    * @param Command is the command which should be executed, the type of command depends on the {@link CommandType} .  In case of a `CommandType` of {@link c
    * @param CommandType is the type of the command.
    * @see com.sun.star.sdb.CommandType
    * @see com.sun.star.sdbc.RowSet.EscapeProcessing
    * @see com.sun.star.sdb.CommandType
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't a single select statement or the statement isn't vali
    */
  def setCommand(Command: java.lang.String, CommandType: scala.Double): scala.Unit
  /**
    * sets a new query for the composer, which may be expanded by filters, group by, having and sort criteria.
    * @param command the single select statement to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't a single select statement or the statement isn't vali
    */
  def setQuery(command: java.lang.String): scala.Unit
}

