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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InputStream")(InputStream)
    __obj.updateDynamic("Predecessor")(Predecessor)
    __obj.updateDynamic("Successor")(Successor)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("closeInput")(closeInput)
    __obj.updateDynamic("getInputStream")(getInputStream)
    __obj.updateDynamic("getPredecessor")(getPredecessor)
    __obj.updateDynamic("getSuccessor")(getSuccessor)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("readBoolean")(readBoolean)
    __obj.updateDynamic("readByte")(readByte)
    __obj.updateDynamic("readBytes")(readBytes)
    __obj.updateDynamic("readChar")(readChar)
    __obj.updateDynamic("readDouble")(readDouble)
    __obj.updateDynamic("readFloat")(readFloat)
    __obj.updateDynamic("readHyper")(readHyper)
    __obj.updateDynamic("readLong")(readLong)
    __obj.updateDynamic("readShort")(readShort)
    __obj.updateDynamic("readSomeBytes")(readSomeBytes)
    __obj.updateDynamic("readUTF")(readUTF)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setInputStream")(setInputStream)
    __obj.updateDynamic("setPredecessor")(setPredecessor)
    __obj.updateDynamic("setSuccessor")(setSuccessor)
    __obj.updateDynamic("skipBytes")(skipBytes)
    __obj.asInstanceOf[DataInputStream]
  }
}

