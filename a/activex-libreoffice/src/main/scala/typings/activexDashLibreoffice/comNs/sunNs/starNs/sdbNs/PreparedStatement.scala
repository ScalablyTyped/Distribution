package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XArray
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XBlob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XClob
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XConnection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XRef
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XResultSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XResultSetMetaData
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs.XColumnsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Date
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a precompiled SQL statement. The service differs only in the access of the columns and parameters to the service {@link
  * com.sun.star.sdbc.PreparedStatement} .
  */
trait PreparedStatement
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.PreparedStatement
     with XColumnsSupplier

object PreparedStatement {
  @scala.inline
  def apply(
    Columns: XNameAccess,
    Connection: XConnection,
    CursorName: String,
    FetchDirection: Double,
    FetchSize: Double,
    MaxFieldSize: Double,
    MaxRows: Double,
    MetaData: XResultSetMetaData,
    MoreResults: Boolean,
    PropertySetInfo: XPropertySetInfo,
    QueryTimeOut: Double,
    ResultSet: XResultSet,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    UpdateCount: Double,
    Warnings: js.Any,
    acquire: () => Unit,
    addBatch: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    cancel: () => Unit,
    clearBatch: () => Unit,
    clearParameters: () => Unit,
    clearWarnings: () => Unit,
    close: () => Unit,
    dispose: () => Unit,
    execute: () => Boolean,
    executeBatch: () => SafeArray[Double],
    executeQuery: () => XResultSet,
    executeUpdate: () => Double,
    getColumns: () => XNameAccess,
    getConnection: () => XConnection,
    getMetaData: () => XResultSetMetaData,
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
    setArray: (Double, XArray) => Unit,
    setBinaryStream: (Double, XInputStream, Double) => Unit,
    setBlob: (Double, XBlob) => Unit,
    setBoolean: (Double, Boolean) => Unit,
    setByte: (Double, Double) => Unit,
    setBytes: (Double, SeqEquiv[Double]) => Unit,
    setCharacterStream: (Double, XInputStream, Double) => Unit,
    setClob: (Double, XClob) => Unit,
    setDate: (Double, Date) => Unit,
    setDouble: (Double, Double) => Unit,
    setFloat: (Double, Double) => Unit,
    setInt: (Double, Double) => Unit,
    setLong: (Double, Double) => Unit,
    setNull: (Double, Double) => Unit,
    setObject: (Double, js.Any) => Unit,
    setObjectNull: (Double, Double, String) => Unit,
    setObjectWithInfo: (Double, js.Any, Double, Double) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setRef: (Double, XRef) => Unit,
    setShort: (Double, Double) => Unit,
    setString: (Double, String) => Unit,
    setTime: (Double, Time) => Unit,
    setTimestamp: (Double, DateTime) => Unit
  ): PreparedStatement = {
    val __obj = js.Dynamic.literal(Columns = Columns, Connection = Connection, CursorName = CursorName, FetchDirection = FetchDirection, FetchSize = FetchSize, MaxFieldSize = MaxFieldSize, MaxRows = MaxRows, MetaData = MetaData, MoreResults = MoreResults, PropertySetInfo = PropertySetInfo, QueryTimeOut = QueryTimeOut, ResultSet = ResultSet, ResultSetConcurrency = ResultSetConcurrency, ResultSetType = ResultSetType, UpdateCount = UpdateCount, Warnings = Warnings, acquire = js.Any.fromFunction0(acquire), addBatch = js.Any.fromFunction0(addBatch), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cancel = js.Any.fromFunction0(cancel), clearBatch = js.Any.fromFunction0(clearBatch), clearParameters = js.Any.fromFunction0(clearParameters), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), executeBatch = js.Any.fromFunction0(executeBatch), executeQuery = js.Any.fromFunction0(executeQuery), executeUpdate = js.Any.fromFunction0(executeUpdate), getColumns = js.Any.fromFunction0(getColumns), getConnection = js.Any.fromFunction0(getConnection), getMetaData = js.Any.fromFunction0(getMetaData), getMoreResults = js.Any.fromFunction0(getMoreResults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResultSet = js.Any.fromFunction0(getResultSet), getUpdateCount = js.Any.fromFunction0(getUpdateCount), getWarnings = js.Any.fromFunction0(getWarnings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp))
  
    __obj.asInstanceOf[PreparedStatement]
  }
}

