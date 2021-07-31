package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains start and end position of a word.
  *
  * It is used in word break iterator and text conversion.
  * @see XBreakIterator
  * @see XTextConversion
  */
trait Boundary extends StObject {
  
  var endPos: Double
  
  var startPos: Double
}
object Boundary {
  
  @scala.inline
  def apply(endPos: Double, startPos: Double): Boundary = {
    val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundary]
  }
  
  @scala.inline
  implicit class BoundaryMutableBuilder[Self <: Boundary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPos(value: Double): Self = StObject.set(x, "endPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPos(value: Double): Self = StObject.set(x, "startPos", value.asInstanceOf[js.Any])
  }
}
