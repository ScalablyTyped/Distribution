package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InverseHoveredPaintTokenPressedPaintToken extends StObject {
  
  var inverse: HoveredPaintTokenPressedPaintToken
}
object InverseHoveredPaintTokenPressedPaintToken {
  
  inline def apply(inverse: HoveredPaintTokenPressedPaintToken): InverseHoveredPaintTokenPressedPaintToken = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[InverseHoveredPaintTokenPressedPaintToken]
  }
  
  extension [Self <: InverseHoveredPaintTokenPressedPaintToken](x: Self) {
    
    inline def setInverse(value: HoveredPaintTokenPressedPaintToken): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
  }
}
