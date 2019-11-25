package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeColors extends js.Object {
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
}

