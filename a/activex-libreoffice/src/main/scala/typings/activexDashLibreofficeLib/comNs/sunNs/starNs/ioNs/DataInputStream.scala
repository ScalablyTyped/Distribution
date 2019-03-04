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
    acquire: js.Function0[scala.Unit],
    available: js.Function0[scala.Double],
    closeInput: js.Function0[scala.Unit],
    getInputStream: js.Function0[XInputStream],
    getPredecessor: js.Function0[XConnectable],
    getSuccessor: js.Function0[XConnectable],
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
  ): DataInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, Predecessor = Predecessor, Successor = Successor, acquire = acquire, available = available, closeInput = closeInput, getInputStream = getInputStream, getPredecessor = getPredecessor, getSuccessor = getSuccessor, queryInterface = queryInterface, readBoolean = readBoolean, readByte = readByte, readBytes = readBytes, readChar = readChar, readDouble = readDouble, readFloat = readFloat, readHyper = readHyper, readLong = readLong, readShort = readShort, readSomeBytes = readSomeBytes, readUTF = readUTF, release = release, setInputStream = setInputStream, setPredecessor = setPredecessor, setSuccessor = setSuccessor, skipBytes = skipBytes)
  
    __obj.asInstanceOf[DataInputStream]
  }
}

