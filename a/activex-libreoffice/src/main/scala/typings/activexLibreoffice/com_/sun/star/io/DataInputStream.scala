package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * reads structured data from a chained {@link XInputStream} .
  *
  * An implementation of this service in general does not need to buffer data itself.
  * @see com.sun.star.io.ObjectInputStream
  */
trait DataInputStream
  extends XDataInputStream
     with XActiveDataSink
     with XConnectable

object DataInputStream {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    getInputStream: () => XInputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    queryInterface: `type` => js.Any,
    readBoolean: () => Double,
    readByte: () => Double,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readChar: () => String,
    readDouble: () => Double,
    readFloat: () => Double,
    readHyper: () => Double,
    readLong: () => Double,
    readShort: () => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readUTF: () => String,
    release: () => Unit,
    setInputStream: XInputStream => Unit,
    setPredecessor: XConnectable => Unit,
    setSuccessor: XConnectable => Unit,
    skipBytes: Double => Unit
  ): DataInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), getInputStream = js.Any.fromFunction0(getInputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction2(readBytes), readChar = js.Any.fromFunction0(readChar), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readHyper = js.Any.fromFunction0(readHyper), readLong = js.Any.fromFunction0(readLong), readShort = js.Any.fromFunction0(readShort), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = js.Any.fromFunction0(readUTF), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[DataInputStream]
  }
}

