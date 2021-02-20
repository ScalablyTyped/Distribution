package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait RowSet
  extends ResultSet
     with XRowSet
     with XParameters {
  
  /** is the command which should be executed. */
  var Command: String = js.native
  
  /**
    * is the name of a named datasource to use.
    * @see com.sun.star.sdbc:XDataSource
    */
  var DataSourceName: String = js.native
  
  /**
    * returns if escape processing is on or off. If escape scanning is on (the default), the driver will do escape substitution before sending the SQL to
    * the database. This is only evaluated, if the CommandType is COMMAND.
    */
  var EscapeProcessing: Boolean = js.native
  
  /**
    * returns the maximum number of bytes allowed for any column value.
    *
    * This limit is the maximum number of bytes that can be returned for any column value. The limit applies only to {@link
    * com.sun.star.sdbc.DataType.BINARY} , {@link com.sun.star.sdbc.DataType.VARBINARY} , {@link com.sun.star.sdbc.DataType.LONGVARBINARY} , {@link
    * com.sun.star.sdbc.DataType.CHAR} , {@link com.sun.star.sdbc.DataType.VARCHAR} , and {@link com.sun.star.sdbc.DataType.LONGVARCHAR} columns. If the
    * limit is exceeded, the excess data is silently discarded. ;  There is no limitation, if set to zero.
    */
  var MaxFieldSize: Double = js.native
  
  /**
    * retrieves the maximum number of rows that a {@link ResultSet} can contain. If the limit is exceeded, the excess rows are silently dropped. ;  There is
    * no limitation, if set to zero.
    */
  var MaxRows: Double = js.native
  
  /** determines the user for whom to open the connection. */
  var Password: String = js.native
  
  /**
    * retrieves the number of seconds the driver will wait for a {@link Statement} to execute. If the limit is exceeded, a {@link
    * com.sun.star.sdbc.SQLException} is thrown. There is no limitation, if set to zero.
    */
  var QueryTimeOut: Double = js.native
  
  /**
    * indicates the transaction isolation level, which should be used for the connection.
    * @see com.sun.star.sdbc.TransactionIsolation
    */
  var TransactionIsolation: Double = js.native
  
  /** is the type map that will be used for the custom mapping of SQL structured types and distinct types. */
  var TypeMap: XNameAccess = js.native
  
  /** is the connection URL. Could be used instead of the DataSourceName. */
  var URL: String = js.native
  
  /** determines the user for whom to open the connection. */
  var User: String = js.native
}
object RowSet {
  
