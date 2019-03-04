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
    val __obj = js.Dynamic.literal(Connection = Connection, CursorName = CursorName, FetchDirection = FetchDirection, FetchSize = FetchSize, MaxFieldSize = MaxFieldSize, MaxRows = MaxRows, MetaData = MetaData, MoreResults = MoreResults, PropertySetInfo = PropertySetInfo, QueryTimeOut = QueryTimeOut, ResultSet = ResultSet, ResultSetConcurrency = ResultSetConcurrency, ResultSetType = ResultSetType, UpdateCount = UpdateCount, UseBookmarks = UseBookmarks, Warnings = Warnings, acquire = acquire, addBatch = addBatch, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, cancel = cancel, clearBatch = clearBatch, clearParameters = clearParameters, clearWarnings = clearWarnings, close = close, dispose = dispose, execute = execute, executeBatch = executeBatch, executeQuery = executeQuery, executeUpdate = executeUpdate, getConnection = getConnection, getMetaData = getMetaData, getMoreResults = getMoreResults, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getResultSet = getResultSet, getUpdateCount = getUpdateCount, getWarnings = getWarnings, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setArray = setArray, setBinaryStream = setBinaryStream, setBlob = setBlob, setBoolean = setBoolean, setByte = setByte, setBytes = setBytes, setCharacterStream = setCharacterStream, setClob = setClob, setDate = setDate, setDouble = setDouble, setFloat = setFloat, setInt = setInt, setLong = setLong, setNull = setNull, setObject = setObject, setObjectNull = setObjectNull, setObjectWithInfo = setObjectWithInfo, setPropertyValue = setPropertyValue, setRef = setRef, setShort = setShort, setString = setString, setTime = setTime, setTimestamp = setTimestamp)
  
    __obj.asInstanceOf[PreparedStatement]
  }
}

