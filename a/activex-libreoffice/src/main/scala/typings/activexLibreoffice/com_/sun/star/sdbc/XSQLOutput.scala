package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import typings.activexLibreoffice.com_.sun.star.util.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XInterface {
  
  /**
    * writes an array to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeArray(x: XArray): Unit
  
  /**
    * writes the next attribute to the stream as a stream of uninterpreted bytes.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBinaryStream(x: XInputStream): Unit
  
  /**
    * writes a BLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBlob(x: XBlob): Unit
  
  /**
    * writes the next attribute to the stream as boolean.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBoolean(x: Boolean): Unit
  
  /**
    * writes the next attribute to the stream as byte.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeByte(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as byte sequence.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeBytes(x: SeqEquiv[Double]): Unit
  
  /**
    * writes the next attribute to the stream as a stream of Unicode string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeCharacterStream(x: XInputStream): Unit
  
  /**
    * writes a CLOB to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeClob(x: XClob): Unit
  
  /**
    * writes the next attribute to the stream as a date.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDate(x: Date): Unit
  
  /**
    * writes the next attribute to the stream as double.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeDouble(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as float.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeFloat(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as long.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeInt(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as hyper.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeLong(x: Double): Unit
  
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
  def writeObject(x: XSQLData): Unit
  
  /**
    * writes a REF(&lt;structured-type&gt;) to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeRef(x: XRef): Unit
  
  /**
    * writes the next attribute to the stream as short.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeShort(x: Double): Unit
  
  /**
    * writes the next attribute to the stream as a string.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeString(x: String): Unit
  
  /**
    * writes a structured-type to the stream.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeStruct(x: XStruct): Unit
  
  /**
    * writes the next attribute to the stream as a time.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTime(x: Time): Unit
  
  /**
    * writes the next attribute to the stream as a datetime.
    * @param x the value to pass to the database.
    * @throws SQLException if a database access error occurs.
    */
  def writeTimestamp(x: DateTime): Unit
}
object XSQLOutput {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeArray: XArray => Unit,
    writeBinaryStream: XInputStream => Unit,
    writeBlob: XBlob => Unit,
    writeBoolean: Boolean => Unit,
    writeByte: Double => Unit,
    writeBytes: SeqEquiv[Double] => Unit,
    writeCharacterStream: XInputStream => Unit,
    writeClob: XClob => Unit,
    writeDate: Date => Unit,
    writeDouble: Double => Unit,
    writeFloat: Double => Unit,
    writeInt: Double => Unit,
    writeLong: Double => Unit,
    writeObject: XSQLData => Unit,
    writeRef: XRef => Unit,
    writeShort: Double => Unit,
    writeString: String => Unit,
    writeStruct: XStruct => Unit,
    writeTime: Time => Unit,
    writeTimestamp: DateTime => Unit
  ): XSQLOutput = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeArray = js.Any.fromFunction1(writeArray), writeBinaryStream = js.Any.fromFunction1(writeBinaryStream), writeBlob = js.Any.fromFunction1(writeBlob), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeCharacterStream = js.Any.fromFunction1(writeCharacterStream), writeClob = js.Any.fromFunction1(writeClob), writeDate = js.Any.fromFunction1(writeDate), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeInt = js.Any.fromFunction1(writeInt), writeLong = js.Any.fromFunction1(writeLong), writeObject = js.Any.fromFunction1(writeObject), writeRef = js.Any.fromFunction1(writeRef), writeShort = js.Any.fromFunction1(writeShort), writeString = js.Any.fromFunction1(writeString), writeStruct = js.Any.fromFunction1(writeStruct), writeTime = js.Any.fromFunction1(writeTime), writeTimestamp = js.Any.fromFunction1(writeTimestamp))
    __obj.asInstanceOf[XSQLOutput]
  }
  
  @scala.inline
  implicit class XSQLOutputMutableBuilder[Self <: XSQLOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWriteArray(value: XArray => Unit): Self = StObject.set(x, "writeArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteBinaryStream(value: XInputStream => Unit): Self = StObject.set(x, "writeBinaryStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteBlob(value: XBlob => Unit): Self = StObject.set(x, "writeBlob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteBoolean(value: Boolean => Unit): Self = StObject.set(x, "writeBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteByte(value: Double => Unit): Self = StObject.set(x, "writeByte", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteBytes(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "writeBytes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteCharacterStream(value: XInputStream => Unit): Self = StObject.set(x, "writeCharacterStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteClob(value: XClob => Unit): Self = StObject.set(x, "writeClob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteDate(value: Date => Unit): Self = StObject.set(x, "writeDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteDouble(value: Double => Unit): Self = StObject.set(x, "writeDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteFloat(value: Double => Unit): Self = StObject.set(x, "writeFloat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteInt(value: Double => Unit): Self = StObject.set(x, "writeInt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteLong(value: Double => Unit): Self = StObject.set(x, "writeLong", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteObject(value: XSQLData => Unit): Self = StObject.set(x, "writeObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteRef(value: XRef => Unit): Self = StObject.set(x, "writeRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteShort(value: Double => Unit): Self = StObject.set(x, "writeShort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteString(value: String => Unit): Self = StObject.set(x, "writeString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteStruct(value: XStruct => Unit): Self = StObject.set(x, "writeStruct", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteTime(value: Time => Unit): Self = StObject.set(x, "writeTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteTimestamp(value: DateTime => Unit): Self = StObject.set(x, "writeTimestamp", js.Any.fromFunction1(value))
  }
}
