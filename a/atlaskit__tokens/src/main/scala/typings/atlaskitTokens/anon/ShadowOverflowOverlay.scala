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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowOverflowOverlay[?], BaseToken] (val x: Self & ShadowOverflowOverlay[BaseToken]) extends AnyVal {
    
    inline def setShadow(value: OverflowOverlay[BaseToken]): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
  }
}
