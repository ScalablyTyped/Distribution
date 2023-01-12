package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRangeSelection extends StObject {
  
  var End: TextPosition
  
  var Start: TextPosition
}
object TextRangeSelection {
  
  inline def apply(End: TextPosition, Start: TextPosition): TextRangeSelection = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRangeSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextRangeSelection] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: TextPosition): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setStart(value: TextPosition): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
