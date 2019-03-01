package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the definition of the service {@link com.sun.star.sdbc.PreparedStatement} with a flag for the usage of bookmarks.
  * @see ResultSet
  * @see XRowLocate
  */
trait PreparedStatement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.PreparedStatement {
  /** returns if a result set should allow the navigation with bookmarks or not. The default is `FALSE` . */
  var UseBookmarks: scala.Boolean
}

object PreparedStatement {
  @scala.inline
  def apply(
    Connection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    CursorName: java.lang.String,
    FetchDirection: scala.Double,
    FetchSize: scala.Double,
    MaxFieldSize: scala.Double,
    MaxRows: scala.Double,
    MetaData: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetMetaData,
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
    addBatch: js.Function0[scala.Unit],
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
    clearParameters: js.Function0[scala.Unit],
    clearWarnings: js.Function0[scala.Unit],
    close: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    execute: js.Function0[scala.Boolean],
    executeBatch: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    executeQuery: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet],
    executeUpdate: js.Function0[scala.Double],
    getConnection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection],
    getMetaData: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetMetaData],
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
    setArray: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray, scala.Unit],
    setBinaryStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    setBlob: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob, scala.Unit],
    setBoolean: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    setByte: js.Function2[scala.Double, scala.Double, scala.Unit],
    setBytes: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ],
    setCharacterStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    setClob: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob, scala.Unit],
    setDate: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date, scala.Unit],
    setDouble: js.Function2[scala.Double, scala.Double, scala.Unit],
    setFloat: js.Function2[scala.Double, scala.Double, scala.Unit],
    setInt: js.Function2[scala.Double, scala.Double, scala.Unit],
    setLong: js.Function2[scala.Double, scala.Double, scala.Unit],
    setNull: js.Function2[scala.Double, scala.Double, scala.Unit],
    setObject: js.Function2[scala.Double, js.Any, scala.Unit],
    setObjectNull: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
    setObjectWithInfo: js.Function4[scala.Double, js.Any, scala.Double, scala.Double, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setRef: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef, scala.Unit],
    setShort: js.Function2[scala.Double, scala.Double, scala.Unit],
    setString: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setTime: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    setTimestamp: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime, 
      scala.Unit
    ]
  ): PreparedStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Connection")(Connection)
    __obj.updateDynamic("CursorName")(CursorName)
    __obj.updateDynamic("FetchDirection")(FetchDirection)
    __obj.updateDynamic("FetchSize")(FetchSize)
    __obj.updateDynamic("MaxFieldSize")(MaxFieldSize)
    __obj.updateDynamic("MaxRows")(MaxRows)
    __obj.updateDynamic("MetaData")(MetaData)
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
    __obj.updateDynamic("clearParameters")(clearParameters)
    __obj.updateDynamic("clearWarnings")(clearWarnings)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("executeBatch")(executeBatch)
    __obj.updateDynamic("executeQuery")(executeQuery)
    __obj.updateDynamic("executeUpdate")(executeUpdate)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("getMetaData")(getMetaData)
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
    __obj.updateDynamic("setArray")(setArray)
    __obj.updateDynamic("setBinaryStream")(setBinaryStream)
    __obj.updateDynamic("setBlob")(setBlob)
    __obj.updateDynamic("setBoolean")(setBoolean)
    __obj.updateDynamic("setByte")(setByte)
    __obj.updateDynamic("setBytes")(setBytes)
    __obj.updateDynamic("setCharacterStream")(setCharacterStream)
    __obj.updateDynamic("setClob")(setClob)
    __obj.updateDynamic("setDate")(setDate)
    __obj.updateDynamic("setDouble")(setDouble)
    __obj.updateDynamic("setFloat")(setFloat)
    __obj.updateDynamic("setInt")(setInt)
    __obj.updateDynamic("setLong")(setLong)
    __obj.updateDynamic("setNull")(setNull)
    __obj.updateDynamic("setObject")(setObject)
    __obj.updateDynamic("setObjectNull")(setObjectNull)
    __obj.updateDynamic("setObjectWithInfo")(setObjectWithInfo)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setRef")(setRef)
    __obj.updateDynamic("setShort")(setShort)
    __obj.updateDynamic("setString")(setString)
    __obj.updateDynamic("setTime")(setTime)
    __obj.updateDynamic("setTimestamp")(setTimestamp)
    __obj.asInstanceOf[PreparedStatement]
  }
}

