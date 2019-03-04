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
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    writeBoolean: js.Function1[scala.Boolean, scala.Unit],
    writeByte: js.Function1[scala.Double, scala.Unit],
    writeBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    writeChar: js.Function1[java.lang.String, scala.Unit],
    writeDouble: js.Function1[scala.Double, scala.Unit],
    writeFloat: js.Function1[scala.Double, scala.Unit],
    writeHyper: js.Function1[scala.Double, scala.Unit],
    writeLong: js.Function1[scala.Double, scala.Unit],
    writeShort: js.Function1[scala.Double, scala.Unit],
    writeUTF: js.Function1[java.lang.String, scala.Unit]
  ): XDataOutputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire, closeOutput = closeOutput, flush = flush, queryInterface = queryInterface, release = release, writeBoolean = writeBoolean, writeByte = writeByte, writeBytes = writeBytes, writeChar = writeChar, writeDouble = writeDouble, writeFloat = writeFloat, writeHyper = writeHyper, writeLong = writeLong, writeShort = writeShort, writeUTF = writeUTF)
  
    __obj.asInstanceOf[XDataOutputStream]
  }
}

