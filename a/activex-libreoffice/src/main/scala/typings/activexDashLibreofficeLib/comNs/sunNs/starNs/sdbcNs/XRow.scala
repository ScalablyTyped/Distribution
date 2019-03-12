package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to access data which is collected in a row. All methods raise a {@link com.sun.star.sdbc.SQLException} if a database access error occurs. */
trait XRow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets a SQL ARRAY value from the current row of this `ResultSet` object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getArray(columnIndex: scala.Double): XArray
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARBINARY values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getBinaryStream(columnIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * gets a BLOB value in the current row.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getBlob(columnIndex: scala.Double): XBlob
  /**
    * gets the value of a column in the current row as boolean.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getBoolean(columnIndex: scala.Double): scala.Boolean
  /**
    * get the value of a column in the current row as a byte.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getByte(columnIndex: scala.Double): scala.Double
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @param columnIndex the first column is 1, the second is 2, ...
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws SQLException if a database access error occurs.
    */
  def getBytes(columnIndex: scala.Double): stdLib.SafeArray[scala.Double]
  /**
    * gets the value of a column in the current row as a stream of uninterpreted bytes. The value can then be read in chunks from the stream. This method is
    * particularly suitable for retrieving large LONGVARBINARY or LONGVARCHAR values.
    *
    * **Note:** All the data in the returned stream must be read prior to getting the value of any other column. The next call to a get method implicitly
    * closes the stream. Also, a stream may return 0 when the method {@link com.sun.star.io.XInputStream.available()} is called whether there is data
    * available or not.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getCharacterStream(columnIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getClob(columnIndex: scala.Double): XClob
  /**
    * gets the value of a column in the current row as a date object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getDate(columnIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /**
    * gets the value of a column in the current row as a double.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getDouble(columnIndex: scala.Double): scala.Double
  /**
    * gets the value of a column in the current row as a float.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getFloat(columnIndex: scala.Double): scala.Double
  /**
    * get the value of a column in the current row as an integer.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getInt(columnIndex: scala.Double): scala.Double
  /**
    * get the value of a column in the current row as a long.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getLong(columnIndex: scala.Double): scala.Double
  /**
    * returns the value of a column in the current row as an object. This method uses the given `Map` object for the custom mapping of the SQL structure or
    * distinct type that is being retrieved.
    * @param columnIndex the first column is 1, the second is 2,
    * @param typeMap the map of types which should be used to get the column value
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getObject(
    columnIndex: scala.Double,
    typeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  ): js.Any
  /**
    * gets a REF(&lt;structured-type&gt;) column value from the current row.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getRef(columnIndex: scala.Double): XRef
  /**
    * gets the value of a column in the current row as a short.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getShort(columnIndex: scala.Double): scala.Double
  /**
    * gets the value of a column in the current row as a string.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getString(columnIndex: scala.Double): java.lang.String
  /**
    * gets the value of a column in the current row as a time object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getTime(columnIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /**
    * gets the value of a column in the current row as a datetime object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getTimestamp(columnIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * reports whether the last column read had a value of SQL NULL. Note that you must first call getXXX on a column to try to read its value and then call
    * {@link wasNull()} to see if the value read was SQL NULL.
    * @returns `TRUE` if last column read was SQL NULL and `FALSE` otherwise
    * @throws SQLException if a database access error occurs.
    */
  def wasNull(): scala.Boolean
}

object XRow {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
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
    getObject: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess) => js.Any,
    getRef: scala.Double => XRef,
    getShort: scala.Double => scala.Double,
    getString: scala.Double => java.lang.String,
    getTime: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    getTimestamp: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    wasNull: () => scala.Boolean
  ): XRow = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getObject = js.Any.fromFunction2(getObject), getRef = js.Any.fromFunction1(getRef), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), wasNull = js.Any.fromFunction0(wasNull))
  
    __obj.asInstanceOf[XRow]
  }
}

