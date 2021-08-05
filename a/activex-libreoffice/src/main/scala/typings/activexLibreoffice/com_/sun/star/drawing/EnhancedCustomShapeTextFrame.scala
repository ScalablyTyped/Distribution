package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the coordinates used with EnhancedCustomShapes */
trait EnhancedCustomShapeTextFrame extends StObject {
  
  var BottomRight: EnhancedCustomShapeParameterPair
  
  var TopLeft: EnhancedCustomShapeParameterPair
}
object EnhancedCustomShapeTextFrame {
  
  inline def apply(BottomRight: EnhancedCustomShapeParameterPair, TopLeft: EnhancedCustomShapeParameterPair): EnhancedCustomShapeTextFrame = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeTextFrame]
  }
  
  extension [Self <: EnhancedCustomShapeTextFrame](x: Self) {
    
    inline def setBottomRight(value: EnhancedCustomShapeParameterPair): Self = StObject.set(x, "BottomRight", value.asInstanceOf[js.Any])
    
    inline def setTopLeft(value: EnhancedCustomShapeParameterPair): Self = StObject.set(x, "TopLeft", value.asInstanceOf[js.Any])
  }
}
