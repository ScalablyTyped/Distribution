package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPosition extends StObject {
  
  var Paragraph: Double
  
  var PositionInParagraph: Double
}
object TextPosition {
  
  inline def apply(Paragraph: Double, PositionInParagraph: Double): TextPosition = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any], PositionInParagraph = PositionInParagraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextPosition] (val x: Self) extends AnyVal {
    
    inline def setParagraph(value: Double): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
    
    inline def setPositionInParagraph(value: Double): Self = StObject.set(x, "PositionInParagraph", value.asInstanceOf[js.Any])
  }
}
