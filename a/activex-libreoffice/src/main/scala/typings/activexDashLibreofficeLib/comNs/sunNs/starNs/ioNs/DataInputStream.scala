package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

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
    acquire: () => scala.Unit,
    available: () => scala.Double,
    closeInput: () => scala.Unit,
    getInputStream: () => XInputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readBoolean: () => scala.Double,
    readByte: () => scala.Double,
    readBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readChar: () => java.lang.String,
    readDouble: () => scala.Double,
    readFloat: () => scala.Double,
    readHyper: () => scala.Double,
    readLong: () => scala.Double,
    readShort: () => scala.Double,
    readSomeBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readUTF: () => java.lang.String,
    release: () => scala.Unit,
    setInputStream: XInputStream => scala.Unit,
    setPredecessor: XConnectable => scala.Unit,
    setSuccessor: XConnectable => scala.Unit,
    skipBytes: scala.Double => scala.Unit
  ): DataInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, Predecessor = Predecessor, Successor = Successor, acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), getInputStream = js.Any.fromFunction0(getInputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction2(readBytes), readChar = js.Any.fromFunction0(readChar), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readHyper = js.Any.fromFunction0(readHyper), readLong = js.Any.fromFunction0(readLong), readShort = js.Any.fromFunction0(readShort), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = js.Any.fromFunction0(readUTF), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[DataInputStream]
  }
}

