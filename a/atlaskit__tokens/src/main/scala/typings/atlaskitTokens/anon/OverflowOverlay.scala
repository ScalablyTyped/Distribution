package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.ShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowOverlay[BaseToken] extends StObject {
  
  var overflow: DefaultPerimeter[BaseToken]
  
  var overlay: ShadowToken[BaseToken]
  
  var raised: ShadowToken[BaseToken]
}
object OverflowOverlay {
  
  inline def apply[BaseToken](
    overflow: DefaultPerimeter[BaseToken],
    overlay: ShadowToken[BaseToken],
    raised: ShadowToken[BaseToken]
  ): OverflowOverlay[BaseToken] = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], raised = raised.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowOverlay[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverflowOverlay[?], BaseToken] (val x: Self & OverflowOverlay[BaseToken]) extends AnyVal {
    
    inline def setOverflow(value: DefaultPerimeter[BaseToken]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setRaised(value: ShadowToken[BaseToken]): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
  }
}
