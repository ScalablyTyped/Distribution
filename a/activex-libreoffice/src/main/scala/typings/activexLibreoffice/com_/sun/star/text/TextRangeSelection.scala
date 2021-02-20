package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextRangeSelection extends StObject {
  
  var End: TextPosition = js.native
  
  var Start: TextPosition = js.native
}
object TextRangeSelection {
  
  @scala.inline
  def apply(End: TextPosition, Start: TextPosition): TextRangeSelection = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRangeSelection]
  }
  
  @scala.inline
  implicit class TextRangeSelectionMutableBuilder[Self <: TextRangeSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: TextPosition): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: TextPosition): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
