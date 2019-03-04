package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the definition of the service {@link com.sun.star.sdbc.Statement} with a flag for the usage of bookmarks.
  * @see ResultSet
  * @see XRowLocate
  */
trait Statement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.Statement {
  /** returns `TRUE` if a result set should allow navigation with bookmarks or not. The default is `FALSE` . */
  var UseBookmarks: scala.Boolean
}

object Statement {
  @scala.inline
  def apply(
    Connection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    CursorName: java.lang.String,
    EscapeProcessing: scala.Boolean,
    FetchDirection: scala.Double,
    FetchSize: scala.Double,
    MaxFieldSize: scala.Double,
    MaxRows: scala.Double,
    MoreResults: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    QueryTimeOut: scala.Double,
    ResultSet: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    ResultSetConcurrency: scala.Double,
    ResultSetType: scala.Double,
    UpdateCount: scala.Double,
    UseBookmarks: scala.Boolean,
    Warnings: js.Any,
    acquire: js.Function0[scala.Unit],
    addBatch: js.Function1[java.lang.String, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    cancel: js.Function0[scala.Unit],
    clearBatch: js.Function0[scala.Unit],
    clearWarnings: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    execute: js.Function1[java.lang.String, scala.Boolean],
    executeBatch: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    executeQuery: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet],
    executeUpdate: js.Function1[java.lang.String, scala.Double],
    getConnection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection],
    getMoreResults: js.Function0[scala.Boolean],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getResultSet: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet],
    getUpdateCount: js.Function0[scala.Double],
    getWarnings: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): Statement = {
    val __obj = js.Dynamic.literal(Connection = Connection, CursorName = CursorName, EscapeProcessing = EscapeProcessing, FetchDirection = FetchDirection, FetchSize = FetchSize, MaxFieldSize = MaxFieldSize, MaxRows = MaxRows, MoreResults = MoreResults, PropertySetInfo = PropertySetInfo, QueryTimeOut = QueryTimeOut, ResultSet = ResultSet, ResultSetConcurrency = ResultSetConcurrency, ResultSetType = ResultSetType, UpdateCount = UpdateCount, UseBookmarks = UseBookmarks, Warnings = Warnings, acquire = acquire, addBatch = addBatch, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, cancel = cancel, clearBatch = clearBatch, clearWarnings = clearWarnings, close = close, dispose = dispose, execute = execute, executeBatch = executeBatch, executeQuery = executeQuery, executeUpdate = executeUpdate, getConnection = getConnection, getMoreResults = getMoreResults, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getResultSet = getResultSet, getUpdateCount = getUpdateCount, getWarnings = getWarnings, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[Statement]
  }
}

