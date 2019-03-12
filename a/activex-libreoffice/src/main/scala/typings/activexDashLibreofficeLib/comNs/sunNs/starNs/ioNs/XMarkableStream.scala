package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set and remove seekable marks to a stream. */
trait XMarkableStream
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** creates a mark of the current position and returns an identifier to it. */
  def createMark(): scala.Double
  /**
    * deletes the mark that you previously created with {@link XMarkableStream.createMark()} .
    *
    * It is an error to delete a mark if other marks after this exist. In this case, for reasons of robustness, the implementation must delete this mark and
    * all others after this mark.
    */
  def deleteMark(Mark: scala.Double): scala.Unit
  /**
    * jumps to the furthest position of the stream.
    *
    * In the inputstream case, a subsequent read call returns data, that was never read or skipped over before. In the outputstream case, a subsequent write
    * call will add new data at the end of the stream without overwriting existing data.
    */
  def jumpToFurthest(): scala.Unit
  /** jumps to a previously created mark. */
  def jumpToMark(nMark: scala.Double): scala.Unit
  /**
    * @param nMark identifies the mark which is used as a base to calculate the offset of the current position.
    * @returns the offset from the current stream position to the mark ("current position" - "mark position").
    * @throws IllegalArgumentException if the mark does not exist or is deleted.
    * @throws IOException if an I/O error has occurred.
    */
  def offsetToMark(nMark: scala.Double): scala.Double
}

object XMarkableStream {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createMark: () => scala.Double,
    deleteMark: scala.Double => scala.Unit,
    jumpToFurthest: () => scala.Unit,
    jumpToMark: scala.Double => scala.Unit,
    offsetToMark: scala.Double => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMarkableStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMarkableStream]
  }
}

