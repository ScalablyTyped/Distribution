package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accent")(accent)
    __obj.updateDynamic("background")(background)
    __obj.updateDynamic("primary")(primary)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[IThemeColors]
  }
}

