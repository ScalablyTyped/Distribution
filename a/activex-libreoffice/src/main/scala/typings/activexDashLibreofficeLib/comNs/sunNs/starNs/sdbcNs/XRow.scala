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
  def getBytes(columnIndex: scala.Double): activexDashInteropLib.SafeArray[scala.Double]
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
    acquire: js.Function0[scala.Unit],
    getArray: js.Function1[scala.Double, XArray],
    getBinaryStream: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getBlob: js.Function1[scala.Double, XBlob],
    getBoolean: js.Function1[scala.Double, scala.Boolean],
    getByte: js.Function1[scala.Double, scala.Double],
    getBytes: js.Function1[scala.Double, activexDashInteropLib.SafeArray[scala.Double]],
    getCharacterStream: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getClob: js.Function1[scala.Double, XClob],
    getDate: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    getDouble: js.Function1[scala.Double, scala.Double],
    getFloat: js.Function1[scala.Double, scala.Double],
    getInt: js.Function1[scala.Double, scala.Double],
    getLong: js.Function1[scala.Double, scala.Double],
    getObject: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess, 
      js.Any
    ],
    getRef: js.Function1[scala.Double, XRef],
    getShort: js.Function1[scala.Double, scala.Double],
    getString: js.Function1[scala.Double, java.lang.String],
    getTime: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getTimestamp: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    wasNull: js.Function0[scala.Boolean]
  ): XRow = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[XRow]
  }
}

