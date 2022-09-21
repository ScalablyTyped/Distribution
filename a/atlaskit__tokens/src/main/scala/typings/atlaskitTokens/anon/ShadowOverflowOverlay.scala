package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowOverflowOverlay[BaseToken] extends StObject {
  
  var shadow: OverflowOverlay[BaseToken]
}
object ShadowOverflowOverlay {
  
  inline def apply[BaseToken](shadow: OverflowOverlay[BaseToken]): ShadowOverflowOverlay[BaseToken] = {
    val __obj = js.Dynamic.literal(shadow = shadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowOverflowOverlay[BaseToken]]
  }
  
  extension [Self <: ShadowOverflowOverlay[?], BaseToken](x: Self & ShadowOverflowOverlay[BaseToken]) {
    
    inline def setShadow(value: OverflowOverlay[BaseToken]): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
  }
}
