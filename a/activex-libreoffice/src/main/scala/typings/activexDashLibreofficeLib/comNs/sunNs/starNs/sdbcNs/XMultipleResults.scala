package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for inspecting multiple results produced by the execution of a SQL statement.
  *
  * Under some (uncommon) situations a single SQL statement may return multiple result sets and/or update counts. Normally you can ignore this unless you
  * are (1) executing a stored procedure that you know may return multiple results or (2) you are dynamically executing an unknown SQL string. The methods
  * {@link com.sun.star.sdbc.XMultipleResults.getMoreResults()} , {@link com.sun.star.sdbc.XMultipleResults.getResultSet()} and {@link
  * com.sun.star.sdbc.XMultipleResults.getUpdateCount()} let you navigate through multiple results.
  * @see com.sun.star.sdbc.XStatement
  * @see com.sun.star.sdbc.XPreparedStatement
  */
trait XMultipleResults
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * moves to a {@link Statement} 's next result. It returns `TRUE` if this result is a {@link ResultSet} . This method also implicitly closes any current
    * {@link ResultSet} obtained with getResultSet.
    *
    * There are no more results when `(!getMoreResults() &amp;&amp; getUpdateCount() == -1)` .
    * @returns `TRUE` if there exists more {@link ResultSet} objects
    * @throws SQLException if a database access error occurs.
    */
  val MoreResults: scala.Boolean
  /**
    * returns the current result as a {@link com.sun.star.sdbc.ResultSet} object. This method should be called only once per result.
    * @returns the {@link ResultSet} object
    * @throws SQLException if a database access error occurs.
    */
  val ResultSet: XResultSet
  /**
    * returns the current result as an update count.
    *
    * If the result is a {@link ResultSet} or there are no more results, -1 is returned. This method should be called only once per result.
    * @returns the current result as an update count.
    * @throws SQLException if a database access error occurs.
    */
  val UpdateCount: scala.Double
  /**
    * moves to a {@link Statement} 's next result. It returns `TRUE` if this result is a {@link ResultSet} . This method also implicitly closes any current
    * {@link ResultSet} obtained with getResultSet.
    *
    * There are no more results when `(!getMoreResults() &amp;&amp; getUpdateCount() == -1)` .
    * @returns `TRUE` if there exists more {@link ResultSet} objects
    * @throws SQLException if a database access error occurs.
    */
  def getMoreResults(): scala.Boolean
  /**
    * returns the current result as a {@link com.sun.star.sdbc.ResultSet} object. This method should be called only once per result.
    * @returns the {@link ResultSet} object
    * @throws SQLException if a database access error occurs.
    */
  def getResultSet(): XResultSet
  /**
    * returns the current result as an update count.
    *
    * If the result is a {@link ResultSet} or there are no more results, -1 is returned. This method should be called only once per result.
    * @returns the current result as an update count.
    * @throws SQLException if a database access error occurs.
    */
  def getUpdateCount(): scala.Double
}

object XMultipleResults {
  @scala.inline
  def apply(
    MoreResults: scala.Boolean,
    ResultSet: XResultSet,
    UpdateCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    getMoreResults: js.Function0[scala.Boolean],
    getResultSet: js.Function0[XResultSet],
    getUpdateCount: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMultipleResults = {
    val __obj = js.Dynamic.literal(MoreResults = MoreResults, ResultSet = ResultSet, UpdateCount = UpdateCount, acquire = acquire, getMoreResults = getMoreResults, getResultSet = getResultSet, getUpdateCount = getUpdateCount, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMultipleResults]
  }
}

