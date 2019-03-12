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
    acquire: () => scala.Unit,
    closeOutput: () => scala.Unit,
    createMark: () => scala.Double,
    deleteMark: scala.Double => scala.Unit,
    flush: () => scala.Unit,
    getOutputStream: () => XOutputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    jumpToFurthest: () => scala.Unit,
    jumpToMark: scala.Double => scala.Unit,
    offsetToMark: scala.Double => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setOutputStream: XOutputStream => scala.Unit,
    setPredecessor: XConnectable => scala.Unit,
    setSuccessor: XConnectable => scala.Unit,
    writeBytes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit
  ): MarkableOutputStream = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, Predecessor = Predecessor, Successor = Successor, acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), flush = js.Any.fromFunction0(flush), getOutputStream = js.Any.fromFunction0(getOutputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setOutputStream = js.Any.fromFunction1(setOutputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), writeBytes = js.Any.fromFunction1(writeBytes))
  
    __obj.asInstanceOf[MarkableOutputStream]
  }
}

