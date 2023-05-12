package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.ShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Raised extends StObject {
  
  var overflow: Spread
  
  var overlay: ShadowToken[BaseToken]
  
  var raised: ShadowToken[BaseToken]
}
object Raised {
  
  inline def apply(overflow: Spread, overlay: ShadowToken[BaseToken], raised: ShadowToken[BaseToken]): Raised = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any])
    __obj.asInstanceOf[Raised]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Raised] (val x: Self) extends AnyVal {
    
    inline def setOverflow(value: Spread): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: ShadowToken[BaseToken]): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
  }
}
