package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.sdbc.XArray
import typings.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typings.activexLibreoffice.com_.sun.star.sdbc.XClob
import typings.activexLibreoffice.com_.sun.star.sdbc.XRef
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to access data which is collected in a row. */
trait XColumn extends XInterface {
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Array: XArray
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
  val BinaryStream: XInputStream
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Blob: XBlob
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
  val Bytes: SafeArray[scala.Double]
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
  val CharacterStream: XInputStream
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Clob: XClob
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Date: typings.activexLibreoffice.com_.sun.star.util.Date
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
  val Ref: XRef
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
  val Time: typings.activexLibreoffice.com_.sun.star.util.Time
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Timestamp: DateTime
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getArray(): XArray
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
  def getBinaryStream(): XInputStream
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBlob(): XBlob
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
  def getBytes(): SafeArray[scala.Double]
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
  def getCharacterStream(): XInputStream
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getClob(): XClob
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDate(): typings.activexLibreoffice.com_.sun.star.util.Date
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
  def getObject(typeMap: XNameAccess): js.Any
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getRef(): XRef
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
  def getTime(): typings.activexLibreoffice.com_.sun.star.util.Time
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTimestamp(): DateTime
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
    Array: XArray,
    BinaryStream: XInputStream,
    Blob: XBlob,
    Boolean: Boolean,
    Byte: Double,
    Bytes: SafeArray[Double],
    CharacterStream: XInputStream,
    Clob: XClob,
    Date: Date,
    Double: Double,
    Float: Double,
    Int: Double,
    Long: Double,
    Ref: XRef,
    Short: Double,
    String: String,
    Time: Time,
    Timestamp: DateTime,
    acquire: () => Unit,
    getArray: () => XArray,
    getBinaryStream: () => XInputStream,
    getBlob: () => XBlob,
    getBoolean: () => Boolean,
    getByte: () => Double,
    getBytes: () => SafeArray[Double],
    getCharacterStream: () => XInputStream,
    getClob: () => XClob,
    getDate: () => Date,
    getDouble: () => Double,
    getFloat: () => Double,
    getInt: () => Double,
    getLong: () => Double,
    getObject: XNameAccess => js.Any,
    getRef: () => XRef,
    getShort: () => Double,
    getString: () => String,
    getTime: () => Time,
    getTimestamp: () => DateTime,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    wasNull: () => Boolean
  ): XColumn = {
    val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], BinaryStream = BinaryStream.asInstanceOf[js.Any], Blob = Blob.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Byte = Byte.asInstanceOf[js.Any], Bytes = Bytes.asInstanceOf[js.Any], CharacterStream = CharacterStream.asInstanceOf[js.Any], Clob = Clob.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], Ref = Ref.asInstanceOf[js.Any], Short = Short.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getArray = js.Any.fromFunction0(getArray), getBinaryStream = js.Any.fromFunction0(getBinaryStream), getBlob = js.Any.fromFunction0(getBlob), getBoolean = js.Any.fromFunction0(getBoolean), getByte = js.Any.fromFunction0(getByte), getBytes = js.Any.fromFunction0(getBytes), getCharacterStream = js.Any.fromFunction0(getCharacterStream), getClob = js.Any.fromFunction0(getClob), getDate = js.Any.fromFunction0(getDate), getDouble = js.Any.fromFunction0(getDouble), getFloat = js.Any.fromFunction0(getFloat), getInt = js.Any.fromFunction0(getInt), getLong = js.Any.fromFunction0(getLong), getObject = js.Any.fromFunction1(getObject), getRef = js.Any.fromFunction0(getRef), getShort = js.Any.fromFunction0(getShort), getString = js.Any.fromFunction0(getString), getTime = js.Any.fromFunction0(getTime), getTimestamp = js.Any.fromFunction0(getTimestamp), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), wasNull = js.Any.fromFunction0(wasNull))
    __obj.asInstanceOf[XColumn]
  }
}

