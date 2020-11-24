package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeColors extends js.Object {
  
  var accent: IThemePalette = js.native
  
  var background: IThemePalette = js.native
  
  var primary: IThemePalette = js.native
  
  var warn: IThemePalette = js.native
}
object IThemeColors {
  
  @scala.inline
  def apply(accent: IThemePalette, background: IThemePalette, primary: IThemePalette, warn: IThemePalette): IThemeColors = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeColors]
  }
  
  @scala.inline
  implicit class IThemeColorsOps[Self <: IThemeColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccent(value: IThemePalette): Self = this.set("accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: IThemePalette): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: IThemePalette): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: IThemePalette): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
