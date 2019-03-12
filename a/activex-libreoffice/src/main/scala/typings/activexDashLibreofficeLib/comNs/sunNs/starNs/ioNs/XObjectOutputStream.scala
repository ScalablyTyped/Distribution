package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * stores {@link XPersistObject} implementations into the stream
  *
  * An implementation of the type {@link XPersistObject} uses this interface to write its internal state into a stream. Have a look there for the
  * explanation of the concept.
  * @see com.sun.star.io.XPersistObject
  */
trait XObjectOutputStream extends XDataOutputStream {
  /**
    * writes an object to the stream.
    * @param Object the object, which shall serialize itself into the stream.
    */
  def writeObject(Object: XPersistObject): scala.Unit
}

object XObjectOutputStream {
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
    writeObject: XPersistObject => scala.Unit,
    writeShort: scala.Double => scala.Unit,
    writeUTF: java.lang.String => scala.Unit
  ): XObjectOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeObject = js.Any.fromFunction1(writeObject), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
  
    __obj.asInstanceOf[XObjectOutputStream]
  }
}

