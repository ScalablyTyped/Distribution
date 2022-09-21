package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the representation (mapping) of an SQL **BLOB** .
  *
  * A SQL ** BLOB ** is a built-in type that stores a Binary Large Object as a column value in a row of a database table. The driver implements ** BLOB **
  * using a SQL `locator(BLOB)` , which means that a `Blob` object contains a logical pointer to the SQL ** BLOB ** data rather than the data itself. ;  A
  * `Blob` object is valid for the duration of the transaction in which is was created.
  *
  * Methods in the interfaces {@link com.sun.star.sdbc.XResultSet} , and {@link com.sun.star.sdbc.XPreparedStatement} , such as `getBlob` and `setBlob`
  * allow a programmer to access the SQL **BLOB** . ;  The `Blob` interface provides methods for getting the length of a SQL ** BLOB ** (Binary Large
  * Object) value, for materializing a ** BLOB ** value on the client and for determining the position of a pattern of bytes within a ** BLOB ** value.
  */
trait XBlob
  extends StObject
     with XInterface {
  
  /**
    * retrieves the ** BLOB ** designated by this `Blob` instance as a stream.
    * @returns the stream
    * @throws SQLException if a database access error occurs.
    */
  val BinaryStream: XInputStream
  
  /**
    * retrieves the ** BLOB ** designated by this `Blob` instance as a stream.
    * @returns the stream
    * @throws SQLException if a database access error occurs.
    */
  def getBinaryStream(): XInputStream
  
  /**
    * returns as an array of bytes part or all of the ** BLOB ** value that this `Blob` object designates. The byte array contains up to `length`
    * consecutive bytes starting at position `pos` .
    * @param pos is the ordinal position of the first byte in the ** BLOB ** value to be extracted; the first byte is at position 1.
    * @param length is the number of consecutive bytes to be copied.
    * @returns a byte array containing up to `length` consecutive bytes from the ** BLOB ** value designated by this `Blob` object, starting with the byte at po
    * @throws SQLException if there is an error accessing the **BLOB** .
    */
  def getBytes(pos: Double, length: Double): SafeArray[Double]
  
  /**
    * returns the number of bytes in the ** BLOB ** value designated by this `Blob` object.
    * @returns the length
    * @throws SQLException if a database access error occurs.
    */
  def length(): Double
  
  /**
    * determines the byte position at which the specified byte `pattern` begins within the ** BLOB ** value that this `Blob` object represents. The search
    * for `pattern` begins at position `start` .
    * @param pattern the pattern to search
    * @param start the start position for the search
    * @returns the position
    * @throws SQLException if a database access error occurs.
    */
  def position(pattern: SeqEquiv[Double], start: Double): Double
  
  /**
    * determines the byte position in the ** BLOB ** value designated by this `Blob` object at which `pattern` begins. The search begins at position `start`
    * .
    * @param pattern the pattern to search
    * @param start position to start
    * @returns the position
    * @throws SQLException if a database access error occurs.
    */
  def positionOfBlob(pattern: XBlob, start: Double): Double
}
object XBlob {
  
  inline def apply(
    BinaryStream: XInputStream,
    acquire: () => Unit,
    getBinaryStream: () => XInputStream,
    getBytes: (Double, Double) => SafeArray[Double],
    length: () => Double,
    position: (SeqEquiv[Double], Double) => Double,
    positionOfBlob: (XBlob, Double) => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XBlob = {
    val __obj = js.Dynamic.literal(BinaryStream = BinaryStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBinaryStream = js.Any.fromFunction0(getBinaryStream), getBytes = js.Any.fromFunction2(getBytes), length = js.Any.fromFunction0(length), position = js.Any.fromFunction2(position), positionOfBlob = js.Any.fromFunction2(positionOfBlob), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBlob]
  }
  
  extension [Self <: XBlob](x: Self) {
    
    inline def setBinaryStream(value: XInputStream): Self = StObject.set(x, "BinaryStream", value.asInstanceOf[js.Any])
    
    inline def setGetBinaryStream(value: () => XInputStream): Self = StObject.set(x, "getBinaryStream", js.Any.fromFunction0(value))
    
    inline def setGetBytes(value: (Double, Double) => SafeArray[Double]): Self = StObject.set(x, "getBytes", js.Any.fromFunction2(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setPosition(value: (SeqEquiv[Double], Double) => Double): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
    
    inline def setPositionOfBlob(value: (XBlob, Double) => Double): Self = StObject.set(x, "positionOfBlob", js.Any.fromFunction2(value))
  }
}
