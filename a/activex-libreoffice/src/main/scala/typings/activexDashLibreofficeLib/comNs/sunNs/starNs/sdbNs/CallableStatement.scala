package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a procedure call. The service differs only in the access of the columns and parameters to the service {@link
  * com.sun.star.sdbc.CallableStatement} .
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.PreparedStatement because var conflicts: CursorName, FetchDirection, FetchSize, MaxFieldSize, MaxRows, QueryTimeOut, ResultSetConcurrency, ResultSetType. Inlined  */ trait CallableStatement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.CallableStatement

object CallableStatement {
  @scala.inline
  def apply(
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
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
    Warnings: js.Any,
    acquire: () => scala.Unit,
    addBatch: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    cancel: () => scala.Unit,
    clearBatch: () => scala.Unit,
    clearParameters: () => scala.Unit,
    clearWarnings: () => scala.Unit,
    close: () => scala.Unit,
    dispose: () => scala.Unit,
    execute: () => scala.Boolean,
    executeBatch: () => stdLib.SafeArray[scala.Double],
    executeQuery: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    executeUpdate: () => scala.Double,
    getArray: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray,
    getBinaryStream: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getBlob: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob,
    getBoolean: scala.Double => scala.Boolean,
    getByte: scala.Double => scala.Double,
    getBytes: scala.Double => stdLib.SafeArray[scala.Double],
    getCharacterStream: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getClob: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob,
    getColumns: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    getConnection: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getDate: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    getDouble: scala.Double => scala.Double,
    getFloat: scala.Double => scala.Double,
    getInt: scala.Double => scala.Double,
    getLong: scala.Double => scala.Double,
    getMetaData: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetMetaData,
    getMoreResults: () => scala.Boolean,
    getObject: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess) => js.Any,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getRef: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef,
    getResultSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    getShort: scala.Double => scala.Double,
    getString: scala.Double => java.lang.String,
    getTime: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    getTimestamp: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    getUpdateCount: () => scala.Double,
    getWarnings: () => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerNumericOutParameter: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    registerOutParameter: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setArray: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray) => scala.Unit,
    setBinaryStream: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    setBlob: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob) => scala.Unit,
    setBoolean: (scala.Double, scala.Boolean) => scala.Unit,
    setByte: (scala.Double, scala.Double) => scala.Unit,
    setBytes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    setCharacterStream: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    setClob: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob) => scala.Unit,
    setDate: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date) => scala.Unit,
    setDouble: (scala.Double, scala.Double) => scala.Unit,
    setFloat: (scala.Double, scala.Double) => scala.Unit,
    setInt: (scala.Double, scala.Double) => scala.Unit,
    setLong: (scala.Double, scala.Double) => scala.Unit,
    setNull: (scala.Double, scala.Double) => scala.Unit,
    setObject: (scala.Double, js.Any) => scala.Unit,
    setObjectNull: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    setObjectWithInfo: (scala.Double, js.Any, scala.Double, scala.Double) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setRef: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef) => scala.Unit,
    setShort: (scala.Double, scala.Double) => scala.Unit,
    setString: (scala.Double, java.lang.String) => scala.Unit,
    setTime: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time) => scala.Unit,
    setTimestamp: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime) => scala.Unit,
    wasNull: () => scala.Boolean
  ): CallableStatement = {
    val __obj = js.Dynamic.literal(Columns = Columns, Connection = Connection, CursorName = CursorName, FetchDirection = FetchDirection, FetchSize = FetchSize, MaxFieldSize = MaxFieldSize, MaxRows = MaxRows, MetaData = MetaData, MoreResults = MoreResults, PropertySetInfo = PropertySetInfo, QueryTimeOut = QueryTimeOut, ResultSet = ResultSet, ResultSetConcurrency = ResultSetConcurrency, ResultSetType = ResultSetType, UpdateCount = UpdateCount, Warnings = Warnings, acquire = js.Any.fromFunction0(acquire), addBatch = js.Any.fromFunction0(addBatch), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cancel = js.Any.fromFunction0(cancel), clearBatch = js.Any.fromFunction0(clearBatch), clearParameters = js.Any.fromFunction0(clearParameters), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), executeBatch = js.Any.fromFunction0(executeBatch), executeQuery = js.Any.fromFunction0(executeQuery), executeUpdate = js.Any.fromFunction0(executeUpdate), getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getColumns = js.Any.fromFunction0(getColumns), getConnection = js.Any.fromFunction0(getConnection), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = js.Any.fromFunction0(getMetaData), getMoreResults = js.Any.fromFunction0(getMoreResults), getObject = js.Any.fromFunction2(getObject), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getResultSet = js.Any.fromFunction0(getResultSet), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getUpdateCount = js.Any.fromFunction0(getUpdateCount), getWarnings = js.Any.fromFunction0(getWarnings), queryInterface = js.Any.fromFunction1(queryInterface), registerNumericOutParameter = js.Any.fromFunction3(registerNumericOutParameter), registerOutParameter = js.Any.fromFunction3(registerOutParameter), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp), wasNull = js.Any.fromFunction0(wasNull))
  
    __obj.asInstanceOf[CallableStatement]
  }
}

