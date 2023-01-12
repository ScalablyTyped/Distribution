package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.ShadowOverflowOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowTokenSchema[BaseToken] extends StObject {
  
  var elevation: ShadowOverflowOverlay[BaseToken]
}
object ShadowTokenSchema {
  
  inline def apply[BaseToken](elevation: ShadowOverflowOverlay[BaseToken]): ShadowTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowTokenSchema[?], BaseToken] (val x: Self & ShadowTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setElevation(value: ShadowOverflowOverlay[BaseToken]): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
  }
}
