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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to access data which is collected in a row. */
@js.native
trait XColumn extends XInterface {
  
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Array: XArray = js.native
  
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
  val BinaryStream: XInputStream = js.native
  
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Blob: XBlob = js.native
  
  /**
    * gets the value of a column in the current row as boolean.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Boolean: scala.Boolean = js.native
  
  /**
    * gets the value of a column in the current row as a byte.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Byte: scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Bytes: SafeArray[scala.Double] = js.native
  
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
  val CharacterStream: XInputStream = js.native
  
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Clob: XClob = js.native
  
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Date: typings.activexLibreoffice.com_.sun.star.util.Date = js.native
  
  /**
    * gets the value of a column in the current row as a double.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Double: scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a float.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Float: scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a long.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Int: scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a hyper.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Long: scala.Double = js.native
  
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Ref: XRef = js.native
  
  /**
    * gets the value of a column in the current row as a short.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Short: scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a String.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val String: java.lang.String = js.native
  
  /**
    * gets the value of a column in the current row as a time object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Time: typings.activexLibreoffice.com_.sun.star.util.Time = js.native
  
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  val Timestamp: DateTime = js.native
  
  /**
    * gets a SQL ARRAY value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getArray(): XArray = js.native
  
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
  def getBinaryStream(): XInputStream = js.native
  
  /**
    * gets a BLOB (Binary Large OBject) value in the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBlob(): XBlob = js.native
  
  /**
    * gets the value of a column in the current row as boolean.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBoolean(): scala.Boolean = js.native
  
  /**
    * gets the value of a column in the current row as a byte.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getByte(): scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a byte array. The bytes represent the raw values returned by the driver.
    * @returns the column value; if the value is SQL NULL, the result is empty.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getBytes(): SafeArray[scala.Double] = js.native
  
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
  def getCharacterStream(): XInputStream = js.native
  
  /**
    * gets a CLOB value in the current row of this `ResultSet` object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getClob(): XClob = js.native
  
  /**
    * gets the value of a column in the current row as a date object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDate(): typings.activexLibreoffice.com_.sun.star.util.Date = js.native
  
  /**
    * gets the value of a column in the current row as a double.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDouble(): scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a float.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getFloat(): scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a long.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getInt(): scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a hyper.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getLong(): scala.Double = js.native
  
  /**
    * @param typeMap the type map is used to fetch the correct type
    * @returns the value of a column in the current row as an object. This method uses the given `Map` object for the custom mapping of the SQL structure or dis
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getObject(typeMap: XNameAccess): js.Any = js.native
  
  /**
    * gets a REF(<structured-type&gt) column value from the current row.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getRef(): XRef = js.native
  
  /**
    * gets the value of a column in the current row as a short.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getShort(): scala.Double = js.native
  
  /**
    * gets the value of a column in the current row as a String.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getString(): java.lang.String = js.native
  
  /**
    * gets the value of a column in the current row as a time object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTime(): typings.activexLibreoffice.com_.sun.star.util.Time = js.native
  
  /**
    * gets the value of a column in the current row as a datetime object.
    * @returns the column value
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getTimestamp(): DateTime = js.native
  
  /**
    * reports whether the last column read had a value of SQL NULL. Note that you must first call getXXX on a column to try to read its value and then call
    * `wasNull()` to see if the value read was SQL NULL.
    * @returns `TRUE` if so
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def wasNull(): scala.Boolean = js.native
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
  
  @scala.inline
  implicit class XColumnOps[Self <: XColumn] (val x: Self) extends AnyVal {
    
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
    def setArray(value: XArray): Self = this.set("Array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryStream(value: XInputStream): Self = this.set("BinaryStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlob(value: XBlob): Self = this.set("Blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: Boolean): Self = this.set("Boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByte(value: Double): Self = this.set("Byte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytes(value: SafeArray[Double]): Self = this.set("Bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterStream(value: XInputStream): Self = this.set("CharacterStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClob(value: XClob): Self = this.set("Clob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: Double): Self = this.set("Double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloat(value: Double): Self = this.set("Float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt(value: Double): Self = this.set("Int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong(value: Double): Self = this.set("Long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: XRef): Self = this.set("Ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Double): Self = this.set("Short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = this.set("String", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Time): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: DateTime): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetArray(value: () => XArray): Self = this.set("getArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBinaryStream(value: () => XInputStream): Self = this.set("getBinaryStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBlob(value: () => XBlob): Self = this.set("getBlob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoolean(value: () => Boolean): Self = this.set("getBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetByte(value: () => Double): Self = this.set("getByte", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBytes(value: () => SafeArray[Double]): Self = this.set("getBytes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCharacterStream(value: () => XInputStream): Self = this.set("getCharacterStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClob(value: () => XClob): Self = this.set("getClob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDate(value: () => Date): Self = this.set("getDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDouble(value: () => Double): Self = this.set("getDouble", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFloat(value: () => Double): Self = this.set("getFloat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInt(value: () => Double): Self = this.set("getInt", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLong(value: () => Double): Self = this.set("getLong", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObject(value: XNameAccess => js.Any): Self = this.set("getObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRef(value: () => XRef): Self = this.set("getRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShort(value: () => Double): Self = this.set("getShort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetString(value: () => String): Self = this.set("getString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTime(value: () => Time): Self = this.set("getTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimestamp(value: () => DateTime): Self = this.set("getTimestamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWasNull(value: () => Boolean): Self = this.set("wasNull", js.Any.fromFunction0(value))
  }
}
