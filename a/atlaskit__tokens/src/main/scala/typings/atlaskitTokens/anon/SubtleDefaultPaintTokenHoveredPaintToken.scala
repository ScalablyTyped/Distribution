package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtleDefaultPaintTokenHoveredPaintToken[BaseToken] extends StObject {
  
  var subtle: DefaultPaintTokenHoveredPaintToken[BaseToken]
}
object SubtleDefaultPaintTokenHoveredPaintToken {
  
  inline def apply[BaseToken](subtle: DefaultPaintTokenHoveredPaintToken[BaseToken]): SubtleDefaultPaintTokenHoveredPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtleDefaultPaintTokenHoveredPaintToken[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtleDefaultPaintTokenHoveredPaintToken[?], BaseToken] (val x: Self & SubtleDefaultPaintTokenHoveredPaintToken[BaseToken]) extends AnyVal {
    
    inline def setSubtle(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
