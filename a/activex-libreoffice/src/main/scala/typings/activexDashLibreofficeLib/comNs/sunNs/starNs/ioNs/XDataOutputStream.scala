package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to write machine-independent simple data types to a stream.
  * @see com.sun.star.io.XDataInputStream
  */
trait XDataOutputStream extends XOutputStream {
  /** writes a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def writeBoolean(Value: scala.Boolean): scala.Unit
  /** writes an 8-bit byte. */
  def writeByte(Value: scala.Double): scala.Unit
  /** writes a 16-bit character. */
  def writeChar(Value: java.lang.String): scala.Unit
  /** writes a 64-bit IEEE double. */
  def writeDouble(Value: scala.Double): scala.Unit
  /** writes a 32-bit IEEE float. */
  def writeFloat(Value: scala.Double): scala.Unit
  /** writes a 64-bit big endian integer. */
  def writeHyper(Value: scala.Double): scala.Unit
  /** writes a 32-bit big endian integer. */
  def writeLong(Value: scala.Double): scala.Unit
  /** writes a 16-bit big endian integer. */
  def writeShort(Value: scala.Double): scala.Unit
  /** writes a string in UTF format. */
  def writeUTF(Value: java.lang.String): scala.Unit
}

object XDataOutputStream {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    closeOutput: () => scala.Unit,
    flush: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    writeBoolean: scala.Boolean => scala.Unit,
    writeByte: scala.Double => scala.Unit,
    writeBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    writeChar: java.lang.String => scala.Unit,
    writeDouble: scala.Double => scala.Unit,
    writeFloat: scala.Double => scala.Unit,
    writeHyper: scala.Double => scala.Unit,
    writeLong: scala.Double => scala.Unit,
    writeShort: scala.Double => scala.Unit,
    writeUTF: java.lang.String => scala.Unit
  ): XDataOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
  
    __obj.asInstanceOf[XDataOutputStream]
  }
}

