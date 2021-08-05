package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IThemes extends StObject {
  
  var default: ITheme
}
object IThemes {
  
  inline def apply(default: ITheme): IThemes = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemes]
  }
  
  extension [Self <: IThemes](x: Self) {
    
    inline def setDefault(value: ITheme): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
