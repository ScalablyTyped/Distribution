package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Surface extends StObject {
  
  var surface: Overlay
}
object Surface {
  
  inline def apply(surface: Overlay): Surface = {
    val __obj = js.Dynamic.literal(surface = surface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Surface]
  }
  
  extension [Self <: Surface](x: Self) {
    
    inline def setSurface(value: Overlay): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
  }
}
