package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * simplifies the composing of single select statements.
  *
  * The interface can be used for composing single SELECT statements without knowing the structure of the used query.
  * @see com.sun.star.sdb.SingleSelectQueryComposer
  */
trait XSingleSelectQueryComposer extends XSingleSelectQueryAnalyzer {
  /**
    * sets a new elementary query for the composer
    *
    * An elementary query or statement is a (single select) statement whose parts are not covered by the various set and get methods of the composer. That
    * is, if the elementary statement contains a filter clause, a call to {@link XSingleSelectQueryAnalyzer.getFilter()} will not return you this filter.
    * Instead, only filters which have been set using for instance {@link setFilter()} are covered by the get methods.
    *
    * The only methods which take all parts of the elementary statement into account are {@link XSingleSelectQueryAnalyzer.getQuery()} and {@link
    * XSingleSelectQueryAnalyzer.getQueryWithSubstitution()} , which always returns the complete composed query.
    *
    * As a result, you can use the composer to build cumulative filter expressions. That is, you can set {@link ElementaryQuery} to a statement already
    * containing filters, and then use {@link setFilter()} to append additional filters.
    *
    * The very same holds for sort orders, `HAVING` and `GROUP BY` clauses.
    *
    * There are various use cases for this. For instance, you might want to use the statement represented by a {@link QueryDefinition} , and extend it with
    * additional filters or sort orders, while not touching the respective parts already present in QueryDefinition::Command. This can be achieved by
    * setting the QueryDefinition::Command as {@link ElementaryQuery} of a {@link SingleSelectQueryComposer} .
    *
    * If, in such a scenario, you would be interested in the filter part of the QueryDefinition::Command, you would set it via {@link
    * XSingleSelectQueryAnalyzer.setQuery()} , and retrieve the filter part via {@link XSingleSelectQueryAnalyzer.getFilter()} .
    *
    * If you'd be interested in the composed filter, you would set the QueryDefinition::Command as {@link ElementaryQuery} , add your filter, and propagate
    * the resulting query ( {@link XSingleSelectQueryAnalyzer.getQuery()} ) to an {@link SingleSelectQueryAnalyzer} instance via {@link
    * XSingleSelectQueryAnalyzer.setQuery()} .
    */
  var ElementaryQuery: java.lang.String
  /**
    * appends a new filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter. The value property must be
    * supported by the {@link com.sun.star.sdb.DataColumn} .
    * @param column the column which is used to create a filter
    * @param andCriteria If `TRUE` the filter condition will be appended as an AND condition, otherwise the new filter condition will be appended as OR criter
    * @param filterOperator The operator used, is defined by {@link com.sun.star.sdb.SQLFilterOperator} .
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendFilterByColumn(
    column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    andCriteria: scala.Boolean,
    filterOperator: scala.Double
  ): scala.Unit
  /**
    * appends an additional part to the group criteria of the select statement. The column must be a {@link com.sun.star.sdbcx.Column} .
    * @param column the column which is used to create a group part
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendGroupByColumn(column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
  /**
    * appends a new HAVING filter condition by a {@link com.sun.star.sdb.DataColumn} providing the name and the value for the filter.
    * @param column the column which is used to create a filter
    * @param andCriteria If `TRUE` the filter condition will be appended as an AND condition, otherwise the new filter condition will be appended as OR criter
    * @param filterOperator The operator used, is defined by {@link com.sun.star.sdb.SQLFilterOperator} .
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendHavingClauseByColumn(
    column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    andCriteria: scala.Boolean,
    filterOperator: scala.Double
  ): scala.Unit
  /**
    * appends an additional part to the sort order criteria of the select statement. The column must be a {@link com.sun.star.sdbcx.Column} .
    * @param column the column which is used to create a order part
    * @param ascending `TRUE` when the order should be ascending, otherwise if `FALSE` descending.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendOrderByColumn(
    column: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ascending: scala.Boolean
  ): scala.Unit
  /**
    * makes it possible to set a filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setFilter(filter: java.lang.String): scala.Unit
  /**
    * makes it possible to set a group for the query.
    * @param group the group part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setGroup(group: java.lang.String): scala.Unit
  /**
    * makes it possible to set a HAVING filter condition for the query.
    * @param filter the filter to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the statement isn't valid or the statement isn't parsable.
    */
  def setHavingClause(filter: java.lang.String): scala.Unit
  /**
    * makes it possible to set a sort condition for the query.
    * @param order the order part to set
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs or the order isn't valid or the statement isn't parsable.
    */
  def setOrder(order: java.lang.String): scala.Unit
  /**
    * appends a new set of filter criteria which is split into levels.
    * @param filter The filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an AND cri
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setStructuredFilter(
    filter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ]
  ): scala.Unit
  /**
    * appends a new set of HAVING filter criteria which is split into levels.
    * @param filter The HAVING filter criteria is split into levels. Each level represents the OR criteria. Within each level, the filters are provided as an
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def setStructuredHavingClause(
    filter: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ]
  ): scala.Unit
}

