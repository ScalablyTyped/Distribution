package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface offers access to the written bytes */
trait XSequenceOutputStream extends XOutputStream {
  /** allows to get access to the written data */
  val WrittenBytes: stdLib.SafeArray[scala.Double]
  /** allows to get access to the written data */
  def getWrittenBytes(): stdLib.SafeArray[scala.Double]
}

object XSequenceOutputStream {
  @scala.inline
  def apply(
    WrittenBytes: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    closeOutput: () => scala.Unit,
    flush: () => scala.Unit,
    getWrittenBytes: () => stdLib.SafeArray[scala.Double],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    writeBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit
  ): XSequenceOutputStream = {
    val __obj = js.Dynamic.literal(WrittenBytes = WrittenBytes, acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getWrittenBytes = js.Any.fromFunction0(getWrittenBytes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBytes = js.Any.fromFunction1(writeBytes))
  
    __obj.asInstanceOf[XSequenceOutputStream]
  }
}

