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
    val __obj = js.Dynamic.literal(InputStream = InputStream, Predecessor = Predecessor, Successor = Successor, acquire = acquire, available = available, closeInput = closeInput, createMark = createMark, deleteMark = deleteMark, getInputStream = getInputStream, getPredecessor = getPredecessor, getSuccessor = getSuccessor, jumpToFurthest = jumpToFurthest, jumpToMark = jumpToMark, offsetToMark = offsetToMark, queryInterface = queryInterface, readBytes = readBytes, readSomeBytes = readSomeBytes, release = release, setInputStream = setInputStream, setPredecessor = setPredecessor, setSuccessor = setSuccessor, skipBytes = skipBytes)
  
    __obj.asInstanceOf[MarkableInputStream]
  }
}

