package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a client side {@link ResultSet} , which combines the characteristics of a {@link com.sun.star.sdbc.Statement} and a {@link
  * com.sun.star.sdbc.ResultSet} .
  *
  * It acts like a typical bean. Before you use the {@link RowSet} , you have to specify a set of properties like a DataSource and a Command and other
  * properties known of {@link Statement} . ;  Afterwards, you can populate the {@link RowSet} by its execute method to fill the set with data.
  *
  * On the one hand, a {@link RowSet} can be used as a short cut to retrieve the data of a DataSource. You don't have to establish a connection, create a
  * {@link Statement} , and then create a {@link ResultSet} . On the other hand, a row set can be used to implement capabilities for a result set, which
  * are not supported by a driver result set, like caching strategies or update capabilities.
  */
trait RowSet
  extends ResultSet
     with XRowSet
     with XParameters {
  /** is the command which should be executed. */
  var Command: java.lang.String
  /**
    * is the name of a named datasource to use.
    * @see com.sun.star.sdbc:XDataSource
    */
  var DataSourceName: java.lang.String
  /**
    * returns if escape processing is on or off. If escape scanning is on (the default), the driver will do escape substitution before sending the SQL to
    * the database. This is only evaluated, if the CommandType is COMMAND.
    */
  var EscapeProcessing: scala.Boolean
  /**
    * returns the maximum number of bytes allowed for any column value.
    *
    * This limit is the maximum number of bytes that can be returned for any column value. The limit applies only to {@link
    * com.sun.star.sdbc.DataType.BINARY} , {@link com.sun.star.sdbc.DataType.VARBINARY} , {@link com.sun.star.sdbc.DataType.LONGVARBINARY} , {@link
    * com.sun.star.sdbc.DataType.CHAR} , {@link com.sun.star.sdbc.DataType.VARCHAR} , and {@link com.sun.star.sdbc.DataType.LONGVARCHAR} columns. If the
    * limit is exceeded, the excess data is silently discarded. ;  There is no limitation, if set to zero.
    */
  var MaxFieldSize: scala.Double
  /**
    * retrieves the maximum number of rows that a {@link ResultSet} can contain. If the limit is exceeded, the excess rows are silently dropped. ;  There is
    * no limitation, if set to zero.
    */
  var MaxRows: scala.Double
  /** determines the user for whom to open the connection. */
  var Password: java.lang.String
  /**
    * retrieves the number of seconds the driver will wait for a {@link Statement} to execute. If the limit is exceeded, a {@link
    * com.sun.star.sdbc.SQLException} is thrown. There is no limitation, if set to zero.
    */
  var QueryTimeOut: scala.Double
  /**
    * indicates the transaction isolation level, which should be used for the connection.
    * @see com.sun.star.sdbc.TransactionIsolation
    */
  var TransactionIsolation: scala.Double
  /** is the type map that will be used for the custom mapping of SQL structured types and distinct types. */
  var TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /** is the connection URL. Could be used instead of the DataSourceName. */
  var URL: java.lang.String
  /** determines the user for whom to open the connection. */
  var User: java.lang.String
}

