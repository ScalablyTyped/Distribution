package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IThemePalette extends StObject {
  
  var hues: IThemeHues
  
  var name: String
}
object IThemePalette {
  
  @scala.inline
  def apply(hues: IThemeHues, name: String): IThemePalette = {
    val __obj = js.Dynamic.literal(hues = hues.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemePalette]
  }
  
  @scala.inline
  implicit class IThemePaletteMutableBuilder[Self <: IThemePalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHues(value: IThemeHues): Self = StObject.set(x, "hues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
