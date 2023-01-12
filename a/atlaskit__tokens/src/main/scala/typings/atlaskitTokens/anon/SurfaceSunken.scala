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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurfaceSunken] (val x: Self) extends AnyVal {
    
    inline def setSurface(value: Sunken): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
  }
}
