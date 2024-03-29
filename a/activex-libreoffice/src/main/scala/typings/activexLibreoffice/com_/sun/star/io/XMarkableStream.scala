package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to set and remove seekable marks to a stream. */
trait XMarkableStream
  extends StObject
     with XInterface {
  
  /** creates a mark of the current position and returns an identifier to it. */
  def createMark(): Double
  
  /**
    * deletes the mark that you previously created with {@link XMarkableStream.createMark()} .
    *
    * It is an error to delete a mark if other marks after this exist. In this case, for reasons of robustness, the implementation must delete this mark and
    * all others after this mark.
    */
  def deleteMark(Mark: Double): Unit
  
  /**
    * jumps to the furthest position of the stream.
    *
    * In the inputstream case, a subsequent read call returns data, that was never read or skipped over before. In the outputstream case, a subsequent write
    * call will add new data at the end of the stream without overwriting existing data.
    */
  def jumpToFurthest(): Unit
  
  /** jumps to a previously created mark. */
  def jumpToMark(nMark: Double): Unit
  
  /**
    * @param nMark identifies the mark which is used as a base to calculate the offset of the current position.
    * @returns the offset from the current stream position to the mark ("current position" - "mark position").
    * @throws IllegalArgumentException if the mark does not exist or is deleted.
    * @throws IOException if an I/O error has occurred.
    */
  def offsetToMark(nMark: Double): Double
}
object XMarkableStream {
  
  inline def apply(
    acquire: () => Unit,
    createMark: () => Double,
    deleteMark: Double => Unit,
    jumpToFurthest: () => Unit,
    jumpToMark: Double => Unit,
    offsetToMark: Double => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XMarkableStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createMark = js.Any.fromFunction0(createMark), deleteMark = js.Any.fromFunction1(deleteMark), jumpToFurthest = js.Any.fromFunction0(jumpToFurthest), jumpToMark = js.Any.fromFunction1(jumpToMark), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMarkableStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XMarkableStream] (val x: Self) extends AnyVal {
    
    inline def setCreateMark(value: () => Double): Self = StObject.set(x, "createMark", js.Any.fromFunction0(value))
    
    inline def setDeleteMark(value: Double => Unit): Self = StObject.set(x, "deleteMark", js.Any.fromFunction1(value))
    
    inline def setJumpToFurthest(value: () => Unit): Self = StObject.set(x, "jumpToFurthest", js.Any.fromFunction0(value))
    
    inline def setJumpToMark(value: Double => Unit): Self = StObject.set(x, "jumpToMark", js.Any.fromFunction1(value))
    
    inline def setOffsetToMark(value: Double => Double): Self = StObject.set(x, "offsetToMark", js.Any.fromFunction1(value))
  }
}
