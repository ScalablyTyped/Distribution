package typings.activexLibreoffice.com_.sun.star.style

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specify the alignment of a numbering level. */
trait NumberingAlignment extends StObject {
  
  /** set the alignment from the numbering. Use the {@link com.sun.star.style.HorizontalAlignment} enum to change the alignment. */
  var Alignment: HorizontalAlignment
  
  /** the distance between the numbering symbol and text. */
  var Insertion: Double
  
  /** the minimum distance between the numbering symbol and the following text. */
  var TextMarginDistance: Double
  
  /** the distance between left margin and the numbering symbol. */
  var TextNumberingDistance: Double
}
object NumberingAlignment {
  
  inline def apply(
    Alignment: HorizontalAlignment,
    Insertion: Double,
    TextMarginDistance: Double,
    TextNumberingDistance: Double
  ): NumberingAlignment = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Insertion = Insertion.asInstanceOf[js.Any], TextMarginDistance = TextMarginDistance.asInstanceOf[js.Any], TextNumberingDistance = TextNumberingDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberingAlignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberingAlignment] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: HorizontalAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setInsertion(value: Double): Self = StObject.set(x, "Insertion", value.asInstanceOf[js.Any])
    
    inline def setTextMarginDistance(value: Double): Self = StObject.set(x, "TextMarginDistance", value.asInstanceOf[js.Any])
    
    inline def setTextNumberingDistance(value: Double): Self = StObject.set(x, "TextNumberingDistance", value.asInstanceOf[js.Any])
  }
}
