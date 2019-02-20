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

