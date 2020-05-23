package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
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
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    getOutputStream: () => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setOutputStream: XOutputStream => Unit,
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
  ): DataOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getOutputStream = js.Any.fromFunction0(getOutputStream), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
    __obj.asInstanceOf[DataOutputStream]
  }
}

