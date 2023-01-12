package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverPaintTokenRestingPaintToken[BaseToken] extends StObject {
  
  var hover: PaintToken[BaseToken]
  
  var resting: PaintToken[BaseToken]
}
object HoverPaintTokenRestingPaintToken {
  
  inline def apply[BaseToken](hover: PaintToken[BaseToken], resting: PaintToken[BaseToken]): HoverPaintTokenRestingPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], resting = resting.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverPaintTokenRestingPaintToken[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoverPaintTokenRestingPaintToken[?], BaseToken] (val x: Self & HoverPaintTokenRestingPaintToken[BaseToken]) extends AnyVal {
    
    inline def setHover(value: PaintToken[BaseToken]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setResting(value: PaintToken[BaseToken]): Self = StObject.set(x, "resting", value.asInstanceOf[js.Any])
  }
}
