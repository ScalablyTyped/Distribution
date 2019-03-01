package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefineThemeOptions extends js.Object {
  var accent: js.UndefOr[java.lang.String] = js.undefined
  var background: js.UndefOr[java.lang.String] = js.undefined
  var dark: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[java.lang.String] = js.undefined
  var warn: js.UndefOr[java.lang.String] = js.undefined
}

object IDefineThemeOptions {
  @scala.inline
  def apply(
    accent: java.lang.String = null,
    background: java.lang.String = null,
    dark: js.UndefOr[scala.Boolean] = js.undefined,
    primary: java.lang.String = null,
    warn: java.lang.String = null
  ): IDefineThemeOptions = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent)
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[IDefineThemeOptions]
  }
}

