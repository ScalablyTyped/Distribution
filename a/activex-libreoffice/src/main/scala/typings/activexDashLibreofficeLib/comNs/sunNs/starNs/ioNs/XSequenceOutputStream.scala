package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface offers access to the written bytes */
trait XSequenceOutputStream extends XOutputStream {
  /** allows to get access to the written data */
  val WrittenBytes: activexDashInteropLib.SafeArray[scala.Double]
  /** allows to get access to the written data */
  def getWrittenBytes(): activexDashInteropLib.SafeArray[scala.Double]
}

object XSequenceOutputStream {
  @scala.inline
  def apply(
    WrittenBytes: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    getWrittenBytes: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    writeBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): XSequenceOutputStream = {
    val __obj = js.Dynamic.literal(WrittenBytes = WrittenBytes, acquire = acquire, closeOutput = closeOutput, flush = flush, getWrittenBytes = getWrittenBytes, queryInterface = queryInterface, release = release, writeBytes = writeBytes)
  
    __obj.asInstanceOf[XSequenceOutputStream]
  }
}

