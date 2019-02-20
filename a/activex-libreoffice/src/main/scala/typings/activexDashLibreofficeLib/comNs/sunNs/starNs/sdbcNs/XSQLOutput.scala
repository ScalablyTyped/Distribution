package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used as an output stream for writing the attributes of a user-defined type back to the database. This interface, used only for custom mapping, is
  * used by the driver, and its methods are never directly invoked by a programmer.
  *
  * When an object of a class implementing interface {@link com.sun.star.sdbc.XSQLData} is passed as an argument to a SQL statement, the JDBC driver calls
  * com::sun::star::sdbc::SQLData::getSQLType() to determine the kind of SQL datum being passed to the database. ;  The driver then creates an instance of
  * `XSQLOutput` and passes it to the method {@link com.sun.star.sdbc.XSQLData.writeSQL()} . The method `writeSQL` in turn calls the appropriate
  * `XSQLOutput.writeXXX` methods to write data from the {@link com.sun.star.sdbc.XSQLData} object to the `XSQLOutput` output stream as the representation
  * of a SQL user-defined type.
  */
trait XSQLOutput
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * writes an array to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeArray(x: XArray): scala.Unit
  /**
    * writes the next attribute to the stream as a stream of uninterpreted bytes.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBinaryStream(x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
  /**
    * writes a BLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBlob(x: XBlob): scala.Unit
  /**
    * writes the next attribute to the stream as boolean.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBoolean(x: scala.Boolean): scala.Unit
  /**
    * writes the next attribute to the stream as byte.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeByte(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as byte sequence.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBytes(x: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * writes the next attribute to the stream as a stream of Unicode string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeCharacterStream(x: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): scala.Unit
  /**
    * writes a CLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeClob(x: XClob): scala.Unit
  /**
    * writes the next attribute to the stream as a date.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDate(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date): scala.Unit
  /**
    * writes the next attribute to the stream as double.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDouble(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as float.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeFloat(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as long.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeInt(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as hyper.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeLong(x: scala.Double): scala.Unit
  /**
    * writes to the stream the data contained in the given `XSQLData` object.
    *
    * When the `XSQLData` object is `NULL` , this method writes an SQL NULL to the stream. Otherwise, it calls the {@link
    * com.sun.star.sdbc.XSQLData.writeSQL()} method of the given object, which writes the object's attributes to the stream. The implementation of the
    * method `XSQLData::writeSQL()` calls the appropriate `XSQLOutput.writeXXX` method(s) for writing each of the object's attributes in order. ;  The
    * attributes must be read from an {@link com.sun.star.sdbc.XSQLInput} input stream and written to an `XSQLOutput` output stream in the same order in
    * which they were listed in the SQL definition of the user-defined type.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeObject(x: XSQLData): scala.Unit
  /**
    * writes a REF(&lt;structured-type&gt;) to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeRef(x: XRef): scala.Unit
  /**
    * writes the next attribute to the stream as short.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeShort(x: scala.Double): scala.Unit
  /**
    * writes the next attribute to the stream as a string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeString(x: java.lang.String): scala.Unit
  /**
    * writes a structured-type to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeStruct(x: XStruct): scala.Unit
  /**
    * writes the next attribute to the stream as a time.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTime(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time): scala.Unit
  /**
    * writes the next attribute to the stream as a datetime.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTimestamp(x: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime): scala.Unit
}

