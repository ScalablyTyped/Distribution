package typings.atlaskitTokens.anon

import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOverlay[BaseToken] extends StObject {
  
  var `[default]`: DefaultHoveredPressed[BaseToken]
  
  var overlay: DefaultHoveredPressed[BaseToken]
  
  var raised: DefaultHoveredPressed[BaseToken]
  
  var sunken: PaintToken[BaseToken]
}
object DefaultOverlay {
  
  inline def apply[BaseToken](
    `[default]`: DefaultHoveredPressed[BaseToken],
    overlay: DefaultHoveredPressed[BaseToken],
    raised: DefaultHoveredPressed[BaseToken],
    sunken: PaintToken[BaseToken]
  ): DefaultOverlay[BaseToken] = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any], sunken = sunken.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOverlay[BaseToken]]
  }
  
  extension [Self <: DefaultOverlay[?], BaseToken](x: Self & DefaultOverlay[BaseToken]) {
    
    inline def setOverlay(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setSunken(value: PaintToken[BaseToken]): Self = StObject.set(x, "sunken", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: DefaultHoveredPressed[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
