package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the ** BLOB ** designated by this `Blob` instance as a stream.
    * @returns the stream
    * @throws SQLException if a database access error occurs.
    */
  val BinaryStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * retrieves the ** BLOB ** designated by this `Blob` instance as a stream.
    * @returns the stream
    * @throws SQLException if a database access error occurs.
    */
  def getBinaryStream(): activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  /**
    * returns as an array of bytes part or all of the ** BLOB ** value that this `Blob` object designates. The byte array contains up to `length`
    * consecutive bytes starting at position `pos` .
    * @param pos is the ordinal position of the first byte in the ** BLOB ** value to be extracted; the first byte is at position 1.
    * @param length is the number of consecutive bytes to be copied.
    * @returns a byte array containing up to `length` consecutive bytes from the ** BLOB ** value designated by this `Blob` object, starting with the byte at po
    * @throws SQLException if there is an error accessing the **BLOB** .
    */
  def getBytes(pos: scala.Double, length: scala.Double): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * returns the number of bytes in the ** BLOB ** value designated by this `Blob` object.
    * @returns the length
    * @throws SQLException if a database access error occurs.
    */
  def length(): scala.Double
  /**
    * determines the byte position at which the specified byte `pattern` begins within the ** BLOB ** value that this `Blob` object represents. The search
    * for `pattern` begins at position `start` .
    * @param pattern the pattern to search
    * @param start the start position for the search
    * @returns the position
    * @throws SQLException if a database access error occurs.
    */
  def position(pattern: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], start: scala.Double): scala.Double
  /**
    * determines the byte position in the ** BLOB ** value designated by this `Blob` object at which `pattern` begins. The search begins at position `start`
    * .
    * @param pattern the pattern to search
    * @param start position to start
    * @returns the position
    * @throws SQLException if a database access error occurs.
    */
  def positionOfBlob(pattern: XBlob, start: scala.Double): scala.Double
}

object XBlob {
  @scala.inline
  def apply(
    BinaryStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    acquire: js.Function0[scala.Unit],
    getBinaryStream: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream],
    getBytes: js.Function2[scala.Double, scala.Double, activexDashInteropLib.SafeArray[scala.Double]],
    length: js.Function0[scala.Double],
    position: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Double, 
      scala.Double
    ],
    positionOfBlob: js.Function2[XBlob, scala.Double, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBlob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BinaryStream")(BinaryStream)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getBinaryStream")(getBinaryStream)
    __obj.updateDynamic("getBytes")(getBytes)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("positionOfBlob")(positionOfBlob)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XBlob]
  }
}

