package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an input stream that contains a stream of values representing an instance of a SQL structured or distinct type.
  *
  * This interface, used only for custom mapping, is used by the driver behind the scenes, and a programmer never directly invokes `SQLInput` methods.
  *
  * When the method `getObject` is called with an object of a service implementing the interface `SQLData` , the SDBC driver calls the method
  * com::sun::star::sdbc::XSQLData::getSQLType() to determine the SQL type of the user-defined type (UDT) being custom mapped. The driver creates an
  * instance of {@link com.sun.star.sdbc.XSQLInput} , populating it with the attributes of the UDT. The driver then passes the input stream to the method
  * {@link com.sun.star.sdbc.XSQLData.readSQL()} , which in turn calls the `XSQLInput.readXXX` methods in its implementation for reading the attributes
  * from the input stream.
  */
trait XSQLInput
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * reads an array from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readArray(): XArray
  /**
    * reads the next attribute in the stream as sequence of bytes.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBinaryStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * reads a BLOB from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBlob(): XBlob
  /**
    * reads the next attribute in the stream as boolean.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBoolean(): scala.Boolean
  /**
    * reads the next attribute in the stream as byte.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readByte(): scala.Double
  /**
    * reads the next attribute in the stream as sequence of bytes.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readBytes(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * reads the next attribute in the stream as a Unicode string.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readCharacterStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * reads a CLOB from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readClob(): XClob
  /**
    * reads the next attribute in the stream as date.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readDate(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /**
    * reads the next attribute in the stream as double.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readDouble(): scala.Double
  /**
    * reads the next attribute in the stream as float.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readFloat(): scala.Double
  /**
    * reads the next attribute in the stream as long.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readInt(): scala.Double
  /**
    * reads the next attribute in the stream as hyper.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readLong(): scala.Double
  /**
    * returns the datum at the head of the stream as an any.
    *
    * The actual type of the any returned is determined by the default type mapping, and any customizations present in this stream's type map.
    *
    * ;  A type map is registered with the stream by the SDBC driver before the stream is passed to the application.
    *
    * ;  When the datum at the head of the stream is a SQL NULL, the method returns `VOID` . If the datum is a SQL structured or distinct type, it
    * determines the SQL type of the datum at the head of the stream, constructs an object of the appropriate service, and calls the method {@link
    * com.sun.star.sdbc.XSQLData.readSQL()} on that object, which reads additional data from the stream using the protocol described for that method.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readObject(): js.Any
  /**
    * reads a REF(&lt;structured-type&gt;) from the stream.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readRef(): XRef
  /**
    * reads the next attribute in the stream as short.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readShort(): scala.Double
  /**
    * reads the next attribute in the stream as string.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readString(): java.lang.String
  /**
    * reads the next attribute in the stream as time.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readTime(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /**
    * reads the next attribute in the stream as datetime.
    * @returns the attribute; if the value is SQL NULL, return null.
    * @throws SQLException if a database access error occurs.
    */
  def readTimestamp(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * determines whether the last value read was null.
    * @returns `TRUE` if the most recently gotten SQL value was null; otherwise, `FALSE`
    * @throws SQLException if a database access error occurs.
    */
  def wasNull(): scala.Boolean
}

object XSQLInput {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readArray: js.Function0[XArray],
    readBinaryStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    readBlob: js.Function0[XBlob],
    readBoolean: js.Function0[scala.Boolean],
    readByte: js.Function0[scala.Double],
    readBytes: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    readCharacterStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    readClob: js.Function0[XClob],
    readDate: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date],
    readDouble: js.Function0[scala.Double],
    readFloat: js.Function0[scala.Double],
    readInt: js.Function0[scala.Double],
    readLong: js.Function0[scala.Double],
    readObject: js.Function0[js.Any],
    readRef: js.Function0[XRef],
    readShort: js.Function0[scala.Double],
    readString: js.Function0[java.lang.String],
    readTime: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    readTimestamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime],
    release: js.Function0[scala.Unit],
    wasNull: js.Function0[scala.Boolean]
  ): XSQLInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("readArray")(readArray)
    __obj.updateDynamic("readBinaryStream")(readBinaryStream)
    __obj.updateDynamic("readBlob")(readBlob)
    __obj.updateDynamic("readBoolean")(readBoolean)
    __obj.updateDynamic("readByte")(readByte)
    __obj.updateDynamic("readBytes")(readBytes)
    __obj.updateDynamic("readCharacterStream")(readCharacterStream)
    __obj.updateDynamic("readClob")(readClob)
    __obj.updateDynamic("readDate")(readDate)
    __obj.updateDynamic("readDouble")(readDouble)
    __obj.updateDynamic("readFloat")(readFloat)
    __obj.updateDynamic("readInt")(readInt)
    __obj.updateDynamic("readLong")(readLong)
    __obj.updateDynamic("readObject")(readObject)
    __obj.updateDynamic("readRef")(readRef)
    __obj.updateDynamic("readShort")(readShort)
    __obj.updateDynamic("readString")(readString)
    __obj.updateDynamic("readTime")(readTime)
    __obj.updateDynamic("readTimestamp")(readTimestamp)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("wasNull")(wasNull)
    __obj.asInstanceOf[XSQLInput]
  }
}

