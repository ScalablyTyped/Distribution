package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to write machine-independent simple data types to a stream.
  * @see com.sun.star.io.XDataInputStream
  */
@js.native
trait XDataOutputStream extends XOutputStream {
  /** writes a boolean. It is an 8-bit value. 0 means FALSE; all other values mean TRUE. */
  def writeBoolean(Value: Boolean): Unit = js.native
  /** writes an 8-bit byte. */
  def writeByte(Value: Double): Unit = js.native
  /** writes a 16-bit character. */
  def writeChar(Value: String): Unit = js.native
  /** writes a 64-bit IEEE double. */
  def writeDouble(Value: Double): Unit = js.native
  /** writes a 32-bit IEEE float. */
  def writeFloat(Value: Double): Unit = js.native
  /** writes a 64-bit big endian integer. */
  def writeHyper(Value: Double): Unit = js.native
  /** writes a 32-bit big endian integer. */
  def writeLong(Value: Double): Unit = js.native
  /** writes a 16-bit big endian integer. */
  def writeShort(Value: Double): Unit = js.native
  /** writes a string in UTF format. */
  def writeUTF(Value: String): Unit = js.native
}

object XDataOutputStream {
  @scala.inline
  def apply(
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    writeBoolean: Boolean => Unit,
    writeByte: Double => Unit,
    writeBytes: SeqEquiv[Double] => Unit,
    writeChar: String => Unit,
    writeDouble: Double => Unit,
    writeFloat: Double => Unit,
    writeHyper: Double => Unit,
    writeLong: Double => Unit,
    writeShort: Double => Unit,
    writeUTF: String => Unit
  ): XDataOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
    __obj.asInstanceOf[XDataOutputStream]
  }
  @scala.inline
  implicit class XDataOutputStreamOps[Self <: XDataOutputStream] (val x: Self) extends AnyVal {
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
    def setWriteBoolean(value: Boolean => Unit): Self = this.set("writeBoolean", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteByte(value: Double => Unit): Self = this.set("writeByte", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteChar(value: String => Unit): Self = this.set("writeChar", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteDouble(value: Double => Unit): Self = this.set("writeDouble", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteFloat(value: Double => Unit): Self = this.set("writeFloat", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteHyper(value: Double => Unit): Self = this.set("writeHyper", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteLong(value: Double => Unit): Self = this.set("writeLong", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteShort(value: Double => Unit): Self = this.set("writeShort", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteUTF(value: String => Unit): Self = this.set("writeUTF", js.Any.fromFunction1(value))
  }
  
}

