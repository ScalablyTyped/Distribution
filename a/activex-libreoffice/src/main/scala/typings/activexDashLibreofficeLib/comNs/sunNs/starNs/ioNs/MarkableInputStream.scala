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
    readBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    readSomeBytes: (js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], scala.Double) => scala.Double,
    release: () => scala.Unit,
    setInputStream: XInputStream => scala.Unit,
    setPredecessor: XConnectable => scala.Unit,
    setSuccessor: XConnectable => scala.Unit,
    skipBytes: scala.Double => scala.Unit
  ): MarkableInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream, Predecessor = Predecessor, Successor = Successor, acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), getInputStream = js.Any.fromFunction0(getInputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), skipBytes = js.Any.fromFunction1(skipBytes))
  
    __obj.asInstanceOf[MarkableInputStream]
  }
}

