package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait XParameters
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * clears the current parameter values immediately.
    *
    * In general, parameter values remain in force for repeated use of a {@link Statement} . Setting a parameter value automatically clears its previous
    * value. However, in some cases it is useful to immediately release the resources used by the current parameter values; this can be done by calling
    * clearParameters.
    * @throws SQLException if a database access error occurs.
    */
  def clearParameters(): scala.Unit
  /**
    * sets an Array parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setArray(parameterIndex: scala.Double, x: XArray): scala.Unit
  /**
    * sets the designated parameter to the given input stream, which will have the specified number of bytes. When a very large binary value is input to a
    * LONGVARBINARY or LONGVARCHAR parameter, it may be more practical to send it via an {@link com.sun.star.io.XInputStream} . SDBC will read the data from
    * the stream as needed, until it reaches end-of-file.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @param length the number of bytes in the stream
    * @throws SQLException if a database access error occurs.
    */
  def setBinaryStream(
    parameterIndex: scala.Double,
    x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    length: scala.Double
  ): scala.Unit
  /**
    * sets a BLOB parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBlob(parameterIndex: scala.Double, x: XBlob): scala.Unit
  /**
    * sets the designated parameter to a boolean value. The driver converts this to a SQL BIT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBoolean(parameterIndex: scala.Double, x: scala.Boolean): scala.Unit
  /**
    * sets the designated parameter to a byte value. The driver converts this to a SQL TINYINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setByte(parameterIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * sets the designated parameter to a sequence of bytes. The driver converts this to a SQL VARBINARY or LONGVARBINARY (depending on the argument's size
    * relative to the driver's limits on VARBINARYs) when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setBytes(parameterIndex: scala.Double, x: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * sets the designated parameter to the given input stream, which will have the specified number of bytes. When a very large binary value is input to a
    * LONGVARCHAR parameter, it may be more practical to send it via a {@link com.sun.star.io.XInputStream} . SDBC will read the data from the stream as
    * needed, until it reaches end-of-file.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @param length the number of characters in the stream
    * @throws SQLException if a database access error occurs.
    */
  def setCharacterStream(
    parameterIndex: scala.Double,
    x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    length: scala.Double
  ): scala.Unit
  /**
    * sets a CLOB parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setClob(parameterIndex: scala.Double, x: XClob): scala.Unit
  /**
    * sets the designated parameter to a date value. The driver converts this to a SQL DATE value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setDate(parameterIndex: scala.Double, x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /**
    * sets the designated parameter to a double value. The driver converts this to a SQL DOUBLE value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setDouble(parameterIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * sets the designated parameter to a float value. The driver converts this to a SQL FLOAT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setFloat(parameterIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * sets the designated parameter to a long value. The driver converts this to a SQL INTEGER value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setInt(parameterIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * sets the designated parameter to a hyper value. The driver converts this to a SQL BIGINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setLong(parameterIndex: scala.Double, x: scala.Double): scala.Unit
  /** sets the designated parameter to SQL NULL. */
  def setNull(parameterIndex: scala.Double, sqlType: scala.Double): scala.Unit
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
  def setObject(parameterIndex: scala.Double, x: js.Any): scala.Unit
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
  def setObjectNull(parameterIndex: scala.Double, sqlType: scala.Double, typeName: java.lang.String): scala.Unit
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
  def setObjectWithInfo(parameterIndex: scala.Double, x: js.Any, targetSqlType: scala.Double, scale: scala.Double): scala.Unit
  /**
    * sets a REF(&lt;structured-type&gt;) parameter.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setRef(parameterIndex: scala.Double, x: XRef): scala.Unit
  /**
    * sets the designated parameter to a short value. The driver converts this to a SQL SMALLINT value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setShort(parameterIndex: scala.Double, x: scala.Double): scala.Unit
  /**
    * sets the designated parameter to a string value. The driver converts this to a SQL VARCHAR or LONGVARCHAR value (depending on the argument's size
    * relative to the driver's limits on VARCHARs) when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setString(parameterIndex: scala.Double, x: java.lang.String): scala.Unit
  /**
    * sets the designated parameter to a time value. The driver converts this to a SQL TIME value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setTime(parameterIndex: scala.Double, x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /**
    * sets the designated parameter to a datetime value. The driver converts this to a SQL TIMESTAMP value when it sends it to the database.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param x the parameter value
    * @throws SQLException if a database access error occurs.
    */
  def setTimestamp(parameterIndex: scala.Double, x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime): scala.Unit
}

object XParameters {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    clearParameters: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
    setRef: js.Function2[scala.Double, XRef, scala.Unit],
    setShort: js.Function2[scala.Double, scala.Double, scala.Unit],
    setString: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setTime: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time, scala.Unit],
    setTimestamp: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime, 
      scala.Unit
    ]
  ): XParameters = {
    val __obj = js.Dynamic.literal(acquire = acquire, clearParameters = clearParameters, queryInterface = queryInterface, release = release, setArray = setArray, setBinaryStream = setBinaryStream, setBlob = setBlob, setBoolean = setBoolean, setByte = setByte, setBytes = setBytes, setCharacterStream = setCharacterStream, setClob = setClob, setDate = setDate, setDouble = setDouble, setFloat = setFloat, setInt = setInt, setLong = setLong, setNull = setNull, setObject = setObject, setObjectNull = setObjectNull, setObjectWithInfo = setObjectWithInfo, setRef = setRef, setShort = setShort, setString = setString, setTime = setTime, setTimestamp = setTimestamp)
  
    __obj.asInstanceOf[XParameters]
  }
}