  @scala.inline
  def apply(
    Command: String,
    CursorName: String,
    DataSourceName: String,
    EscapeProcessing: Boolean,
    FetchDirection: Double,
    FetchSize: Double,
    MaxFieldSize: Double,
    MaxRows: Double,
    MetaData: XResultSetMetaData,
    Password: String,
    PropertySetInfo: XPropertySetInfo,
    QueryTimeOut: Double,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    Row: Double,
    Statement: XInterface,
    TransactionIsolation: Double,
    TypeMap: XNameAccess,
    URL: String,
    User: String,
    Warnings: js.Any,
    absolute: Double => Boolean,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRowSetListener: XRowSetListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    afterLast: () => Unit,
    beforeFirst: () => Unit,
    cancelRowUpdates: () => Unit,
    clearParameters: () => Unit,
    clearWarnings: () => Unit,
    close: () => Unit,
    deleteRow: () => Unit,
    dispose: () => Unit,
    execute: () => Unit,
    findColumn: String => Double,
    first: () => Boolean,
    getArray: Double => XArray,
    getBinaryStream: Double => XInputStream,
    getBlob: Double => XBlob,
    getBoolean: Double => Boolean,
    getByte: Double => Double,
    getBytes: Double => SafeArray[Double],
    getCharacterStream: Double => XInputStream,
    getClob: Double => XClob,
    getDate: Double => Date,
    getDouble: Double => Double,
    getFloat: Double => Double,
    getInt: Double => Double,
    getLong: Double => Double,
    getMetaData: () => XResultSetMetaData,
    getObject: (Double, XNameAccess) => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRef: Double => XRef,
    getRow: () => Double,
    getShort: Double => Double,
    getStatement: () => XInterface,
    getString: Double => String,
    getTime: Double => Time,
    getTimestamp: Double => DateTime,
    getWarnings: () => js.Any,
    insertRow: () => Unit,
    isAfterLast: () => Boolean,
    isBeforeFirst: () => Boolean,
    isFirst: () => Boolean,
    isLast: () => Boolean,
    last: () => Boolean,
    moveToCurrentRow: () => Unit,
    moveToInsertRow: () => Unit,
    next: () => Boolean,
    previous: () => Boolean,
    queryInterface: `type` => js.Any,
    refreshRow: () => Unit,
    relative: Double => Boolean,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRowSetListener: XRowSetListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rowDeleted: () => Boolean,
    rowInserted: () => Boolean,
    rowUpdated: () => Boolean,
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
    setTimestamp: (Double, DateTime) => Unit,
    updateBinaryStream: (Double, XInputStream, Double) => Unit,
    updateBoolean: (Double, Boolean) => Unit,
    updateByte: (Double, Double) => Unit,
    updateBytes: (Double, SeqEquiv[Double]) => Unit,
    updateCharacterStream: (Double, XInputStream, Double) => Unit,
    updateDate: (Double, Date) => Unit,
    updateDouble: (Double, Double) => Unit,
    updateFloat: (Double, Double) => Unit,
    updateInt: (Double, Double) => Unit,
    updateLong: (Double, Double) => Unit,
    updateNull: Double => Unit,
    updateNumericObject: (Double, js.Any, Double) => Unit,
    updateObject: (Double, js.Any) => Unit,
    updateRow: () => Unit,
    updateShort: (Double, Double) => Unit,
    updateString: (Double, String) => Unit,
    updateTime: (Double, Time) => Unit,
    updateTimestamp: (Double, DateTime) => Unit,
    wasNull: () => Boolean
  ): RowSet = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], MaxFieldSize = MaxFieldSize.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryTimeOut = QueryTimeOut.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], TransactionIsolation = TransactionIsolation.asInstanceOf[js.Any], TypeMap = TypeMap.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], absolute = js.Any.fromFunction1(absolute), acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRowSetListener = js.Any.fromFunction1(addRowSetListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), afterLast = js.Any.fromFunction0(afterLast), beforeFirst = js.Any.fromFunction0(beforeFirst), cancelRowUpdates = js.Any.fromFunction0(cancelRowUpdates), clearParameters = js.Any.fromFunction0(clearParameters), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), deleteRow = js.Any.fromFunction0(deleteRow), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), findColumn = js.Any.fromFunction1(findColumn), first = js.Any.fromFunction0(first), getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = js.Any.fromFunction0(getMetaData), getObject = js.Any.fromFunction2(getObject), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getRow = js.Any.fromFunction0(getRow), getShort = js.Any.fromFunction1(getShort), getStatement = js.Any.fromFunction0(getStatement), getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getWarnings = js.Any.fromFunction0(getWarnings), insertRow = js.Any.fromFunction0(insertRow), isAfterLast = js.Any.fromFunction0(isAfterLast), isBeforeFirst = js.Any.fromFunction0(isBeforeFirst), isFirst = js.Any.fromFunction0(isFirst), isLast = js.Any.fromFunction0(isLast), last = js.Any.fromFunction0(last), moveToCurrentRow = js.Any.fromFunction0(moveToCurrentRow), moveToInsertRow = js.Any.fromFunction0(moveToInsertRow), next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous), queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = js.Any.fromFunction0(refreshRow), relative = js.Any.fromFunction1(relative), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRowSetListener = js.Any.fromFunction1(removeRowSetListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rowDeleted = js.Any.fromFunction0(rowDeleted), rowInserted = js.Any.fromFunction0(rowInserted), rowUpdated = js.Any.fromFunction0(rowUpdated), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp), updateBinaryStream = js.Any.fromFunction3(updateBinaryStream), updateBoolean = js.Any.fromFunction2(updateBoolean), updateByte = js.Any.fromFunction2(updateByte), updateBytes = js.Any.fromFunction2(updateBytes), updateCharacterStream = js.Any.fromFunction3(updateCharacterStream), updateDate = js.Any.fromFunction2(updateDate), updateDouble = js.Any.fromFunction2(updateDouble), updateFloat = js.Any.fromFunction2(updateFloat), updateInt = js.Any.fromFunction2(updateInt), updateLong = js.Any.fromFunction2(updateLong), updateNull = js.Any.fromFunction1(updateNull), updateNumericObject = js.Any.fromFunction3(updateNumericObject), updateObject = js.Any.fromFunction2(updateObject), updateRow = js.Any.fromFunction0(updateRow), updateShort = js.Any.fromFunction2(updateShort), updateString = js.Any.fromFunction2(updateString), updateTime = js.Any.fromFunction2(updateTime), updateTimestamp = js.Any.fromFunction2(updateTimestamp), wasNull = js.Any.fromFunction0(wasNull))
    __obj.asInstanceOf[RowSet]
  }
  
  @scala.inline
  implicit class RowSetMutableBuilder[Self <: RowSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceName(value: String): Self = StObject.set(x, "DataSourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeProcessing(value: Boolean): Self = StObject.set(x, "EscapeProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFieldSize(value: Double): Self = StObject.set(x, "MaxFieldSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "MaxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTimeOut(value: Double): Self = StObject.set(x, "QueryTimeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIsolation(value: Double): Self = StObject.set(x, "TransactionIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeMap(value: XNameAccess): Self = StObject.set(x, "TypeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
