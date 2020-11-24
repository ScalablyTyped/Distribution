package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for parameter setting, commonly implemented in conjunction with PreparedStatements.
  *
  * **Note:** The setXXX methods for setting IN parameter values must specify types that are compatible with the defined SQL type of the input parameter.
  * For instance, if the IN parameter has SQL type Integer, then the method {@link com.sun.star.sdbc.XParameters.setInt()} should be used.
  *
  * If arbitrary parameter type conversions are required, the method {@link com.sun.star.sdbc.XParameters.setObject()} should be used with a target SQL
  * type. ; ;  Example of setting a parameter; `con` is an active connection.
  *
  * {{program example here, see documentation}}
  * @see com.sun.star.sdbc.XPreparedStatement
  */
@js.native
trait XParameters extends XInterface {
  
  /**
    * clears the current parameter values immediately.
    *
    * In general, parameter values remain in force for repeated use of a {@link Statement} . Setting a parameter value automatically clears its previous
    * value. However, in some cases it is useful to immediately release the resources used by the current parameter values; this can be done by calling
    * clearParameters.
    * @throws SQLException if a database access error occurs.
    */
  def clearParameters(): Unit = js.native
  
  /**
    * sets an Array parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setArray(parameterIndex: Double, x: XArray): Unit = js.native
  
  /**
    * sets the designated parameter to the given input stream, which will have the specified number of bytes. When a very large binary value is input to a
    * LONGVARBINARY or LONGVARCHAR parameter, it may be more practical to send it via an {@link com.sun.star.io.XInputStream} . SDBC will read the data from
    * the stream as needed, until it reaches end-of-file.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @param length the number of bytes in the stream
    * @throws SQLException if a database access error occurs.
    */
  def setBinaryStream(parameterIndex: Double, x: XInputStream, length: Double): Unit = js.native
  
  /**
    * sets a BLOB parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBlob(parameterIndex: Double, x: XBlob): Unit = js.native
  
  /**
    * sets the designated parameter to a boolean value. The driver converts this to a SQL BIT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBoolean(parameterIndex: Double, x: Boolean): Unit = js.native
  
  /**
    * sets the designated parameter to a byte value. The driver converts this to a SQL TINYINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setByte(parameterIndex: Double, x: Double): Unit = js.native
  
  /**
    * sets the designated parameter to a sequence of bytes. The driver converts this to a SQL VARBINARY or LONGVARBINARY (depending on the argument's size
    * relative to the driver's limits on VARBINARYs) when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBytes(parameterIndex: Double, x: SeqEquiv[Double]): Unit = js.native
  
  /**
    * sets the designated parameter to the given input stream, which will have the specified number of bytes. When a very large binary value is input to a
    * LONGVARCHAR parameter, it may be more practical to send it via a {@link com.sun.star.io.XInputStream} . SDBC will read the data from the stream as
    * needed, until it reaches end-of-file.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @param length the number of characters in the stream
    * @throws SQLException if a database access error occurs.
    */
  def setCharacterStream(parameterIndex: Double, x: XInputStream, length: Double): Unit = js.native
  
  /**
    * sets a CLOB parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setClob(parameterIndex: Double, x: XClob): Unit = js.native
  
  /**
    * sets the designated parameter to a date value. The driver converts this to a SQL DATE value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setDate(parameterIndex: Double, x: Date): Unit = js.native
  
  /**
    * sets the designated parameter to a double value. The driver converts this to a SQL DOUBLE value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setDouble(parameterIndex: Double, x: Double): Unit = js.native
  
  /**
    * sets the designated parameter to a float value. The driver converts this to a SQL FLOAT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setFloat(parameterIndex: Double, x: Double): Unit = js.native
  
  /**
    * sets the designated parameter to a long value. The driver converts this to a SQL INTEGER value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setInt(parameterIndex: Double, x: Double): Unit = js.native
  
  /**
    * sets the designated parameter to a hyper value. The driver converts this to a SQL BIGINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setLong(parameterIndex: Double, x: Double): Unit = js.native
  
  /** sets the designated parameter to SQL NULL. */
  def setNull(parameterIndex: Double, sqlType: Double): Unit = js.native
  
  /**
    * sets the value of a parameter using an any.
    *
    * The given object will be converted to the targetSqlType before being sent to the database. If the object has a custom mapping (is of a class
    * implementing SQLData), the SDBC driver should call its method `writeSQL` to write it to the SQL data stream. If, on the other hand, the object is of a
    * service implementing Ref, Blob, Clob, Struct, or Array, the driver should pass it to the database as a value of the corresponding SQL type.
    *
    * Note that this method may be used to pass database-specific abstract data types.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setObject(parameterIndex: Double, x: js.Any): Unit = js.native
  
  /**
    * sets the designated parameter to SQL NULL. This version of setNull should be used for user-named types and REF type parameters. Examples of user-named
    * types include: STRUCT, DISTINCT, OBJECT, and named array types.
    *
    * **Note:** To be portable, applications must give the SQL type code and the fully-qualified SQL type name when specifying a NULL user-defined or REF
    * parameter. In the case of a user-named type the name is the type name of the parameter itself. For a REF parameter the name is the type name of the
    * referenced type. If a SDBC driver does not need the type code or type name information, it may ignore it. ;  Although it is intended for user-named
    * and Ref parameters, this method may be used to set a null parameter of any JDBC type. If the parameter does not have a user-named or REF type, the
    * given typeName is ignored.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param sqlType the type of the column to set to `NULL`
    * @param typeName the name of the type
    * @throws SQLException if a database access error occurs.
    */
  def setObjectNull(parameterIndex: Double, sqlType: Double, typeName: String): Unit = js.native
  
