package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to execute SQL stored procedures.
  *
  * SDBC provides a stored procedure SQL escape that allows stored procedures to be called in a standard way for all RDBMSs. This escape syntax has one
  * form that includes a result parameter and one that does not. If used, the result parameter must be registered as an OUT parameter. The other
  * parameters can be used for input, output, or both. Parameters are referred to sequentially, by number. The first parameter is 1.
  *
  * `{?=call&lt;procedure-name&gt;[&lt;arg1&gt;,&lt;arg2&gt;,...]}; {call&lt;procedure-name&gt;[&lt;arg1&gt;,&lt;arg2&gt;,...]} `
  *
  * IN parameter values are set using the set methods inherited from {@link com.sun.star.sdbc.PreparedStatement} . The type of all OUT parameters must be
  * registered prior to executing the stored procedure; their values are retrieved after execution via the `get` methods provided by the {@link
  * com.sun.star.sdbc.XRow} .
  *
  * A `CallableStatement` can return one {@link com.sun.star.sdbc.XResultSet} or multiple {@link com.sun.star.sdbc.ResultSet} objects. Multiple
  * `ResultSet` objects are handled using operations inherited from {@link com.sun.star.sdbc.XPreparedStatement} .
  *
  * For maximum portability, a call's {@link com.sun.star.sdbc.ResultSet} objects and update counts should be processed prior to getting the values of
  * output parameters.
  */
trait CallableStatement
  extends PreparedStatement
     with XRow
     with XOutParameters

object CallableStatement {
  @scala.inline
  def apply(
    Connection: XConnection,
    CursorName: java.lang.String,
    FetchDirection: scala.Double,
    FetchSize: scala.Double,
    MaxFieldSize: scala.Double,
    MaxRows: scala.Double,
    MetaData: XResultSetMetaData,
    MoreResults: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    QueryTimeOut: scala.Double,
    ResultSet: XResultSet,
    ResultSetConcurrency: scala.Double,
    ResultSetType: scala.Double,
    UpdateCount: scala.Double,
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
    executeQuery: js.Function0[XResultSet],
    executeUpdate: js.Function0[scala.Double],
    getArray: js.Function1[scala.Double, XArray],
    getBinaryStream: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getBlob: js.Function1[scala.Double, XBlob],
    getBoolean: js.Function1[scala.Double, scala.Boolean],
    getByte: js.Function1[scala.Double, scala.Double],
    getBytes: js.Function1[scala.Double, activexDashInteropLib.SafeArray[scala.Double]],
    getCharacterStream: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getClob: js.Function1[scala.Double, XClob],
    getConnection: js.Function0[XConnection],
    getDate: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getDouble: js.Function1[scala.Double, scala.Double],
    getFloat: js.Function1[scala.Double, scala.Double],
    getInt: js.Function1[scala.Double, scala.Double],
    getLong: js.Function1[scala.Double, scala.Double],
    getMetaData: js.Function0[XResultSetMetaData],
    getMoreResults: js.Function0[scala.Boolean],
    getObject: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess, 
      js.Any
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRef: js.Function1[scala.Double, XRef],
    getResultSet: js.Function0[XResultSet],
    getShort: js.Function1[scala.Double, scala.Double],
    getString: js.Function1[scala.Double, java.lang.String],
    getTime: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getTimestamp: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
    getUpdateCount: js.Function0[scala.Double],
    getWarnings: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerNumericOutParameter: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    registerOutParameter: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
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
    setArray: js.Function2[scala.Double, XArray, scala.Unit],
    setBinaryStream: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Unit
    ],
    setBlob: js.Function2[scala.Double, XBlob, scala.Unit],
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
    setClob: js.Function2[scala.Double, XClob, scala.Unit],
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
    setRef: js.Function2[scala.Double, XRef, scala.Unit],
    setShort: js.Function2[scala.Double, scala.Double, scala.Unit],
    setString: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setTime: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    setTimestamp: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime, 
      scala.Unit
    ],
    wasNull: js.Function0[scala.Boolean]
  ): CallableStatement = {
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
    __obj.updateDynamic("getArray")(getArray)
    __obj.updateDynamic("getBinaryStream")(getBinaryStream)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getBoolean")(getBoolean)
    __obj.updateDynamic("getByte")(getByte)
    __obj.updateDynamic("getBytes")(getBytes)
    __obj.updateDynamic("getCharacterStream")(getCharacterStream)
    __obj.updateDynamic("getClob")(getClob)
    __obj.updateDynamic("getConnection")(getConnection)
    __obj.updateDynamic("getDate")(getDate)
    __obj.updateDynamic("getDouble")(getDouble)
    __obj.updateDynamic("getFloat")(getFloat)
    __obj.updateDynamic("getInt")(getInt)
    __obj.updateDynamic("getLong")(getLong)
    __obj.updateDynamic("getMetaData")(getMetaData)
    __obj.updateDynamic("getMoreResults")(getMoreResults)
    __obj.updateDynamic("getObject")(getObject)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getRef")(getRef)
    __obj.updateDynamic("getResultSet")(getResultSet)
    __obj.updateDynamic("getShort")(getShort)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("getTimestamp")(getTimestamp)
    __obj.updateDynamic("getUpdateCount")(getUpdateCount)
    __obj.updateDynamic("getWarnings")(getWarnings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerNumericOutParameter")(registerNumericOutParameter)
    __obj.updateDynamic("registerOutParameter")(registerOutParameter)
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
    __obj.updateDynamic("wasNull")(wasNull)
    __obj.asInstanceOf[CallableStatement]
  }
}

