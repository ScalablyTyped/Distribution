package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XObjectOutputStream
     with XActiveDataSource
     with XConnectable
object ObjectOutputStream {
  
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    getOutputStream: () => XOutputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setOutputStream: XOutputStream => Unit,
    setPredecessor: XConnectable => Unit,
    setSuccessor: XConnectable => Unit,
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
  ): ObjectOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), getOutputStream = js.Any.fromFunction0(getOutputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), writeBoolean = js.Any.fromFunction1(writeBoolean), writeByte = js.Any.fromFunction1(writeByte), writeBytes = js.Any.fromFunction1(writeBytes), writeChar = js.Any.fromFunction1(writeChar), writeDouble = js.Any.fromFunction1(writeDouble), writeFloat = js.Any.fromFunction1(writeFloat), writeHyper = js.Any.fromFunction1(writeHyper), writeLong = js.Any.fromFunction1(writeLong), writeObject = js.Any.fromFunction1(writeObject), writeShort = js.Any.fromFunction1(writeShort), writeUTF = js.Any.fromFunction1(writeUTF))
    __obj.asInstanceOf[ObjectOutputStream]
  }
}
