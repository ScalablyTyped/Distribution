package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to set marks in an inputstream and to later jump back to these marks.
  *
  * The implementation reads the original data from the input stream, that has been set previously at the {@link XActiveDataSink} interface. In general
  * the implementation must buffer the data.
  */
trait MarkableInputStream
  extends XInputStream
     with XMarkableStream
     with XActiveDataSink
     with XConnectable

object MarkableInputStream {
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
    readBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    readSomeBytes: js.Function2[
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Double, 
      scala.Double
    ],
    release: js.Function0[scala.Unit],
    setInputStream: js.Function1[XInputStream, scala.Unit],
    setPredecessor: js.Function1[XConnectable, scala.Unit],
    setSuccessor: js.Function1[XConnectable, scala.Unit],
    skipBytes: js.Function1[scala.Double, scala.Unit]
  ): MarkableInputStream = {
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
    __obj.updateDynamic("readBytes")(readBytes)
    __obj.updateDynamic("readSomeBytes")(readSomeBytes)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setInputStream")(setInputStream)
    __obj.updateDynamic("setPredecessor")(setPredecessor)
    __obj.updateDynamic("setSuccessor")(setSuccessor)
    __obj.updateDynamic("skipBytes")(skipBytes)
    __obj.asInstanceOf[MarkableInputStream]
  }
}

