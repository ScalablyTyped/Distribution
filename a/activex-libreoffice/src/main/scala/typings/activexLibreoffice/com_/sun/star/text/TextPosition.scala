package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextPosition extends StObject {
  
  var Paragraph: Double = js.native
  
  var PositionInParagraph: Double = js.native
}
object TextPosition {
  
  @scala.inline
  def apply(Paragraph: Double, PositionInParagraph: Double): TextPosition = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any], PositionInParagraph = PositionInParagraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPosition]
  }
  
  @scala.inline
  implicit class TextPositionMutableBuilder[Self <: TextPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParagraph(value: Double): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionInParagraph(value: Double): Self = StObject.set(x, "PositionInParagraph", value.asInstanceOf[js.Any])
  }
}
