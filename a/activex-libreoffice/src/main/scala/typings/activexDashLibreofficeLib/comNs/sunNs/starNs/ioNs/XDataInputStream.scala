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

