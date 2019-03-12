package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a stream which allows writing the data of persistent objects.
  *
  * Implementations of this service must fulfill the specifications of the {@link DataOutputStream} service; furthermore, the stream needs to be chained
  * to a {@link XMarkableStream} . Therefore, it also provides the {@link XMarkableStream} interface, but it delegates the calls to the chained object.
  * The written objects are held until this instance is destroyed. The references to the objects are written as four-byte integers and begin at 1. Data
  * format is written:
  *
  * `; short   InfoLength; long    ObjectReference // 0 indicates no object; UTF     ServiceName     // length of 0 indicates this is only a reference;
  * long    ObjectLength    // 0 if it is a reference or no object, otherwise the len of the object data; Object  ObjectData      // the data of the
  * object; `
  */
trait ObjectOutputStream
  extends XObjectOutputStream
     with XActiveDataSource
     with XConnectable

object ObjectOutputStream {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: () => scala.Unit,
    closeOutput: () => scala.Unit,
    flush: () => scala.Unit,
    getOutputStream: () => XOutputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setOutputStream: XOutputStream => scala.Unit,
    setPredecessor: XConnectable => scala.Unit,
    setSuccessor: XConnectable => scala.Unit,
    writeBoolean: scala.Boolean => scala.Unit,
    writeByte: scala.Double => scala.Unit,
    writeBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    writeChar: java.lang.String => scala.Unit,
    writeDouble: scala.Double => scala.Unit,
    writeFloat: scala.Double => scala.Unit,
    writeHyper: scala.Double => scala.Unit,
    writeLong: scala.Double => scala.Unit,
    writeObject: XPersistObject => scala.Unit,
    writeShort: scala.Double => scala.Unit,
    writeUTF: java.lang.String => scala.Unit
  ): ObjectOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, Predecessor = Predecessor, Successor = Successor, acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getOutputStream = js.Any.fromFunction0(getOutputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeObject = js.Any.fromFunction1(writeObject), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
  
    __obj.asInstanceOf[ObjectOutputStream]
  }
}