object RowSet {
  @scala.inline
  def apply(
    Command: java.lang.String,
    CursorName: java.lang.String,
    DataSourceName: java.lang.String,
    EscapeProcessing: scala.Boolean,
    FetchDirection: scala.Double,
    FetchSize: scala.Double,
    MaxFieldSize: scala.Double,
    MaxRows: scala.Double,
    MetaData: XResultSetMetaData,
    Password: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    QueryTimeOut: scala.Double,
    ResultSetConcurrency: scala.Double,
    ResultSetType: scala.Double,
    Row: scala.Double,
    Statement: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    TransactionIsolation: scala.Double,
    TypeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    URL: java.lang.String,
    User: java.lang.String,
    Warnings: js.Any,
    absolute: scala.Double => scala.Boolean,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addRowSetListener: XRowSetListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    afterLast: () => scala.Unit,
    beforeFirst: () => scala.Unit,
    cancelRowUpdates: () => scala.Unit,
    clearParameters: () => scala.Unit,
    clearWarnings: () => scala.Unit,
    close: () => scala.Unit,
    deleteRow: () => scala.Unit,
    dispose: () => scala.Unit,
    execute: () => scala.Unit,
    findColumn: java.lang.String => scala.Double,
    first: () => scala.Boolean,
    getArray: scala.Double => XArray,
    getBinaryStream: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getBlob: scala.Double => XBlob,
    getBoolean: scala.Double => scala.Boolean,
    getByte: scala.Double => scala.Double,
    getBytes: scala.Double => stdLib.SafeArray[scala.Double],
    getCharacterStream: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    getClob: scala.Double => XClob,
    getDate: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    getDouble: scala.Double => scala.Double,
    getFloat: scala.Double => scala.Double,
    getInt: scala.Double => scala.Double,
    getLong: scala.Double => scala.Double,
    getMetaData: () => XResultSetMetaData,
    getObject: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess) => js.Any,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getRef: scala.Double => XRef,
    getRow: () => scala.Double,
    getShort: scala.Double => scala.Double,
    getStatement: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getString: scala.Double => java.lang.String,
    getTime: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    getTimestamp: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    getWarnings: () => js.Any,
    insertRow: () => scala.Unit,
    isAfterLast: () => scala.Boolean,
    isBeforeFirst: () => scala.Boolean,
    isFirst: () => scala.Boolean,
    isLast: () => scala.Boolean,
    last: () => scala.Boolean,
    moveToCurrentRow: () => scala.Unit,
    moveToInsertRow: () => scala.Unit,
    next: () => scala.Boolean,
    previous: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refreshRow: () => scala.Unit,
    relative: scala.Double => scala.Boolean,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeRowSetListener: XRowSetListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    rowDeleted: () => scala.Boolean,
    rowInserted: () => scala.Boolean,
    rowUpdated: () => scala.Boolean,
    setArray: (scala.Double, XArray) => scala.Unit,
    setBinaryStream: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    setBlob: (scala.Double, XBlob) => scala.Unit,
    setBoolean: (scala.Double, scala.Boolean) => scala.Unit,
    setByte: (scala.Double, scala.Double) => scala.Unit,
    setBytes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    setCharacterStream: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    setClob: (scala.Double, XClob) => scala.Unit,
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
    setRef: (scala.Double, XRef) => scala.Unit,
    setShort: (scala.Double, scala.Double) => scala.Unit,
    setString: (scala.Double, java.lang.String) => scala.Unit,
    setTime: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time) => scala.Unit,
    setTimestamp: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime) => scala.Unit,
    updateBinaryStream: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    updateBoolean: (scala.Double, scala.Boolean) => scala.Unit,
    updateByte: (scala.Double, scala.Double) => scala.Unit,
    updateBytes: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    updateCharacterStream: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, scala.Double) => scala.Unit,
    updateDate: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date) => scala.Unit,
    updateDouble: (scala.Double, scala.Double) => scala.Unit,
    updateFloat: (scala.Double, scala.Double) => scala.Unit,
    updateInt: (scala.Double, scala.Double) => scala.Unit,
    updateLong: (scala.Double, scala.Double) => scala.Unit,
    updateNull: scala.Double => scala.Unit,
    updateNumericObject: (scala.Double, js.Any, scala.Double) => scala.Unit,
    updateObject: (scala.Double, js.Any) => scala.Unit,
    updateRow: () => scala.Unit,
    updateShort: (scala.Double, scala.Double) => scala.Unit,
    updateString: (scala.Double, java.lang.String) => scala.Unit,
    updateTime: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time) => scala.Unit,
    updateTimestamp: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime) => scala.Unit,
    wasNull: () => scala.Boolean
  ): RowSet = {
    val __obj = js.Dynamic.literal(Command = Command, CursorName = CursorName, DataSourceName = DataSourceName, EscapeProcessing = EscapeProcessing, FetchDirection = FetchDirection, FetchSize = FetchSize, MaxFieldSize = MaxFieldSize, MaxRows = MaxRows, MetaData = MetaData, Password = Password, PropertySetInfo = PropertySetInfo, QueryTimeOut = QueryTimeOut, ResultSetConcurrency = ResultSetConcurrency, ResultSetType = ResultSetType, Row = Row, Statement = Statement, TransactionIsolation = TransactionIsolation, TypeMap = TypeMap, URL = URL, User = User, Warnings = Warnings, absolute = js.Any.fromFunction1(absolute), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRowSetListener = js.Any.fromFunction1(addRowSetListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), afterLast = js.Any.fromFunction0(afterLast), beforeFirst = js.Any.fromFunction0(beforeFirst), cancelRowUpdates = js.Any.fromFunction0(cancelRowUpdates), clearParameters = js.Any.fromFunction0(clearParameters), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), deleteRow = js.Any.fromFunction0(deleteRow), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), findColumn = js.Any.fromFunction1(findColumn), first = js.Any.fromFunction0(first), getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = js.Any.fromFunction0(getMetaData), getObject = js.Any.fromFunction2(getObject), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getRow = js.Any.fromFunction0(getRow), getShort = js.Any.fromFunction1(getShort), getStatement = js.Any.fromFunction0(getStatement), getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getWarnings = js.Any.fromFunction0(getWarnings), insertRow = js.Any.fromFunction0(insertRow), isAfterLast = js.Any.fromFunction0(isAfterLast), isBeforeFirst = js.Any.fromFunction0(isBeforeFirst), isFirst = js.Any.fromFunction0(isFirst), isLast = js.Any.fromFunction0(isLast), last = js.Any.fromFunction0(last), moveToCurrentRow = js.Any.fromFunction0(moveToCurrentRow), moveToInsertRow = js.Any.fromFunction0(moveToInsertRow), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = js.Any.fromFunction0(refreshRow), relative = js.Any.fromFunction1(relative), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRowSetListener = js.Any.fromFunction1(removeRowSetListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rowDeleted = js.Any.fromFunction0(rowDeleted), rowInserted = js.Any.fromFunction0(rowInserted), rowUpdated = js.Any.fromFunction0(rowUpdated), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp), updateBinaryStream = js.Any.fromFunction3(updateBinaryStream), updateBoolean = js.Any.fromFunction2(updateBoolean), updateByte = js.Any.fromFunction2(updateByte), updateBytes = js.Any.fromFunction2(updateBytes), updateCharacterStream = js.Any.fromFunction3(updateCharacterStream), updateDate = js.Any.fromFunction2(updateDate), updateDouble = js.Any.fromFunction2(updateDouble), updateFloat = js.Any.fromFunction2(updateFloat), updateInt = js.Any.fromFunction2(updateInt), updateLong = js.Any.fromFunction2(updateLong), updateNull = js.Any.fromFunction1(updateNull), updateNumericObject = js.Any.fromFunction3(updateNumericObject), updateObject = js.Any.fromFunction2(updateObject), updateRow = js.Any.fromFunction0(updateRow), updateShort = js.Any.fromFunction2(updateShort), updateString = js.Any.fromFunction2(updateString), updateTime = js.Any.fromFunction2(updateTime), updateTimestamp = js.Any.fromFunction2(updateTimestamp), wasNull = js.Any.fromFunction0(wasNull))
  
    __obj.asInstanceOf[RowSet]
  }
}

