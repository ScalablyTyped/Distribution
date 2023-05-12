package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDefaultPaintTokenHoveredPaintToken[BaseToken] extends StObject {
  
  var `[default]`: DefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var bold: DefaultPaintTokenHoveredPaintToken[BaseToken]
}
object DefaultDefaultPaintTokenHoveredPaintToken {
  
  inline def apply[BaseToken](
    `[default]`: DefaultPaintTokenHoveredPaintToken[BaseToken],
    bold: DefaultPaintTokenHoveredPaintToken[BaseToken]
  ): DefaultDefaultPaintTokenHoveredPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultDefaultPaintTokenHoveredPaintToken[?], BaseToken] (val x: Self & DefaultDefaultPaintTokenHoveredPaintToken[BaseToken]) extends AnyVal {
    
    inline def setBold(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
