package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * should be provided by a tool which simplifies the handling with SQL select statements.
  *
  * The interface can be used for composing SELECT statements without knowing the structure of the used query.
  */
trait XSQLQueryComposer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the query composed with filters and sort criteria.
    * @returns the composed query
    */
  val ComposedQuery: java.lang.String
  /**
    * returns the currently used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  var Filter: java.lang.String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  var Order: java.lang.String
  /**
    * returns the query used for composing.
    * @returns the query
    */
  var Query: java.lang.String
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string.
    * @returns the structured filter
    */
  val StructuredFilter: activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * appends a new filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter.
    * @param column the column which is used to create a filter
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendFilterByColumn(column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
  /**
    * appends an additional part to the sort order criteria of the select statement.
    * @param column the column which is used to create a order part
    * @param ascending `TRUE` when the order should be ascending, otherwise `FALSE`
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendOrderByColumn(
    column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ascending: scala.Boolean
  ): scala.Unit
  /**
    * returns the query composed with filters and sort criteria.
    * @returns the composed query
    */
  def getComposedQuery(): java.lang.String
  /**
    * returns the currently used filter.
    *
    * The filter criteria returned is part of the where condition of the select command, but it does not contain the where token.
    * @returns the filter
    */
  def getFilter(): java.lang.String
  /**
    * returns the currently used sort order.
    *
    * The order criteria returned is part of the ORDER BY clause of the select command, but it does not contain the ORDER BY keyword .
    * @returns the order
    */
  def getOrder(): java.lang.String
  /**
    * returns the query used for composing.
    * @returns the query
    */
  def getQuery(): java.lang.String
  /**
    * returns the currently used filter.
    *
    * The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND criteria with
    * the name of the column and the filter condition. The filter condition is of type string.
    * @returns the structured filter
    */
  def getStructuredFilter(): activexDashInteropLib.SafeArray[
    activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ]
  /**
    * makes it possible to set a filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setFilter(filter: java.lang.String): scala.Unit
  /**
    * makes it possible to set a sort condition for the query.
    * @param order the order part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setOrder(order: java.lang.String): scala.Unit
  /**
    * sets a new query for the composer, which may be expanded by filters and sort criteria.
    * @param command the command to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setQuery(command: java.lang.String): scala.Unit
}

