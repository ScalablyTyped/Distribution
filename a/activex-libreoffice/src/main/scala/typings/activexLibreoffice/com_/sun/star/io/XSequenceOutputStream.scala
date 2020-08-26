package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface offers access to the written bytes */
@js.native
trait XSequenceOutputStream extends XOutputStream {
  /** allows to get access to the written data */
  val WrittenBytes: SafeArray[Double] = js.native
  /** allows to get access to the written data */
  def getWrittenBytes(): SafeArray[Double] = js.native
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
    val __obj = js.Dynamic.literal(WrittenBytes = WrittenBytes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getWrittenBytes = js.Any.fromFunction0(getWrittenBytes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBytes = js.Any.fromFunction1(writeBytes))
    __obj.asInstanceOf[XSequenceOutputStream]
  }
  @scala.inline
  implicit class XSequenceOutputStreamOps[Self <: XSequenceOutputStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWrittenBytes(value: SafeArray[Double]): Self = this.set("WrittenBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetWrittenBytes(value: () => SafeArray[Double]): Self = this.set("getWrittenBytes", js.Any.fromFunction0(value))
  }
  
}

