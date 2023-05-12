package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldDefaultPaintTokenHoveredPaintToken[BaseToken] extends StObject {
  
  var `[default]`: DefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var bold: DefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var subtle: DefaultPaintTokenHoveredPaintToken[BaseToken]
}
object BoldDefaultPaintTokenHoveredPaintToken {
  
  inline def apply[BaseToken](
    `[default]`: DefaultPaintTokenHoveredPaintToken[BaseToken],
    bold: DefaultPaintTokenHoveredPaintToken[BaseToken],
    subtle: DefaultPaintTokenHoveredPaintToken[BaseToken]
  ): BoldDefaultPaintTokenHoveredPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldDefaultPaintTokenHoveredPaintToken[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoldDefaultPaintTokenHoveredPaintToken[?], BaseToken] (val x: Self & BoldDefaultPaintTokenHoveredPaintToken[BaseToken]) extends AnyVal {
    
    inline def setBold(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
