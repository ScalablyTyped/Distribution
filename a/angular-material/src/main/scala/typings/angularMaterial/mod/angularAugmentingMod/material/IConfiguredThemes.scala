package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConfiguredThemes
  extends StObject
     with IThemes
     with /* name */ StringDictionary[ITheme]
object IConfiguredThemes {
  
  inline def apply(default: ITheme): IConfiguredThemes = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguredThemes]
  }
}
