package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with PreparedStatement
     with XRow
     with XOutParameters
object CallableStatement {
  
  inline def apply(
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
    getArray: Double => XArray,
    getBinaryStream: Double => XInputStream,
    getBlob: Double => XBlob,
    getBoolean: Double => Boolean,
    getByte: Double => Double,
    getBytes: Double => SafeArray[Double],
    getCharacterStream: Double => XInputStream,
    getClob: Double => XClob,
    getConnection: () => XConnection,
    getDate: Double => Date,
    getDouble: Double => Double,
    getFloat: Double => Double,
    getInt: Double => Double,
    getLong: Double => Double,
    getMetaData: () => XResultSetMetaData,
    getMoreResults: () => Boolean,
    getObject: (Double, XNameAccess) => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRef: Double => XRef,
    getResultSet: () => XResultSet,
    getShort: Double => Double,
    getString: Double => String,
    getTime: Double => Time,
    getTimestamp: Double => DateTime,
    getUpdateCount: () => Double,
    getWarnings: () => js.Any,
    queryInterface: `type` => js.Any,
    registerNumericOutParameter: (Double, Double, Double) => Unit,
    registerOutParameter: (Double, Double, String) => Unit,
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
    setTimestamp: (Double, DateTime) => Unit,
    wasNull: () => Boolean
  ): CallableStatement = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], MaxFieldSize = MaxFieldSize.asInstanceOf[js.Any], MaxRows = MaxRows.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryTimeOut = QueryTimeOut.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], UpdateCount = UpdateCount.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addBatch = js.Any.fromFunction0(addBatch), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), cancel = js.Any.fromFunction0(cancel), clearBatch = js.Any.fromFunction0(clearBatch), clearParameters = js.Any.fromFunction0(clearParameters), clearWarnings = js.Any.fromFunction0(clearWarnings), close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), executeBatch = js.Any.fromFunction0(executeBatch), executeQuery = js.Any.fromFunction0(executeQuery), executeUpdate = js.Any.fromFunction0(executeUpdate), getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getConnection = js.Any.fromFunction0(getConnection), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = js.Any.fromFunction0(getMetaData), getMoreResults = js.Any.fromFunction0(getMoreResults), getObject = js.Any.fromFunction2(getObject), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getResultSet = js.Any.fromFunction0(getResultSet), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getUpdateCount = js.Any.fromFunction0(getUpdateCount), getWarnings = js.Any.fromFunction0(getWarnings), queryInterface = js.Any.fromFunction1(queryInterface), registerNumericOutParameter = js.Any.fromFunction3(registerNumericOutParameter), registerOutParameter = js.Any.fromFunction3(registerOutParameter), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp), wasNull = js.Any.fromFunction0(wasNull))
    __obj.asInstanceOf[CallableStatement]
  }
}
