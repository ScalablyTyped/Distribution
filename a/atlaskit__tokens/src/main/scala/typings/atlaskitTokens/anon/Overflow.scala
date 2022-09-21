package typings.atlaskitTokens.anon

import typings.atlaskitTokens.palettesPaletteMod.BaseToken
import typings.atlaskitTokens.typesTypesMod.ShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overflow extends StObject {
  
  var overflow: ShadowToken[BaseToken]
  
  var overlay: ShadowToken[BaseToken]
  
  var raised: ShadowToken[BaseToken]
}
object Overflow {
  
  inline def apply(overflow: ShadowToken[BaseToken], overlay: ShadowToken[BaseToken], raised: ShadowToken[BaseToken]): Overflow = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overflow]
  }
  
  extension [Self <: Overflow](x: Self) {
    
    inline def setOverflow(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: ShadowToken[BaseToken]): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
  }
}
