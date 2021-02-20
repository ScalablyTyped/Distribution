package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XMultipleResults extends XInterface {
  
  /**
    * moves to a {@link Statement} 's next result. It returns `TRUE` if this result is a {@link ResultSet} . This method also implicitly closes any current
    * {@link ResultSet} obtained with getResultSet.
    *
    * There are no more results when `(!getMoreResults() &amp;&amp; getUpdateCount() == -1)` .
    * @returns `TRUE` if there exists more {@link ResultSet} objects
    * @throws SQLException if a database access error occurs.
    */
  val MoreResults: Boolean = js.native
  
  /**
    * returns the current result as a {@link com.sun.star.sdbc.ResultSet} object. This method should be called only once per result.
    * @returns the {@link ResultSet} object
    * @throws SQLException if a database access error occurs.
    */
  val ResultSet: XResultSet = js.native
  
  /**
    * returns the current result as an update count.
    *
    * If the result is a {@link ResultSet} or there are no more results, -1 is returned. This method should be called only once per result.
    * @returns the current result as an update count.
    * @throws SQLException if a database access error occurs.
    */
  val UpdateCount: Double = js.native
  
  /**
    * moves to a {@link Statement} 's next result. It returns `TRUE` if this result is a {@link ResultSet} . This method also implicitly closes any current
    * {@link ResultSet} obtained with getResultSet.
    *
    * There are no more results when `(!getMoreResults() &amp;&amp; getUpdateCount() == -1)` .
    * @returns `TRUE` if there exists more {@link ResultSet} objects
    * @throws SQLException if a database access error occurs.
    */
  def getMoreResults(): Boolean = js.native
  
  /**
    * returns the current result as a {@link com.sun.star.sdbc.ResultSet} object. This method should be called only once per result.
    * @returns the {@link ResultSet} object
    * @throws SQLException if a database access error occurs.
    */
  def getResultSet(): XResultSet = js.native
  
  /**
    * returns the current result as an update count.
    *
    * If the result is a {@link ResultSet} or there are no more results, -1 is returned. This method should be called only once per result.
    * @returns the current result as an update count.
    * @throws SQLException if a database access error occurs.
    */
  def getUpdateCount(): Double = js.native
}
object XMultipleResults {
  
  @scala.inline
  def apply(
    MoreResults: Boolean,
    ResultSet: XResultSet,
    UpdateCount: Double,
    acquire: () => Unit,
    getMoreResults: () => Boolean,
    getResultSet: () => XResultSet,
    getUpdateCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMultipleResults = {
    val __obj = js.Dynamic.literal(MoreResults = MoreResults.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], UpdateCount = UpdateCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMoreResults = js.Any.fromFunction0(getMoreResults), getResultSet = js.Any.fromFunction0(getResultSet), getUpdateCount = js.Any.fromFunction0(getUpdateCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMultipleResults]
  }
  
  @scala.inline
  implicit class XMultipleResultsMutableBuilder[Self <: XMultipleResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMoreResults(value: () => Boolean): Self = StObject.set(x, "getMoreResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResultSet(value: () => XResultSet): Self = StObject.set(x, "getResultSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdateCount(value: () => Double): Self = StObject.set(x, "getUpdateCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoreResults(value: Boolean): Self = StObject.set(x, "MoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultSet(value: XResultSet): Self = StObject.set(x, "ResultSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCount(value: Double): Self = StObject.set(x, "UpdateCount", value.asInstanceOf[js.Any])
  }
}
