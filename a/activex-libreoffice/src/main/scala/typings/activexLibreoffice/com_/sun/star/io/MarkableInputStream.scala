package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
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
    acquire: () => Unit,
    available: () => Double,
    closeInput: () => Unit,
    createMark: () => Double,
    deleteMark: Double => Unit,
    getInputStream: () => XInputStream,
    getPredecessor: () => XConnectable,
    getSuccessor: () => XConnectable,
    jumpToFurthest: () => Unit,
    jumpToMark: Double => Unit,
    offsetToMark: Double => Double,
    queryInterface: `type` => js.Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: () => Unit,
    setInputStream: XInputStream => Unit,
    setPredecessor: XConnectable => Unit,
    setSuccessor: XConnectable => Unit,
    skipBytes: Double => Unit
  ): MarkableInputStream = {
    val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), available = js.Any.fromFunction0(available), closeInput = js.Any.fromFunction0(closeInput), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), getInputStream = js.Any.fromFunction0(getInputStream), getPredecessor = js.Any.fromFunction0(getPredecessor), getSuccessor = js.Any.fromFunction0(getSuccessor), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = js.Any.fromFunction0(release), setInputStream = js.Any.fromFunction1(setInputStream), setPredecessor = js.Any.fromFunction1(setPredecessor), setSuccessor = js.Any.fromFunction1(setSuccessor), skipBytes = js.Any.fromFunction1(skipBytes))
    __obj.asInstanceOf[MarkableInputStream]
  }
}

