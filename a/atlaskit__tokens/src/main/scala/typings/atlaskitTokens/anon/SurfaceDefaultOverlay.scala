package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceDefaultOverlay[BaseToken] extends StObject {
  
  var surface: DefaultOverlay[BaseToken]
}
object SurfaceDefaultOverlay {
  
  inline def apply[BaseToken](surface: DefaultOverlay[BaseToken]): SurfaceDefaultOverlay[BaseToken] = {
    val __obj = js.Dynamic.literal(surface = surface.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceDefaultOverlay[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurfaceDefaultOverlay[?], BaseToken] (val x: Self & SurfaceDefaultOverlay[BaseToken]) extends AnyVal {
    
    inline def setSurface(value: DefaultOverlay[BaseToken]): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
  }
}
