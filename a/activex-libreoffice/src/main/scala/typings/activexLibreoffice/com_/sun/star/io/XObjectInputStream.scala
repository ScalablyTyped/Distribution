package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** reads {@link XPersistObject} implementations from a stream */
@js.native
trait XObjectInputStream extends XDataInputStream {
  /**
    * reads an object from the stream. In general, it reads the service name, instantiaties the object and calls read on the {@link XPersistObject}
    * interface with itself as argument.
    */
  def readObject(): XPersistObject = js.native
}

object XObjectInputStream {
  @scala.inline
  def apply(
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    queryInterface: `type` => js.Any,
    readBoolean: () => Double,
    readByte: () => Double,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readChar: () => String,
    readDouble: () => Double,
    readFloat: () => Double,
    readHyper: () => Double,
    readLong: () => Double,
    readObject: () => XPersistObject,
    readShort: () => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readUTF: () => String,
    release: () => Unit,
    skipBytes: Double => Unit
  ): XObjectInputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction2(readBytes), readChar = js.Any.fromFunction0(readChar), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readHyper = js.Any.fromFunction0(readHyper), readLong = js.Any.fromFunction0(readLong), readObject = js.Any.fromFunction0(readObject), readShort = js.Any.fromFunction0(readShort), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = js.Any.fromFunction0(readUTF), release = js.Any.fromFunction0(release), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[XObjectInputStream]
  }
  @scala.inline
  implicit class XObjectInputStreamOps[Self <: XObjectInputStream] (val x: Self) extends AnyVal {
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
    def setReadObject(value: () => XPersistObject): Self = this.set("readObject", js.Any.fromFunction0(value))
  }
  
}

