package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to set marks in an outputstream and to later jump back to these marks.
  *
  * The implementation stores the data as long as marks exists and later writes these data into the output stream, that has been set previously at the
  * {@link XActiveDataSource} interface.
  */
trait MarkableOutputStream
  extends XOutputStream
     with XMarkableStream
     with XActiveDataSource
     with XConnectable

object MarkableOutputStream {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: js.Function0[scala.Unit],
    closeOutput: js.Function0[scala.Unit],
    createMark: js.Function0[scala.Double],
    deleteMark: js.Function1[scala.Double, scala.Unit],
    flush: js.Function0[scala.Unit],
    getOutputStream: js.Function0[XOutputStream],
    getPredecessor: js.Function0[XConnectable],
    getSuccessor: js.Function0[XConnectable],
    jumpToFurthest: js.Function0[scala.Unit],
    jumpToMark: js.Function1[scala.Double, scala.Unit],
    offsetToMark: js.Function1[scala.Double, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setOutputStream: js.Function1[XOutputStream, scala.Unit],
    setPredecessor: js.Function1[XConnectable, scala.Unit],
    setSuccessor: js.Function1[XConnectable, scala.Unit],
    writeBytes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): MarkableOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, Predecessor = Predecessor, Successor = Successor, acquire = acquire, closeOutput = closeOutput, createMark = createMark, deleteMark = deleteMark, flush = flush, getOutputStream = getOutputStream, getPredecessor = getPredecessor, getSuccessor = getSuccessor, jumpToFurthest = jumpToFurthest, jumpToMark = jumpToMark, offsetToMark = offsetToMark, queryInterface = queryInterface, release = release, setOutputStream = setOutputStream, setPredecessor = setPredecessor, setSuccessor = setSuccessor, writeBytes = writeBytes)
  
    __obj.asInstanceOf[MarkableOutputStream]
  }
}

