package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceSunken extends StObject {
  
  var surface: Sunken
}
object SurfaceSunken {
  
  inline def apply(surface: Sunken): SurfaceSunken = {
    val __obj = js.Dynamic.literal(surface = surface.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceSunken]
  }
  
  extension [Self <: SurfaceSunken](x: Self) {
    
    inline def setSurface(value: Sunken): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
  }
}
