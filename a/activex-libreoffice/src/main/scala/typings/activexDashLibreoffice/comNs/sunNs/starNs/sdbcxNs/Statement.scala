package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XResultSet
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the definition of the service {@link com.sun.star.sdbc.Statement} with a flag for the usage of bookmarks.
  * @see ResultSet
  * @see XRowLocate
  */
trait Statement
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.Statement {
  /** returns `TRUE` if a result set should allow navigation with bookmarks or not. The default is `FALSE` . */
  var UseBookmarks: Boolean
}

object Statement {
  @scala.inline
  def apply(
    Connection: XConnection,
    CursorName: String,
    EscapeProcessing: Boolean,
    FetchDirection: Double,
    FetchSize: Double,
    MaxFieldSize: Double,
    MaxRows: Double,
    MoreResults: Boolean,
    PropertySetInfo: XPropertySetInfo,
    QueryTimeOut: Double,
    ResultSet: XResultSet,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    UpdateCount: Double,
    UseBookmarks: Boolean,
    Warnings: js.Any,
    acquire: () => Unit,
    addBatch: String => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    cancel: () => Unit,
    clearBatch: () => Unit,
    clearWarnings: () => Unit,
    close: () => Unit,
    dispose: () => Unit,
    execute: String => Boolean,
    executeBatch: () => SafeArray[Double],
    executeQuery: String => XResultSet,
    executeUpdate: String => Double,
    getConnection: () => XConnection,
    getMoreResults: () => Boolean,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getResultSet: () => XResultSet,
    getUpdateCount: () => Double,
    getWarnings: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Statement = {
    val __obj = js.Dynamic.literal(Connection = Connection, CursorName = CursorName, EscapeProcessing = EscapeProcessing, FetchDirection = FetchDirection, FetchSize = FetchSize, MaxFieldSize = MaxFieldSize, MaxRows = MaxRows, MoreResults = MoreResults, PropertySetInfo = PropertySetInfo, QueryTimeOut = QueryTimeOut, ResultSet = ResultSet, ResultSetConcurrency = ResultSetConcurrency, ResultSetType = ResultSetType, UpdateCount = UpdateCount, UseBookmarks = UseBookmarks, Warnings = Warnings, acquire = js.Any.fromFunction0(acquire), addBatch = js.Any.fromFunction1(addBatch), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cancel = js.Any.fromFunction0(cancel), clearBatch = js.Any.fromFunction0(clearBatch), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction1(execute), executeBatch = js.Any.fromFunction0(executeBatch), executeQuery = js.Any.fromFunction1(executeQuery), executeUpdate = js.Any.fromFunction1(executeUpdate), getConnection = js.Any.fromFunction0(getConnection), getMoreResults = js.Any.fromFunction0(getMoreResults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResultSet = js.Any.fromFunction0(getResultSet), getUpdateCount = js.Any.fromFunction0(getUpdateCount), getWarnings = js.Any.fromFunction0(getWarnings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Statement]
  }
}

