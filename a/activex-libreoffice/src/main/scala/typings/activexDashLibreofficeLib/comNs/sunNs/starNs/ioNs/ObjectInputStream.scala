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
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    closeInput: js.Function0[scala.Unit],
    createMark: js.Function0[scala.Double],
    deleteMark: js.Function1[scala.Double, scala.Unit],
    getInputStream: js.Function0[XInputStream],
    getPredecessor: js.Function0[XConnectable],
    getSuccessor: js.Function0[XConnectable],
    jumpToFurthest: js.Function0[scala.Unit],
    jumpToMark: js.Function1[scala.Double, scala.Unit],
    offsetToMark: js.Function1[scala.Double, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readBoolean: js.Function0[scala.Double],
    readByte: js.Function0[scala.Double],
    readBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readChar: js.Function0[java.lang.String],
    readDouble: js.Function0[scala.Double],
    readFloat: js.Function0[scala.Double],
    readHyper: js.Function0[scala.Double],
    readLong: js.Function0[scala.Double],
    readObject: js.Function0[XPersistObject],
    readShort: js.Function0[scala.Double],
    readSomeBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readUTF: js.Function0[java.lang.String],
    release: js.Function0[scala.Unit],
    setInputStream: js.Function1[XInputStream, scala.Unit],
    setPredecessor: js.Function1[XConnectable, scala.Unit],
    setSuccessor: js.Function1[XConnectable, scala.Unit],
    skipBytes: js.Function1[scala.Double, scala.Unit]
  ): ObjectInputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InputStream")(InputStream)
    __obj.updateDynamic("Predecessor")(Predecessor)
    __obj.updateDynamic("Successor")(Successor)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("closeInput")(closeInput)
    __obj.updateDynamic("createMark")(createMark)
    __obj.updateDynamic("deleteMark")(deleteMark)
    __obj.updateDynamic("getInputStream")(getInputStream)
    __obj.updateDynamic("getPredecessor")(getPredecessor)
    __obj.updateDynamic("getSuccessor")(getSuccessor)
    __obj.updateDynamic("jumpToFurthest")(jumpToFurthest)
    __obj.updateDynamic("jumpToMark")(jumpToMark)
    __obj.updateDynamic("offsetToMark")(offsetToMark)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("readBoolean")(readBoolean)
    __obj.updateDynamic("readByte")(readByte)
    __obj.updateDynamic("readBytes")(readBytes)
    __obj.updateDynamic("readChar")(readChar)
    __obj.updateDynamic("readDouble")(readDouble)
    __obj.updateDynamic("readFloat")(readFloat)
    __obj.updateDynamic("readHyper")(readHyper)
    __obj.updateDynamic("readLong")(readLong)
    __obj.updateDynamic("readObject")(readObject)
    __obj.updateDynamic("readShort")(readShort)
    __obj.updateDynamic("readSomeBytes")(readSomeBytes)
    __obj.updateDynamic("readUTF")(readUTF)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setInputStream")(setInputStream)
    __obj.updateDynamic("setPredecessor")(setPredecessor)
    __obj.updateDynamic("setSuccessor")(setSuccessor)
    __obj.updateDynamic("skipBytes")(skipBytes)
    __obj.asInstanceOf[ObjectInputStream]
  }
}

