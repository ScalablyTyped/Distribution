package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** reads {@link XPersistObject} implementations from a stream */
trait XObjectInputStream extends XDataInputStream {
  /**
    * reads an object from the stream. In general, it reads the service name, instantiaties the object and calls read on the {@link XPersistObject}
    * interface with itself as argument.
    */
  def readObject(): XPersistObject
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
}

