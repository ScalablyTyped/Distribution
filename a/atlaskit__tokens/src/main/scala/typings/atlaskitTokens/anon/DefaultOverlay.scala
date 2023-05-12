package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOverlay[BaseToken] extends StObject {
  
  var `[default]`: DefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var overlay: DefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var raised: DefaultPaintTokenHoveredPaintToken[BaseToken]
  
  var sunken: PaintToken[BaseToken]
}
object DefaultOverlay {
  
  inline def apply[BaseToken](
    `[default]`: DefaultPaintTokenHoveredPaintToken[BaseToken],
    overlay: DefaultPaintTokenHoveredPaintToken[BaseToken],
    raised: DefaultPaintTokenHoveredPaintToken[BaseToken],
    sunken: PaintToken[BaseToken]
  ): DefaultOverlay[BaseToken] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any], sunken = sunken.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOverlay[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultOverlay[?], BaseToken] (val x: Self & DefaultOverlay[BaseToken]) extends AnyVal {
    
    inline def setOverlay(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setSunken(value: PaintToken[BaseToken]): Self = StObject.set(x, "sunken", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
