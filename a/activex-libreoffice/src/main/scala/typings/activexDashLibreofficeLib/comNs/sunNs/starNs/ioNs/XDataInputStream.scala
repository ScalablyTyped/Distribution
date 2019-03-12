package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to read machine-independent simple data types from a stream.
  * @see com.sun.star.io.XDataOutputStream
  */
trait XDataInputStream extends XInputStream {
  /** reads in a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def readBoolean(): scala.Double
  /** reads an 8-bit byte. */
  def readByte(): scala.Double
  /** reads a 16-bit unicode character. */
  def readChar(): java.lang.String
  /** reads a 64-bit IEEE double. */
  def readDouble(): scala.Double
  /** reads a 32-bit IEEE float. */
  def readFloat(): scala.Double
  /** reads a 64-bit big endian integer. */
  def readHyper(): scala.Double
  /** reads a 32-bit big endian integer. */
  def readLong(): scala.Double
  /** reads a 16-bit big endian integer. */
  def readShort(): scala.Double
  /** reads a string of UTF encoded characters. */
  def readUTF(): java.lang.String
}

object XDataInputStream {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    available: () => scala.Double,
    closeInput: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readBoolean: () => scala.Double,
    readByte: () => scala.Double,
    readBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readChar: () => java.lang.String,
    readDouble: () => scala.Double,
    readFloat: () => scala.Double,
    readHyper: () => scala.Double,
    readLong: () => scala.Double,
    readShort: () => scala.Double,
    readSomeBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readUTF: () => java.lang.String,
    release: () => scala.Unit,
    skipBytes: scala.Double => scala.Unit
  ): XDataInputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction2(readBytes), readChar = js.Any.fromFunction0(readChar), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readHyper = js.Any.fromFunction0(readHyper), readLong = js.Any.fromFunction0(readLong), readShort = js.Any.fromFunction0(readShort), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = js.Any.fromFunction0(readUTF), release = js.Any.fromFunction0(release), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[XDataInputStream]
  }
}

