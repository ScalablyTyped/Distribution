package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface offers access to the written bytes */
trait XSequenceOutputStream extends XOutputStream {
  /** allows to get access to the written data */
  val WrittenBytes: SafeArray[Double]
  /** allows to get access to the written data */
  def getWrittenBytes(): SafeArray[Double]
}

object XSequenceOutputStream {
  @scala.inline
  def apply(
    WrittenBytes: SafeArray[Double],
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    getWrittenBytes: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeBytes: SeqEquiv[Double] => Unit
  ): XSequenceOutputStream = {
    val __obj = js.Dynamic.literal(WrittenBytes = WrittenBytes, acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getWrittenBytes = js.Any.fromFunction0(getWrittenBytes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBytes = js.Any.fromFunction1(writeBytes))
  
    __obj.asInstanceOf[XSequenceOutputStream]
  }
}

