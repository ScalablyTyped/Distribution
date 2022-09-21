package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XObjectInputStream
     with XActiveDataSink
     with XConnectable
     with XMarkableStream
object ObjectInputStream {
  
  inline def apply(
    InputStream: XInputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    createMark: () => Double,
    deleteMark: Double => Unit,
    getInputStream: () => XInputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    jumpToFurthest: () => Unit,
    jumpToMark: Double => Unit,
    offsetToMark: Double => Double,
    queryInterface: `type` => Any,
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
    setInputStream: XInputStream => Unit,
    setPredecessor: XConnectable => Unit,
    setSuccessor: XConnectable => Unit,
    skipBytes: Double => Unit
  ): ObjectInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), getInputStream = js.Any.fromFunction0(getInputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), readBoolean = js.Any.fromFunction0(readBoolean), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction2(readBytes), readChar = js.Any.fromFunction0(readChar), readDouble = js.Any.fromFunction0(readDouble), readFloat = js.Any.fromFunction0(readFloat), readHyper = js.Any.fromFunction0(readHyper), readLong = js.Any.fromFunction0(readLong), readObject = js.Any.fromFunction0(readObject), readShort = js.Any.fromFunction0(readShort), readSomeBytes = js.Any.fromFunction2(readSomeBytes), readUTF = js.Any.fromFunction0(readUTF), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[ObjectInputStream]
  }
}
