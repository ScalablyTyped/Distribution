package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to access data which is collected in a row. All methods raise a {@link com.sun.star.sdbc.SQLException} if a database access error occurs. */
@js.native
trait XRow extends XInterface {
  
  /**
    * gets a SQL ARRAY value from the current row of this `ResultSet` object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getArray(columnIndex: Double): XArray = js.native
  
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
  def getBinaryStream(columnIndex: Double): XInputStream = js.native
  
  /**
    * gets a BLOB value in the current row.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getBlob(columnIndex: Double): XBlob = js.native
  
  /**
    * gets the value of a column in the current row as boolean.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getBoolean(columnIndex: Double): Boolean = js.native
  
  /**
    * get the value of a column in the current row as a byte.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getByte(columnIndex: Double): Double = js.native
  
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @param columnIndex the first column is 1, the second is 2, ...
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws SQLException if a database access error occurs.
    */
  def getBytes(columnIndex: Double): SafeArray[Double] = js.native
  
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
  def getCharacterStream(columnIndex: Double): XInputStream = js.native
  
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getClob(columnIndex: Double): XClob = js.native
  
  /**
    * gets the value of a column in the current row as a date object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getDate(columnIndex: Double): Date = js.native
  
  /**
    * gets the value of a column in the current row as a double.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getDouble(columnIndex: Double): Double = js.native
  
  /**
    * gets the value of a column in the current row as a float.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getFloat(columnIndex: Double): Double = js.native
  
  /**
    * get the value of a column in the current row as an integer.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getInt(columnIndex: Double): Double = js.native
  
  /**
    * get the value of a column in the current row as a long.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getLong(columnIndex: Double): Double = js.native
  
  /**
    * returns the value of a column in the current row as an object. This method uses the given `Map` object for the custom mapping of the SQL structure or
    * distinct type that is being retrieved.
    * @param columnIndex the first column is 1, the second is 2,
    * @param typeMap the map of types which should be used to get the column value
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getObject(columnIndex: Double, typeMap: XNameAccess): js.Any = js.native
  
  /**
    * gets a REF(&lt;structured-type&gt;) column value from the current row.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getRef(columnIndex: Double): XRef = js.native
  
  /**
    * gets the value of a column in the current row as a short.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getShort(columnIndex: Double): Double = js.native
  
  /**
    * gets the value of a column in the current row as a string.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getString(columnIndex: Double): String = js.native
  
  /**
    * gets the value of a column in the current row as a time object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getTime(columnIndex: Double): Time = js.native
  
  /**
    * gets the value of a column in the current row as a datetime object.
    * @param columnIndex the first column is 1, the second is 2,
    * @returns the column value; if the value is SQL NULL, the result is null
    * @throws SQLException if a database access error occurs.
    */
  def getTimestamp(columnIndex: Double): DateTime = js.native
  
  /**
    * reports whether the last column read had a value of SQL NULL. Note that you must first call getXXX on a column to try to read its value and then call
    * {@link wasNull()} to see if the value read was SQL NULL.
    * @returns `TRUE` if last column read was SQL NULL and `FALSE` otherwise
    * @throws SQLException if a database access error occurs.
    */
  def wasNull(): Boolean = js.native
}
object XRow {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
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
    getObject: (Double, XNameAccess) => js.Any,
    getRef: Double => XRef,
    getShort: Double => Double,
    getString: Double => String,
    getTime: Double => Time,
    getTimestamp: Double => DateTime,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    wasNull: () => Boolean
  ): XRow = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getObject = js.Any.fromFunction2(getObject), getRef = js.Any.fromFunction1(getRef), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), wasNull = js.Any.fromFunction0(wasNull))
    __obj.asInstanceOf[XRow]
  }
  
  @scala.inline
  implicit class XRowOps[Self <: XRow] (val x: Self) extends AnyVal {
    
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
    def setGetArray(value: Double => XArray): Self = this.set("getArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBinaryStream(value: Double => XInputStream): Self = this.set("getBinaryStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBlob(value: Double => XBlob): Self = this.set("getBlob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBoolean(value: Double => Boolean): Self = this.set("getBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByte(value: Double => Double): Self = this.set("getByte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBytes(value: Double => SafeArray[Double]): Self = this.set("getBytes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCharacterStream(value: Double => XInputStream): Self = this.set("getCharacterStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClob(value: Double => XClob): Self = this.set("getClob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDate(value: Double => Date): Self = this.set("getDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDouble(value: Double => Double): Self = this.set("getDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFloat(value: Double => Double): Self = this.set("getFloat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInt(value: Double => Double): Self = this.set("getInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLong(value: Double => Double): Self = this.set("getLong", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetObject(value: (Double, XNameAccess) => js.Any): Self = this.set("getObject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRef(value: Double => XRef): Self = this.set("getRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetShort(value: Double => Double): Self = this.set("getShort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetString(value: Double => String): Self = this.set("getString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTime(value: Double => Time): Self = this.set("getTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTimestamp(value: Double => DateTime): Self = this.set("getTimestamp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWasNull(value: () => Boolean): Self = this.set("wasNull", js.Any.fromFunction0(value))
  }
}
