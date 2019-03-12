package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * writes structured data to a chained {@link XOutputStream} .
  *
  * An implementation of this service in general does not need to buffer data itself.
  */
trait DataOutputStream
  extends XDataOutputStream
     with XActiveDataSource

object DataOutputStream {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: () => scala.Unit,
    closeOutput: () => scala.Unit,
    flush: () => scala.Unit,
    getOutputStream: () => XOutputStream,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setOutputStream: XOutputStream => scala.Unit,
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
  ): DataOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
  
    __obj.asInstanceOf[DataOutputStream]
  }
}

