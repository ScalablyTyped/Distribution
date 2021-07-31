package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IThemeColors extends StObject {
  
  var accent: IThemePalette
  
  var background: IThemePalette
  
  var primary: IThemePalette
  
  var warn: IThemePalette
}
object IThemeColors {
  
  @scala.inline
  def apply(accent: IThemePalette, background: IThemePalette, primary: IThemePalette, warn: IThemePalette): IThemeColors = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeColors]
  }
  
  @scala.inline
  implicit class IThemeColorsMutableBuilder[Self <: IThemeColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccent(value: IThemePalette): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: IThemePalette): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: IThemePalette): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: IThemePalette): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
  }
}
