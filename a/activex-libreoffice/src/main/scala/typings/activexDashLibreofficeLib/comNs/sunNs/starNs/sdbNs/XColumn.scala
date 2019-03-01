package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to access data which is collected in a row. */
trait XColumn
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Array: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARBINARY or LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val BinaryStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Blob: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob
  /**
    * gets the value of a column in the current row as boolean.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Boolean: scala.Boolean
  /**
    * gets the value of a column in the current row as a byte.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Byte: scala.Double
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Bytes: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val CharacterStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Clob: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /**
    * gets the value of a column in the current row as a double.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Double: scala.Double
  /**
    * gets the value of a column in the current row as a float.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Float: scala.Double
  /**
    * gets the value of a column in the current row as a long.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Int: scala.Double
  /**
    * gets the value of a column in the current row as a hyper.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Long: scala.Double
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Ref: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef
  /**
    * gets the value of a column in the current row as a short.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Short: scala.Double
  /**
    * gets the value of a column in the current row as a String.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val String: java.lang.String
  /**
    * gets the value of a column in the current row as a time object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Timestamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getArray(): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARBINARY or LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBinaryStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBlob(): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob
  /**
    * gets the value of a column in the current row as boolean.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBoolean(): scala.Boolean
  /**
    * gets the value of a column in the current row as a byte.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getByte(): scala.Double
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBytes(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getCharacterStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getClob(): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDate(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /**
    * gets the value of a column in the current row as a double.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDouble(): scala.Double
  /**
    * gets the value of a column in the current row as a float.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getFloat(): scala.Double
  /**
    * gets the value of a column in the current row as a long.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getInt(): scala.Double
  /**
    * gets the value of a column in the current row as a hyper.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getLong(): scala.Double
  /**
    * @param typeMap the type map is used to fetch the correct type
    * @returns the value of a column in the current row as an object. This method uses the given `Map` object for the custom mapping of the SQL structure or dis
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getObject(typeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess): js.Any
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getRef(): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef
  /**
    * gets the value of a column in the current row as a short.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getShort(): scala.Double
  /**
    * gets the value of a column in the current row as a String.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getString(): java.lang.String
  /**
    * gets the value of a column in the current row as a time object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTime(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTimestamp(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * reports whether the last column read had a value of SQL NULL. Note that you must first call getXXX on a column to try to read its value and then call
    * `wasNull()` to see if the value read was SQL NULL.
    * @returns `TRUE` if so
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def wasNull(): scala.Boolean
}

object XColumn {
  @scala.inline
  def apply(
    Array: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray,
    BinaryStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    Blob: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob,
    Boolean: scala.Boolean,
    Byte: scala.Double,
    Bytes: activexDashInteropLib.SafeArray[scala.Double],
    CharacterStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    Clob: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob,
    Date: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    Double: scala.Double,
    Float: scala.Double,
    Int: scala.Double,
    Long: scala.Double,
    Ref: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef,
    Short: scala.Double,
    String: java.lang.String,
    Time: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Timestamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    acquire: js.Function0[scala.Unit],
    getArray: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XArray],
    getBinaryStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getBlob: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XBlob],
    getBoolean: js.Function0[scala.Boolean],
    getByte: js.Function0[scala.Double],
    getBytes: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getCharacterStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getClob: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XClob],
    getDate: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getDouble: js.Function0[scala.Double],
    getFloat: js.Function0[scala.Double],
    getInt: js.Function0[scala.Double],
    getLong: js.Function0[scala.Double],
    getObject: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess, js.Any],
    getRef: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRef],
    getShort: js.Function0[scala.Double],
    getString: js.Function0[java.lang.String],
    getTime: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getTimestamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    wasNull: js.Function0[scala.Boolean]
  ): XColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Array")(Array)
    __obj.updateDynamic("BinaryStream")(BinaryStream)
    __obj.updateDynamic("Blob")(Blob)
    __obj.updateDynamic("Boolean")(Boolean)
    __obj.updateDynamic("Byte")(Byte)
    __obj.updateDynamic("Bytes")(Bytes)
    __obj.updateDynamic("CharacterStream")(CharacterStream)
    __obj.updateDynamic("Clob")(Clob)
    __obj.updateDynamic("Date")(Date)
    __obj.updateDynamic("Double")(Double)
    __obj.updateDynamic("Float")(Float)
    __obj.updateDynamic("Int")(Int)
    __obj.updateDynamic("Long")(Long)
    __obj.updateDynamic("Ref")(Ref)
    __obj.updateDynamic("Short")(Short)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("Time")(Time)
    __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getArray")(getArray)
    __obj.updateDynamic("getBinaryStream")(getBinaryStream)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getBoolean")(getBoolean)
    __obj.updateDynamic("getByte")(getByte)
    __obj.updateDynamic("getBytes")(getBytes)
    __obj.updateDynamic("getCharacterStream")(getCharacterStream)
    __obj.updateDynamic("getClob")(getClob)
    __obj.updateDynamic("getDate")(getDate)
    __obj.updateDynamic("getDouble")(getDouble)
    __obj.updateDynamic("getFloat")(getFloat)
    __obj.updateDynamic("getInt")(getInt)
    __obj.updateDynamic("getLong")(getLong)
    __obj.updateDynamic("getObject")(getObject)
    __obj.updateDynamic("getRef")(getRef)
    __obj.updateDynamic("getShort")(getShort)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getTime")(getTime)
    __obj.updateDynamic("getTimestamp")(getTimestamp)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("wasNull")(wasNull)
    __obj.asInstanceOf[XColumn]
  }
}

