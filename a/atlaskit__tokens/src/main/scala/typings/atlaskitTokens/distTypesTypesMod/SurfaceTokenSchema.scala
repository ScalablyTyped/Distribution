package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.SurfaceDefaultOverlay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceTokenSchema[BaseToken] extends StObject {
  
  var elevation: SurfaceDefaultOverlay[BaseToken]
}
object SurfaceTokenSchema {
  
  inline def apply[BaseToken](elevation: SurfaceDefaultOverlay[BaseToken]): SurfaceTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurfaceTokenSchema[?], BaseToken] (val x: Self & SurfaceTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setElevation(value: SurfaceDefaultOverlay[BaseToken]): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
  }
}
