package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
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
@js.native
trait XObjectOutputStream extends XDataOutputStream {
  /**
    * writes an object to the stream.
    * @param Object the object, which shall serialize itself into the stream.
    */
  def writeObject(Object: XPersistObject): Unit = js.native
}

object XObjectOutputStream {
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
    writeObject: XPersistObject => Unit,
    writeShort: Double => Unit,
    writeUTF: String => Unit
  ): XObjectOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeObject = js.Any.fromFunction1(writeObject), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
    __obj.asInstanceOf[XObjectOutputStream]
  }
  @scala.inline
  implicit class XObjectOutputStreamOps[Self <: XObjectOutputStream] (val x: Self) extends AnyVal {
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
    def setWriteObject(value: XPersistObject => Unit): Self = this.set("writeObject", js.Any.fromFunction1(value))
  }
  
}

