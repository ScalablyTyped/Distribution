package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stream which allows reading the data of persistent objects.
  *
  * Implementations of this service must fulfill the specifications of the {@link DataInputStream} service. It must be chained to an {@link
  * XMarkableStream} . Therefore, it provides the {@link XMarkableStream} interface, and delegates the calls to the chained object.
  *
  * The written objects are held until this instance is destroyed. The references to the objects are read as four-byte integers. Data format reads:
  *
  * `; short   InfoLength; long    ObjectReference  // 0 indicates no object; UTF     ServiceName      // length of 0 indicates this is only a reference;
  * long    ObjectLength     // 0 if it is a reference or no object, otherwise the len of the object data; Object  ObjectData       // the data of the
  * object; ...                      // skipping additional data; `
  */
trait ObjectInputStream
  extends XObjectInputStream
     with XActiveDataSink
     with XConnectable
     with XMarkableStream

object ObjectInputStream {
  @scala.inline
  def apply(
    InputStream: XInputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: () => scala.Unit,
    available: () => scala.Double,
    closeInput: () => scala.Unit,
    createMark: () => scala.Double,
    deleteMark: scala.Double => scala.Unit,
    getInputStream: () => XInputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    jumpToFurthest: () => scala.Unit,
    jumpToMark: scala.Double => scala.Unit,
    offsetToMark: scala.Double => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    readBoolean: () => scala.Double,
    readByte: () => scala.Double,
    readBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readChar: () => java.lang.String,
    readDouble: () => scala.Double,
    readFloat: () => scala.Double,
    readHyper: () => scala.Double,
    readLong: () => scala.Double,
    readObject: () => XPersistObject,
    readShort: () => scala.Double,
    readSomeBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readUTF: () => java.lang.String,
    release: () => scala.Unit,
    setInputStream: XInputStream => scala.Unit,
    setPredecessor: XConnectable => scala.Unit,
    setSuccessor: XConnectable => scala.Unit,
    skipBytes: scala.Double => scala.Unit
  ): ObjectInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, Predecessor = Predecessor, Successor = Successor, acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), getInputStream = js.Any.fromFunction0(getInputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction2(readBytes), readChar = js.Any.fromFunction0(readChar), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readHyper = js.Any.fromFunction0(readHyper), readLong = js.Any.fromFunction0(readLong), readObject = js.Any.fromFunction0(readObject), readShort = js.Any.fromFunction0(readShort), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = js.Any.fromFunction0(readUTF), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[ObjectInputStream]
  }
}

