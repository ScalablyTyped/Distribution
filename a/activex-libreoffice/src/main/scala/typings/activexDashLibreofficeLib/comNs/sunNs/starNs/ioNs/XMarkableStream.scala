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
    acquire: js.Function0[scala.Unit],
    createMark: js.Function0[scala.Double],
    deleteMark: js.Function1[scala.Double, scala.Unit],
    jumpToFurthest: js.Function0[scala.Unit],
    jumpToMark: js.Function1[scala.Double, scala.Unit],
    offsetToMark: js.Function1[scala.Double, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMarkableStream = {
    val __obj = js.Dynamic.literal(acquire = acquire, createMark = createMark, deleteMark = deleteMark, jumpToFurthest = jumpToFurthest, jumpToMark = jumpToMark, offsetToMark = offsetToMark, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMarkableStream]
  }
}