  /**
    * set a value from the Datatype ANY for a parameter.
    *
    * The given object will be converted to the targetSqlType before being sent to the database. If the object has a custom mapping (is of a class
    * implementing SQLData), the SDBC driver should call its method `writeSQL` to write it to the SQL data stream. If, on the other hand, the object is of a
    * service implementing Ref, Blob, Clob, Struct, or Array, the driver should pass it to the database as a value of the corresponding SQL type.
    *
    * Note that this method may be used to pass database-specific abstract data types.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @param targetSqlType the SQL type (as defined in {@link com.sun.star.sdbc.DataType} ) to be sent to the database. The scale argument may further qualify
    * @param scale for {@link com.sun.star.sdbc.DataType.DECIMAL} or {@link com.sun.star.sdbc.DataType.NUMERIC} types, this is the number of digits after the
    * @throws SQLException if a database access error occurs.
    */
  def setObjectWithInfo(parameterIndex: Double, x: js.Any, targetSqlType: Double, scale: Double): Unit = js.native
  
  /**
    * sets a REF(&lt;structured-type&gt;) parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setRef(parameterIndex: Double, x: XRef): Unit = js.native
  
  /**
    * sets the designated parameter to a short value. The driver converts this to a SQL SMALLINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setShort(parameterIndex: Double, x: Double): Unit = js.native
  
  /**
    * sets the designated parameter to a string value. The driver converts this to a SQL VARCHAR or LONGVARCHAR value (depending on the argument's size
    * relative to the driver's limits on VARCHARs) when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setString(parameterIndex: Double, x: String): Unit = js.native
  
  /**
    * sets the designated parameter to a time value. The driver converts this to a SQL TIME value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setTime(parameterIndex: Double, x: Time): Unit = js.native
  
  /**
    * sets the designated parameter to a datetime value. The driver converts this to a SQL TIMESTAMP value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setTimestamp(parameterIndex: Double, x: DateTime): Unit = js.native
}
object XParameters {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    clearParameters: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
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
    setRef: (Double, XRef) => Unit,
    setShort: (Double, Double) => Unit,
    setString: (Double, String) => Unit,
    setTime: (Double, Time) => Unit,
    setTimestamp: (Double, DateTime) => Unit
  ): XParameters = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clearParameters = js.Any.fromFunction0(clearParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setArray = js.Any.fromFunction2(setArray), setBinaryStream = js.Any.fromFunction3(setBinaryStream), setBlob = js.Any.fromFunction2(setBlob), setBoolean = js.Any.fromFunction2(setBoolean), setByte = js.Any.fromFunction2(setByte), setBytes = js.Any.fromFunction2(setBytes), setCharacterStream = js.Any.fromFunction3(setCharacterStream), setClob = js.Any.fromFunction2(setClob), setDate = js.Any.fromFunction2(setDate), setDouble = js.Any.fromFunction2(setDouble), setFloat = js.Any.fromFunction2(setFloat), setInt = js.Any.fromFunction2(setInt), setLong = js.Any.fromFunction2(setLong), setNull = js.Any.fromFunction2(setNull), setObject = js.Any.fromFunction2(setObject), setObjectNull = js.Any.fromFunction3(setObjectNull), setObjectWithInfo = js.Any.fromFunction4(setObjectWithInfo), setRef = js.Any.fromFunction2(setRef), setShort = js.Any.fromFunction2(setShort), setString = js.Any.fromFunction2(setString), setTime = js.Any.fromFunction2(setTime), setTimestamp = js.Any.fromFunction2(setTimestamp))
    __obj.asInstanceOf[XParameters]
  }
  
  @scala.inline
  implicit class XParametersOps[Self <: XParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearParameters(value: () => Unit): Self = this.set("clearParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetArray(value: (Double, XArray) => Unit): Self = this.set("setArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBinaryStream(value: (Double, XInputStream, Double) => Unit): Self = this.set("setBinaryStream", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetBlob(value: (Double, XBlob) => Unit): Self = this.set("setBlob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBoolean(value: (Double, Boolean) => Unit): Self = this.set("setBoolean", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetByte(value: (Double, Double) => Unit): Self = this.set("setByte", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBytes(value: (Double, SeqEquiv[Double]) => Unit): Self = this.set("setBytes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCharacterStream(value: (Double, XInputStream, Double) => Unit): Self = this.set("setCharacterStream", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetClob(value: (Double, XClob) => Unit): Self = this.set("setClob", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDate(value: (Double, Date) => Unit): Self = this.set("setDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDouble(value: (Double, Double) => Unit): Self = this.set("setDouble", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetFloat(value: (Double, Double) => Unit): Self = this.set("setFloat", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetInt(value: (Double, Double) => Unit): Self = this.set("setInt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLong(value: (Double, Double) => Unit): Self = this.set("setLong", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetNull(value: (Double, Double) => Unit): Self = this.set("setNull", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetObject(value: (Double, js.Any) => Unit): Self = this.set("setObject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetObjectNull(value: (Double, Double, String) => Unit): Self = this.set("setObjectNull", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetObjectWithInfo(value: (Double, js.Any, Double, Double) => Unit): Self = this.set("setObjectWithInfo", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetRef(value: (Double, XRef) => Unit): Self = this.set("setRef", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetShort(value: (Double, Double) => Unit): Self = this.set("setShort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetString(value: (Double, String) => Unit): Self = this.set("setString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTime(value: (Double, Time) => Unit): Self = this.set("setTime", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTimestamp(value: (Double, DateTime) => Unit): Self = this.set("setTimestamp", js.Any.fromFunction2(value))
  }
}
