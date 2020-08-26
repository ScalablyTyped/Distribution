package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set and remove seekable marks to a stream. */
@js.native
trait XMarkableStream extends XInterface {
  /** creates a mark of the current position and returns an identifier to it. */
  def createMark(): Double = js.native
  /**
    * deletes the mark that you previously created with {@link XMarkableStream.createMark()} .
    *
    * It is an error to delete a mark if other marks after this exist. In this case, for reasons of robustness, the implementation must delete this mark and
    * all others after this mark.
    */
  def deleteMark(Mark: Double): Unit = js.native
  /**
    * jumps to the furthest position of the stream.
    *
    * In the inputstream case, a subsequent read call returns data, that was never read or skipped over before. In the outputstream case, a subsequent write
    * call will add new data at the end of the stream without overwriting existing data.
    */
  def jumpToFurthest(): Unit = js.native
  /** jumps to a previously created mark. */
  def jumpToMark(nMark: Double): Unit = js.native
  /**
    * @param nMark identifies the mark which is used as a base to calculate the offset of the current position.
    * @returns the offset from the current stream position to the mark ("current position" - "mark position").
    * @throws IllegalArgumentException if the mark does not exist or is deleted.
    * @throws IOException if an I/O error has occurred.
    */
  def offsetToMark(nMark: Double): Double = js.native
}

object XMarkableStream {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createMark: () => Double,
    deleteMark: Double => Unit,
    jumpToFurthest: () => Unit,
    jumpToMark: Double => Unit,
    offsetToMark: Double => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMarkableStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMarkableStream]
  }
  @scala.inline
  implicit class XMarkableStreamOps[Self <: XMarkableStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateMark(value: () => Double): Self = this.set("createMark", js.Any.fromFunction0(value))
    @scala.inline
    def setDeleteMark(value: Double => Unit): Self = this.set("deleteMark", js.Any.fromFunction1(value))
    @scala.inline
    def setJumpToFurthest(value: () => Unit): Self = this.set("jumpToFurthest", js.Any.fromFunction0(value))
    @scala.inline
    def setJumpToMark(value: Double => Unit): Self = this.set("jumpToMark", js.Any.fromFunction1(value))
    @scala.inline
    def setOffsetToMark(value: Double => Double): Self = this.set("offsetToMark", js.Any.fromFunction1(value))
  }
  
}

