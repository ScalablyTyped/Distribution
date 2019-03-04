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
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getOutputStream: js.Function0[XOutputStream],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setOutputStream: js.Function1[XOutputStream, scala.Unit],
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
  ): DataOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = acquire, closeOutput = closeOutput, flush = flush, getOutputStream = getOutputStream, queryInterface = queryInterface, release = release, setOutputStream = setOutputStream, writeBoolean = writeBoolean, writeByte = writeByte, writeBytes = writeBytes, writeChar = writeChar, writeDouble = writeDouble, writeFloat = writeFloat, writeHyper = writeHyper, writeLong = writeLong, writeShort = writeShort, writeUTF = writeUTF)
  
    __obj.asInstanceOf[DataOutputStream]
  }
}

