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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Connection")(Connection)
    __obj.updateDynamic("CursorName")(CursorName)
    __obj.updateDynamic("EscapeProcessing")(EscapeProcessing)
    __obj.updateDynamic("FetchDirection")(FetchDirection)
    __obj.updateDynamic("FetchSize")(FetchSize)
    __obj.updateDynamic("MaxFieldSize")(MaxFieldSize)
    __obj.updateDynamic("MaxRows")(MaxRows)
    __obj.updateDynamic("MoreResults")(MoreResults)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("QueryTimeOut")(QueryTimeOut)
    __obj.updateDynamic("ResultSet")(ResultSet)
    __obj.updateDynamic("ResultSetConcurrency")(ResultSetConcurrency)
    __obj.updateDynamic("ResultSetType")(ResultSetType)
    __obj.updateDynamic("UpdateCount")(UpdateCount)
    __obj.updateDynamic("UseBookmarks")(UseBookmarks)
    __obj.updateDynamic("Warnings")(Warnings)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addBatch")(addBatch)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("clearBatch")(clearBatch)
    __obj.updateDynamic("clearWarnings")(clearWarnings)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("executeBatch")(executeBatch)
    __obj.updateDynamic("executeQuery")(executeQuery)
    __obj.updateDynamic("executeUpdate")(executeUpdate)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("getMoreResults")(getMoreResults)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getResultSet")(getResultSet)
    __obj.updateDynamic("getUpdateCount")(getUpdateCount)
    __obj.updateDynamic("getWarnings")(getWarnings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[Statement]
  }
}

